package com.example.demo.AnimalsAPI.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.AnimalsAPI.data.Animals;
import com.example.demo.AnimalsAPI.service.AnimalsAPIService;

@Controller
public class AnimalsAPIController {

	private final AnimalsAPIService animalsAPIService;

	public AnimalsAPIController(AnimalsAPIService animalsAPIService) {
		this.animalsAPIService = animalsAPIService;
	}

	@GetMapping("/animalsAPI_search")
	public String getPets(Model model) throws IOException {

		List<Animals> animalsList = animalsAPIService.getAnimals();

		model.addAttribute("animalsList", animalsList);

		return "animalsAPI_search.html";

	}

	@PostMapping("/animalsAPI_result")
	public String postPet(@RequestParam(value = "selectId") int getId, Model model) throws IOException {

		List<Animals> animalResult = animalsAPIService.getAnimalResult(getId);

		model.addAttribute("animalResult", animalResult);

		return "animalsAPI_result.html";

	}

}
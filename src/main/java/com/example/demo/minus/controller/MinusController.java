package com.example.demo.minus.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.minus.service.MinusService;

@Controller
@RequestMapping
public class MinusController {

	private final MinusService minusService;

	@Autowired
	public MinusController(MinusService minusService) {
		this.minusService = minusService;
	}

	@GetMapping("minus")
	public String minusGet() {
		return "minus.html";
	}

	@PostMapping("minusCalculation")
	@ResponseBody
	public String minusPost(@RequestParam int inputNumber01, @RequestParam int inputNumber02) {

		String result = "";

		result = String.valueOf(minusService.minus(inputNumber01, inputNumber02));

		return result;
	}
}
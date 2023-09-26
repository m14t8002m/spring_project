package com.example.demo.calculator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.calculator.service.CalculatorService;

@Controller
@RequestMapping
public class CalculatorController {

	private final CalculatorService calculatorService;

	@Autowired
	public CalculatorController(CalculatorService calculatorService) {
		this.calculatorService = calculatorService;
	}

	@GetMapping("calculator")
	public String calculatorGet() {
		return "calculator.html";
	}

	@PostMapping("calculation")
	@ResponseBody
	public String calculatorPost(@RequestParam int inputNumber01, @RequestParam int inputNumber02, @RequestParam String sign) {

		String result = "";

		result = String.valueOf(calculatorService.calculator(inputNumber01, inputNumber02, sign));

		return result;
	}
}
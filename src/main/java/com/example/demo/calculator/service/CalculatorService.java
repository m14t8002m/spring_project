package com.example.demo.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

	public int calculator(int getNumber01, int getNumber02, String sing) {

		int result = 0;

		switch (sing) {
		case "plus":
			result = getNumber01 + getNumber02;
			break;
		case "minus":
			result = getNumber01 - getNumber02;
			break;
		case "multi":
			result = getNumber01 * getNumber02;
			break;
		case "divid":
			result = getNumber01 / getNumber02;
			break;
		}

		return result;

	}

}
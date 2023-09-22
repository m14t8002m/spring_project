package com.example.demo.fizzBuzz;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public String fizzBuzz(int getNumber) {

		String result = "";

		if (getNumber % 3 == 0 && getNumber % 5 == 0) {
			result = "FizzBuzz";
		} else if (getNumber % 3 == 0) {
			result = "Fizz";
		} else if (getNumber % 5 == 0) {
			result = "Buzz";
		} else {
			result = Integer.valueOf(getNumber).toString();
		}
		return result;

	}

}
package com.example.demo.fizzBuzz.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class FizzBuzzService {

	public List<String> fizzBuzz(int getNumberStart, int getNumberEnd) {

		List<String> result = new ArrayList<>();

		for (int i = getNumberStart; i <= getNumberEnd; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				result.add("FizzBuzz");
			} else if (i % 3 == 0) {
				result.add("Fizz");
			} else if (i % 5 == 0) {
				result.add("Buzz");
			} else {
				result.add(Integer.valueOf(i).toString());
			}
		}

		return result;

	}

}
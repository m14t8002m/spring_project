package com.example.demo.minus.service;

import org.springframework.stereotype.Service;

@Service
public class MinusService {

	public int minus(int getNumber01, int getNumber02) {

		int result = getNumber01 - getNumber02;

		return result;

	}

}
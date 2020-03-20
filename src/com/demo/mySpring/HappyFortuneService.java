package com.demo.mySpring;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
	
	String[] arr = {"FortuneService from happy one",
			"FortuneService from happy two",
			"FortuneService from happy three"
	};
	
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		System.out.println("HappyFortuneService: Inside getFortune method.");
		int index = myRandom.nextInt(arr.length);
		String result = arr[index];
		return result;
	}

}

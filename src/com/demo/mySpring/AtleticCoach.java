package com.demo.mySpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AtleticCoach implements Coach {
	
	private FortuneService fortuneService;
	@Value("${address}")	
	private String address;
	@Value("${name}")
	private String name;
	
	public AtleticCoach(FortuneService theFortuneService) {
		System.out.println("AtleticCoach: Inside the constructor.");
		fortuneService = theFortuneService;
	}
	
	public String getAddress() {
		return address;
	}

	public String getName() {
		return name;
	}

	@Override
	public String getDailyWorkout() {
		return "Do 15 pull ups and run every day to be a good atletic";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

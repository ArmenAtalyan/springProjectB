package com.demo.mySpring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	@Value("${email}")
	private String email;
	@Value("${team}")
	private String team;
	
	public SwimCoach(FortuneService theFortuneService) {
		System.out.println("SwimCoach: inside constructor.");
		fortuneService = theFortuneService;
	}
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	@Override
	public String getDailyWorkout() {
		return "Lets swim every day 5 hours";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}

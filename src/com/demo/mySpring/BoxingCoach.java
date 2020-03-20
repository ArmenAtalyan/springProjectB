package com.demo.mySpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BoxingCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public BoxingCoach() {
		System.out.println("BoxingCoach: Inside default constructor.");
	}
	
	// injection with the constructor
//	@Autowired
//	public BoxingCoach(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	public FortuneService getFortuneService() {
		return fortuneService;
	}

//	injection with the setter
	@Autowired
	@Qualifier("fileFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("BoxingCoach: Inside setFortuneService method.");
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Lets boxing every day for 5 hours.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}

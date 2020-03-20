package com.demo.mySpring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	public TennisCoach() {
		System.out.println("TennisCoach: Inside default constructor.");
	}
	
	// define my init method
	@PostConstruct
	public void initCoach() {
		System.out.println("TennisCoach: Initialization the bean.");
	}
	
	// define my destroy method
	@PreDestroy
	public void destroyCoach() {
		System.out.println("TennisCoach: Inside destroy method.");
	}
	
//	@Autowired
//	public TennisCoach(FortuneService fortuneService) {
//		System.out.println("Inside TennisCoach constructor.");
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void doSomething(FortuneService theFortuneService) {
//		System.out.println("TennisCoach: Inside doSomething method.");
//		fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		return "Lets training tennis every weekend.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

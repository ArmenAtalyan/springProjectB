package com.demo.mySpring;

import org.springframework.stereotype.Component;

@Component
public class AtleticFortuneService implements FortuneService {
	
	public AtleticFortuneService() {
		System.out.println("AtleticFortuneService: Inside the empty constructor.");
	}

	@Override
	public String getFortune() {
		return "This is a happy day for all atlets";
	}

}

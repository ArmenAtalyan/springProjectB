package com.demo.mySpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AtleticSportMain {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(AtleticSportConfig.class);
		AtleticCoach coach = context.getBean("atleticCoach", AtleticCoach.class);
		
		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());
		System.out.println(coach.getName());
		System.out.println(coach.getAddress());
		
		context.close();
	}

}

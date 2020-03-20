package com.demo.mySpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ValuesConfigMain {

	public static void main(String[] args) {
		
		// read spring configuration file
		AnnotationConfigApplicationContext context = 
		new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call other method on the bean
		System.out.println(theCoach.getDailyFortune());
		
		// call email and team from config file
		System.out.println("team: " + theCoach.getTeam());
		System.out.println("email: " + theCoach.getEmail());
		
		// close spring container
		context.close();
	}

}

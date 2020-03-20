package com.demo.mySpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigSwimTennisMain {

	public static void main(String[] args) {
		
		// read spring configuration file
		AnnotationConfigApplicationContext context = 
		new AnnotationConfigApplicationContext(SportConfig.class);
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("swimCoach", Coach.class);
		
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// call other method on the bean
		System.out.println(theCoach.getDailyFortune());
		
		// close spring container
		context.close();
	}

}

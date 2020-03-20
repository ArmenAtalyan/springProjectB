package com.demo.mySpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMain {

	public static void main(String[] args) {
		
		// read spring configuration file
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach otherCoach = context.getBean("boxingCoach", Coach.class);
		
		// call method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(otherCoach.getDailyWorkout());
		
		// call other method on the bean
		System.out.println(theCoach.getDailyFortune());
		System.out.println(otherCoach.getDailyFortune());
		
		// close spring container
		context.close();
	}

}

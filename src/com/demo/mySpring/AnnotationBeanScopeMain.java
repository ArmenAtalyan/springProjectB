package com.demo.mySpring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeMain {

	public static void main(String[] args) {
		
		// load spring configuration file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		
		// check if they are the same
		System.out.println(theCoach.getDailyFortune());
		System.out.println(theCoach.getDailyWorkout());
		
		// close spring context
		context.close();
	}

}

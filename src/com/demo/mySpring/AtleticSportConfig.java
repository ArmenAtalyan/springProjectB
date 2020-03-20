package com.demo.mySpring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
//@ComponentScan("com.demo.mySpring")
@PropertySource("classpath:atleticSport.properties")
public class AtleticSportConfig {
	
	@Bean
	public FortuneService atleticFortuneService() {
		return new AtleticFortuneService();
	}
	
	@Bean
	public Coach atleticCoach() {
		AtleticCoach coach = new AtleticCoach(atleticFortuneService());
		return coach;
	}
}

package com.demo.mySpring;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private List<String> fortunes;
	private Random myRandom = new Random();
	
	public FileFortuneService(){
		System.out.println("FileFortuneService: Inside constructor.");
		fortunes = new ArrayList<>();
		 try(BufferedReader br = new BufferedReader(new FileReader("E:/Armen/myTest.txt"))){
		     String str = null;
		 	while ((str = br.readLine()) != null) {
				fortunes.add(str);
			}
		 }catch(IOException e) {
			 e.printStackTrace();
		 }
	}
	
	@Override
	@PostConstruct
	public String getFortune() {
		System.out.println("FileFortuneService: Inside getFortune method its postconstruct.");
		int index = myRandom.nextInt(fortunes.size());
		String result = fortunes.get(index);
		return result;
	}
	
	@PreDestroy
	public void destroyFortun() {
		System.out.println("FileFortuneCoach: Inside destroy method.");
	}
}

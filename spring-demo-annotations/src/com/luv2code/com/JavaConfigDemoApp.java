package com.luv2code.com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {
	
	public static void main(String args[]){
		//read the spring config file
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(SportConfig.class);
		
		//get the bean from spring container
		Coach theCoach= context.getBean("tennisCoach",Coach.class);
		
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		FootballCoach f =context.getBean("footballCoach",FootballCoach.class); 
		
		System.out.println(f.getEmail());
		
		System.out.println(f.getTeam());
		
		
		context.close();
	}
	
	
}

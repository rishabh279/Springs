package com.luv2code.com;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanAnnotationsDemoApp {

	public static void main(String[] args) {
		
		//load the config file from the spring container
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	
		//get the beans from the container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		
		/*
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		
		boolean result=theCoach==alphaCoach;
		
		System.out.println(result);
		*/
		
		context.close();
		
	}
}

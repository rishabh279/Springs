package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemo {
	public static void main(String args[]){
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//get the beans from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach theCoach2 = context.getBean("myCoach",Coach.class);
		
		boolean result=(theCoach==theCoach2);
		
		System.out.println(result);
		
	}
}

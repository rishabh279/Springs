package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {
	public static void main(String args[]) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"beanLifeCycle-applicationContext.xml");

		// get beans from the container
		Coach coach = context.getBean("myCoach", Coach.class);

		context.close();
	}
}

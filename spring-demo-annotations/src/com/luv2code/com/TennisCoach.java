package com.luv2code.com;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component("myCoach")
@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@PostConstruct
	public void doMyStartupStuff(){
		System.out.println("StartupStuff");
	}
	
	@PreDestroy
	public void doMyCleanupStuff(){
		System.out.println("CleanupStuff");
	}
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	/*
	@Autowired
	TennisCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}*/
	
	/*
	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	*/
	/*
	@Autowired
	public void stuffSettingFortune(FortuneService fortuneService){
		this.fortuneService=fortuneService;
	}*/
	@Override
	public String getDailyWorkout() {
		return "Tennis Practise Daily 30min";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
	
	
	
}

package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	BaseballCoach(){
		
	}
	BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}

	public String getFortuneService() {
		return fortuneService.getFortune();
	}
	
	//init method
	public void doMyStartupStuff(){
		System.out.println("Startup");
	}
	
	//destroy method
	public void doMyCleanupStuff(){
		System.out.println("Destroy");
	}
}

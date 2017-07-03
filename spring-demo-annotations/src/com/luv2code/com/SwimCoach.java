package com.luv2code.com;

public class SwimCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimCoach(FortuneService fortuneService){
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
	
		return "swim 100 meters";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}

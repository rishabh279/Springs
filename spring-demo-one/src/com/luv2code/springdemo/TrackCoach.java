package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(){
		
	}
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just do it"+fortuneService.getFortune();
	}
	
	//add an init method
	public void doMyStartupStuff(){
		System.out.println("Startup Stuff");
	}
	
	//add an destroy method
	public void doMyCleanupStuff(){
		System.out.println("Cleanup Stuff");

	}
	

}

package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	private String email;
	private String team;
	
	
	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void setFortuneService(FortuneService fortuneservice){
		this.fortuneService=fortuneservice;
	}

	@Override
	public String getDailyWorkout() {
	
		return "Practice batting first";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
		
	}
	
}

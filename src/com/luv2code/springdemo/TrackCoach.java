package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	//update the TrackCoach to use the FortuneService
	private FortuneService fortuneService;
	
	public TrackCoach() {
		
	}

	//create constructor injection
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do It: " + fortuneService.getFortune();
	}

}

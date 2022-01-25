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
	
	//add an init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	
	//add a destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}

}

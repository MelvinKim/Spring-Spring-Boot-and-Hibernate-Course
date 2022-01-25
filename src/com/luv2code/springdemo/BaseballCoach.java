package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	//1.define a private field for the dependency
	private FortuneService fortuneService;
	
	//2.define a constructor for dependency injection
	public BaseballCoach (FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practise";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	
}


//implements -> for interfaces
//extends -> for inheritances
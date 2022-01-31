package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	@Autowired    //--> will inject a fortuneService implementation into this class
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	//create a default constructor
	public TennisCoach() {
		System.out.println(">> TennisCoach: Inside default constructor");
	}
	
	//define a setter method for setter injection
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">> TennisCoach: Inside doSomeCrazyStuff() method");
		fortuneService = theFortuneService;
	}
	*/
	
	/* --> used this to learn about constructor injection
	@Autowired
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/
	
	//define my init method
	@PostConstruct
	public void doMyStartup() {
		System.out.println(">>>TennisCoach: Inside doMyStartupStuff()");
	}
	
	@PreDestroy
	public void doMyCleanupStuff() {
		System.out.println(">>> TennisCoach: Inside domyCleanupStuff()");
	}
	
	//define my destroy method

	@Override
	public String getDailyWorkout() {
		return "Practise your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

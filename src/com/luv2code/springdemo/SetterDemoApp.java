package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
	
		//1.load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//2.retrieve the bean
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//3.call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//call the new methods to get the values
		System.out.println("email: " + theCoach.getEmailAddress());
		System.out.println("team: " + theCoach.getTeam());
		
		//4.close the context
		context.close();
	}

}

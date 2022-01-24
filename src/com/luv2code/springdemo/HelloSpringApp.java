package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load Spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from the Spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//now that i have the bean, i will call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//close application context
		context.close();
	}

}



package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		//get the beans
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);
		
		//check to see if these are the same beans
		boolean result = (theCoach == alphaCoach);
		//print the results
		System.out.println("\nPointing to the same object: " + result);
		//print the memory locations for the beans
		System.out.println("Memory location for theCoach: " + theCoach);
		System.out.println("Memory location for alphaCoach: " + alphaCoach + "\n");
		
		//call the methods
		
		//close the application context
		context.close();
	}

}
/*
 * Scope 
 * - default is singleton => single instance of a bean is created
 * - prototype => different instance is created for each request by the Spring container
 */

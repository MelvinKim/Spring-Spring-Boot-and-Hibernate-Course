package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {

		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		//get the beans
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call the methods
		System.out.println(theCoach.getDailyWorkout());
		
		//close the application context
		context.close();
	}

}
/*
 * Scope 
 * - default is singleton => single instance of a bean is created
 * - prototype => different instance is created for each request by the Spring container
 */

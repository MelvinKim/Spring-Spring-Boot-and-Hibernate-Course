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
		
		//calling the new method for fortunes
		System.out.println(theCoach.getDailyFortune());
		
		//close application context
		context.close();
	}

}

//implementation => provide an implementation for methods defined in the interface
/*
 1.
 <bean id="myFortuneService"
 	class = "com.luv2code.springdemo.HappyFortuneService">
 </bean> 
 --- what happens behind the scene ---
 HappyFortuneService myFortuneService = new HappyFortuneService();
 
 2.<bean id="myCoach" 
 	class="com.luv2code.springdemo.BaseballCoach">
 	<constructor-arg ref="myFortuneService" />
 	</bean>
 	
 --- what happens behind the scene ---
 BaseballCoach myCoach = new BaseballCoach(myFortuneService);
 
  */


 
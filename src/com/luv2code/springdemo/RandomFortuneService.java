package com.luv2code.springdemo;

import java.util.Random;

import javax.management.loading.PrivateClassLoader;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//pick a random string fortune from the random fortunes Array
	private  String[] data = {
		"Beware of the wolf in sheep's clothing",
		"Diligence is the mother of good luck",
		"The journey is the reward"
	};
	
	//create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		//pick a random string from the array
		int index = myRandom.nextInt(data.length);
		
		String theFortune = data[index];
		
		return theFortune;
	}

}

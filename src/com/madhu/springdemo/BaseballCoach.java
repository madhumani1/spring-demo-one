package com.madhu.springdemo;

/**
 * POJO
 * @author Madhukar
 *
 */
public class BaseballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}
}

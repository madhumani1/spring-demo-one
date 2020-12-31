package com.madhu.springdemo;

/**
 * POJO
 * @author Madhukar
 *
 */
public class KabaddiCoach implements Coach {

	private FortuneService fortuneService;
	
	// define a constructor which use helper class
	public KabaddiCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
	return "Do a dhar-pakad exercise";
}

	@Override
	public String getDailyFortune() {
		// use my fortuneSerivce to get a fortune 
		return fortuneService.getFortune();
	}
}

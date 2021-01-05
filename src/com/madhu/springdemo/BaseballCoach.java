package com.madhu.springdemo;

/**
 * POJO
 * @author Madhukar
 *
 */
public class BaseballCoach implements Coach {

	private FortuneService fortuneService;
	
	public BaseballCoach() {
		
	}
	
	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 mins on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return "BaseballCoach: "+ fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("BaseballCoash: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("BaseballCoash: inside method doMyCleanupStuff");
	}
}

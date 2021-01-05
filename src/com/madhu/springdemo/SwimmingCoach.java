package com.madhu.springdemo;

import org.springframework.beans.factory.DisposableBean;

/**
 * POJO
 * @author Madhukar
 *
 */
public class SwimmingCoach implements Coach, DisposableBean {

	private FortuneService fortuneService;
	private String email, team;
	
	// create a no-arg constructor
	public SwimmingCoach() {
		System.out.println("SwimmingCoach: inside no-arg constructor");
	}

	/**
	 * our setter method will be called by Spring when they inject dependency
	 * @param fortuneService the fortuneService to set
	 */
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("SwimmingCoach: inside setter methor - setFortuneService");
		this.fortuneService = fortuneService;
	}
	
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		System.out.println("Swimming Coach: inside setter method - setEmail");
		this.email = email;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		System.out.println("Swimming Coach: inside setter method - setTeam");
		return team;
	}

	/**
	 * @param team the team to set
	 */
	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
	return "Do a Butterfly stroke for 15 mins";
}

	@Override
	public String getDailyFortune() {
		// use my fortuneSerivce to get a fortune 
		return fortuneService.getFortune();
	}
	
	// add an init method
	public void doMyStartupStuff() {
		System.out.println("SwimmingCoach: inside method doMyStartupStuff");
	}
	
	// add a destroy method
	public void doMyCleanupStuff() {
		System.out.println("SwimmingCoach: inside method doMyCleanupStuff");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("SwimmingCoach: inside destroy method");
		
	}	
}


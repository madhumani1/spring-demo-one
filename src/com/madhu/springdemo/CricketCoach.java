/**
 * 
 */
package com.madhu.springdemo;

/**
 * @author Madhukar
 *
 */
public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String email, team;
	
	/**
	 * create a no-arg constructor
	 */
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	
	/**
	 * our setter method will be called by Spring when they inject dependency
	 * @param fortuneService the fortuneService to set
	 */
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket: inside setter methor - setFortuneService");
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
		System.out.println("Cricket Coach: inside setter method - setEmail");
		this.email = email;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		System.out.println("Cricket Coach: inside setter method - setTeam");
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
		return "Do a Fast bowling for 30 mins";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}

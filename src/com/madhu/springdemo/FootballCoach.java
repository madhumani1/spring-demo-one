package com.madhu.springdemo;

/**
 * POJO
 * @author Madhukar
 *
 */
public class FootballCoach implements Coach {

	private FortuneService fortuneService;
	private String email, team;
	
	// create a no-arg constructor
	public FootballCoach() {
		System.out.println("FootballCoach: inside no-arg constructor");
	}

	/**
	 * our setter method will be called by Spring when they inject dependency
	 * @param fortuneService the fortuneService to set
	 */
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("FootballCoach: inside setter methor - setFortuneService");
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
		System.out.println("Football Coach: inside setter method - setEmail");
		this.email = email;
	}

	/**
	 * @return the team
	 */
	public String getTeam() {
		System.out.println("Football Coach: inside setter method - setTeam");
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
	return "Do a dribbling practise for 15 mins";
}

	@Override
	public String getDailyFortune() {
		// use my fortuneSerivce to get a fortune 
		return fortuneService.getFortune();
	}
}

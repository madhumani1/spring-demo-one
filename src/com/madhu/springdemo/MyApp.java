/**
 * 
 */
package com.madhu.springdemo;

/**
 * @author Madhukar
 *
 */
public class MyApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Create the object
		Coach theCoach = new BaseballCoach();

		// use the object
		System.out.println(theCoach.getDailyWorkout());
		
		theCoach = new FootballCoach();

		// use the object
		System.out.println(theCoach.getDailyWorkout());

	}

}

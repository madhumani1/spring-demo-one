/**
 * 
 */
package com.madhu.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Madhukar
 *
 */
public class SpringHelloApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	

		// retrieve bean from spring container
		// Note: why do we specify Coach interface in getBean()?
		// When we pass the interface to the method, behind the 
		// scenes Spring will cast the object for me.
		// However, there are some slight differences than normal casting.
		// From Spring docs:
		/**
		 * Behaves the same as getBean(String), but provides a measure of 
		 * type safety by throwing a BeanNotOfRequiredTypeException if 
		 * the bean is not of the required type. This means that 
		 * ClassCastException can't be thrown on casting the result correctly, 
		 * as can happen with getBean(String).
		 */
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		FootballCoach theCoach1;
		theCoach1 = context.getBean("myFootballCoach",FootballCoach.class);
		System.out.println(theCoach1.getDailyWorkout());
		System.out.println(theCoach1.getDailyFortune());
		System.out.println(theCoach1.getEmail());
		System.out.println(theCoach1.getTeam());
		
		
		theCoach = context.getBean("myKabaddiCoach",Coach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		TennisCoach theCoach2;
		theCoach2 = context.getBean("myTennisCoach",TennisCoach.class);
		System.out.println("Tennis: "+theCoach2.getDailyWorkout());
		System.out.println("Tennis: "+theCoach2.getDailyFortune());
		System.out.println("Tennis: "+theCoach2.getEmail());
		System.out.println("Tennis: "+theCoach2.getTeam());
		
		// close the context
		context.close();
	}

}

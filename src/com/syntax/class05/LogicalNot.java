package com.syntax.class05;

public class LogicalNot {

	public static void main(String[] args) {
		
		/*
		 * Logical not (!) is used to revert the condition
		 */
		
		boolean value=!false;
		System.out.println(value);
		
		System.out.println("****************************************************************************");
		
		boolean traffic=false;
		
		if(!traffic) {
			System.out.println("I will come on time to work");
		}
		
		System.out.println("*************************************************************************");
		
		String day="Sunday";
		
		if(!day.equalsIgnoreCase("Saturday")) {
			System.out.println("Today is not Saturday");
		}
		
		System.out.println("******************************************************************************");
		boolean checkBox=true;
		
		if(!checkBox) {
			System.out.println("I will click on that checkbox");
		}
		
		System.out.println("**********************************************************************************");
		
		String java="easy";
		
		if(!java.equalsIgnoreCase("Hard")) {
			System.out.println("You are a genius");
		}

	}

}

package com.syntax.class05;

import java.util.Scanner;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*
		 * Logical Or ||: At least 1 condition must be True
		 * 
		 * true || true=true
		 * true || false=true
		 * false || true=true
		 * false || false=false
		 */
		
		String day="Sunday";
		
		if(day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("I have Java class");
		}
		System.out.println("Code outside of if statement");
		
		/*
		 * Let's ask what is today
		 * 
		 * based on the day let's define what class we have
		 * if(monday or friday)--> no class today
		 * else if(tuesday or wednesday) -->manual testing
		 * else if(thursday)-->review
		 * else if(Saturday or sunday) -->java class
		 * else (invalid day)
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter a day");
		
		
		String days=scan.nextLine();
		
		if(days.equalsIgnoreCase("Monday") || days.equalsIgnoreCase("Friday")) {
			System.out.println("No class today");
		}else if(days.equalsIgnoreCase("Tuesday") || days.equalsIgnoreCase("Wednesday")) {
			System.out.println("Manual testing class");
		}else if(days.equalsIgnoreCase("Thursday")) {
			System.out.println("Review class");
		}else if(days.equalsIgnoreCase("Saturday") || days.equalsIgnoreCase("Sunday")) {
			System.out.println("Java class");
		}else {
			System.out.println("The day is invalid");
		}
		

	}

}

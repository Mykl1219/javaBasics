package com.syntax.homework;

import java.util.Scanner;

public class BirthMonth {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your birth month:");
		String month=scan.nextLine();
		
		if(month.equalsIgnoreCase("December") || month.equalsIgnoreCase("January") || month.equalsIgnoreCase("Febuary")) {
			System.out.println("The month of "+month+" is in the season of Winter");
		}else if(month.equalsIgnoreCase("March") || month.equalsIgnoreCase("April") || month.equalsIgnoreCase("May")) {
			System.out.println("The month of "+month+" is in the season of Spring");
		}else if(month.equalsIgnoreCase("June") || month.equalsIgnoreCase("July") || month.equalsIgnoreCase("August")) {
			System.out.println("The month of "+month+" is in the season of Summer");
		}else if(month.equalsIgnoreCase("September") || month.equalsIgnoreCase("October") || month.equalsIgnoreCase("November")) {
			System.out.println("The month of "+month+" is in the season of Fall");
		}else {
			System.out.println("The month of "+month+" is an invalid month");
		}
		

	}

}

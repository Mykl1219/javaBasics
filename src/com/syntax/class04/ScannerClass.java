package com.syntax.class04;

import java.util.Scanner; // Need to import Scanner into class

public class ScannerClass {

	public static void main(String[] args) {
		
		/*
		 * 
		 */
		
		Scanner input=new Scanner(System.in); // Creating a Scanner
		
		System.out.println("Please enter your name");
		
		// If you want to input single string-> use .next();
		
		String name=input.next(); // type string and press enter
		
		System.out.println("Pleased to meet you "+name);
		
		// If you want to capture integer value--> use .nextInt();
		
		System.out.println(name+" please enter you age");
		
		int age=input.nextInt();
		System.out.println("Your name is "+name+" and your age is "+age);
		

	}

}

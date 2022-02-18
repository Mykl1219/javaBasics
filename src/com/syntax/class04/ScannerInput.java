package com.syntax.class04;

import java.util.Scanner;

public class ScannerInput {

	public static void main(String[] args) {
		
		/*
		 *  Create a Scanner and assign to a variable
		 *   Auto import hold ctrl+shift+o
		 */
		
		// 1. Create a Scanner and assign to a variable
		Scanner scan=new Scanner(System.in);
		
		// 2. Specify the instructions
		System.out.println("Please enter country of origin");
		
		// 3. We need to capture string value
		String country=scan.next();
		System.out.println("You are from "+country);
		
		// Adding If condition to scanner ex: if your from usa you speak english
		// .equalsIgnoreCase(); makes it so that capitalization doesn't matter
		if(country.equalsIgnoreCase("USA")) {
			System.out.println("you speak english");
		}else if(country.equalsIgnoreCase("France")) {
			System.out.println("You speak french");
		}else if(country.equalsIgnoreCase("Turkey")) {
			System.out.println("You speak turkish");
		}else {
			System.out.println("You speak gibberish");
		}

	}

}

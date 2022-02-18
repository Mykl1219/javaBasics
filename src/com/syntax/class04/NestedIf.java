package com.syntax.class04;

public class NestedIf {

	public static void main(String[] args) {
		
		/*
		 *  Nested if--> is an if statement inside another if statement
		 *  
		 *  if(boolean condition) {    "Outter If statement"
		 *     code A;
		 *  if(boolean condition) {    "Nested If statement"
		 *     code B;
		 *  }
		 *  
		 *  If outer if is false then nested if won't be executed
		 *  Outer if would have to be TRUE in order for nested if to be executed
		 *  
		 */
		
		boolean vaccine=true;
		int dose=2;
		
		if(vaccine) {
			System.out.println("How many doses do you have?");
		if(dose==1) { // Nested if begins
			System.out.println("You need another shot");
		}else { // Nested if ends
			System.out.println("You are fully vaccinated");
		}
		}else {
			System.out.println("I don't have any further questions");
		}
		System.out.println("*********************************************************************************************");
	
	
	boolean allergy=false; 
	
	if (allergy) {
		System.out.println("Let's check what allergies you have");
		String allergyType="pollen";
	if(allergyType.equals("pollen")) {
		System.out.println("Please stay at home when trees are blooming. Take medication");
	}else if(allergyType.equals("peanuts")) {
		System.out.println("Please do not eat food that contains nuts. Take medication B");
	}else if(allergyType.equals("gluten")) {
		System.out.println("Please follow gluten free diet. Take medication C");
	}else {
		System.out.println("I don't know what to give you");
	}
	}else {
		System.out.println("You are lucky");
	}
}
	}





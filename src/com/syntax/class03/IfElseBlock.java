package com.syntax.class03;

public class IfElseBlock {

	public static void main(String[] args) {
		
		double coffee=5.99;
		int money=5;
		
		if (coffee<money) {
			System.out.println("I am buying the coffee");
		}else {
			System.out.println("I can't afford coffee so how much is a sip of coffee");
		}
		
		int temp=45;
		
		if (temp>=45) {
			System.out.println("I am going for a walk");
		}else {
			System.out.println("Nah, I'm good tv's looking real good right now");
		}
		
		/* Scenario: I need a variable that store genders
		  *If gender is f use front of train
		   * If m then use back of train
		    * 
		      */
		
		char gender='F';
		
		if (gender=='f') {
			System.out.println("Welcome ma'am head to the front of train");
		}else {
			System.out.println("Get in the back sir");
		}
		
		

	}

}

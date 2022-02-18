package com.syntax.class03;

public class IfStatement {

	public static void main(String[] args) {
		
		/*
		 * SYNTAX OF IF STATEMENT
		 * Scenario: Compare 2 numbers and find which is bigger
		 */
		
		int num1=100;
		int num2=50;
		
		if (num1>num2) { // If num1 is larger than num2=True
			System.out.println(num1+" is larger than "+num2);
		}
		
		double money=5;
		double coffee=4.99;
		
		// If i have more money than price of coffee--> I am buying coffee
		
		if (money<coffee) {
			System.out.println("I am buying the coffee");
		}else {
			System.out.println("I can't afford coffee so just give me the beans and hot water instead");
		}
		
		
	}

}

package com.syntax.class02;

public class Variables {

	public static void main(String[] args) {
		
		String name="Mykl";
		String lastName="Johnson";
		String grade="11th";
		String city="Dunbar";
		String state="West Virginia";
		String phoneNumber="123-456-7890";
		
		System.out.println("My name is "+name+" and my last name is "+lastName);
		System.out.println("I am an A/B student in the "+grade+" grade");
		System.out.println("I live in the city of "+city+" and state of "+state);
		System.out.println("And my phone number is "+phoneNumber);
		
		city="District Heights";
		state="Maryland";
		phoneNumber="098-765-4321";
		grade="12th";
		
		System.out.println("My name is "+name+" and I moved to new city of "+city+" in the state of "+state+
				". My new phone number is "+phoneNumber+" I will be attending the "+grade+" grade");
				

	}

}

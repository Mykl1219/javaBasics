package com.syntax.tasks;

public class Class04Task02 {

	public static void main(String[] args) {
		
		// Nested if inside the else block
		
		double rate=3.5;
		int price=70000;
		
		if(rate>4.5) {
			System.out.println("I will not buy the house");
		}else {
			System.out.println("I will buy the house");
			
			if(price>50000) {
				System.out.println("I will take a loan out");
			}else {
				System.out.println("I will pay cash like a boss");
			}
		
		}

	}

}

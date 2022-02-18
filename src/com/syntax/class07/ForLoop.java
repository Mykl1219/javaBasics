package com.syntax.class07;

public class ForLoop {

	public static void main(String[] args) {
		
		/*
		 *  Use for loop when you know exactly how many times
		 *  you want it to repeat
		 *  
		 *  I want to say hello 5 times
		 *  
		 *  for(int i=1; i<=5; i++) {
		 *      System.out.println("Hello");
		 */
		// Initialize Condition Inc/decriment
		for(int i=1;    i<=5;       i++) {
	    
			System.out.println("Hello");

	}
		
		System.out.println("**************Print 1-20 using for loop****************************");
		
		for(int a=1; a<=20; a++) {
			System.out.print(a+", ");
		}
		
		System.out.println("*****************Print 10-35 ***********************************");
		
		for(int b=10; b<=25; b++) {
			System.out.print(b+", ");
		
		}
		
		System.out.println("*****************************50-1*********************************");
		
		for(int c=50; c>=1; c--) {
			System.out.print(c+", ");
		}

}
}

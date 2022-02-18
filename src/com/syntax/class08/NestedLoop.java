package com.syntax.class08;

public class NestedLoop {

	public static void main(String[] args) {
		
		
		/*
		 * Nested Loop--> Loop inside another loop
		 */
		
		for(int i=1; i<=3; i++) { // Outer loop
			System.out.println("I am i loop "+i);
			
			for(int j=1; j<=2; j++) { // Inner Loop
				System.out.println("I am nested j loop "+j);
			}
			
			System.out.println("**************Car Milage**********************");
			for(int a=0; a<=9; a++) {
				for(int b=0; b<=9; b++) {
					for(int c=0; c<=9; c++) {
						for(int d=0; d<=9; d++) {
							
						System.out.println(a+" "+b+" "+c+" "+d);
						}
					}
				}
			}
		}

	}

}

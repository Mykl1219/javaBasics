package com.syntax.class07;

public class WhileLoop {

	public static void main(String[] args) {
		
		
		/*
		 * While loop is--> repeats block of codecas long as condition is true
		 */
		
		int time=10;
		
		//is  10<12
		if(time<12) {
			System.out.println("Morning");
		}
		System.out.println("************************************************************************************");
		
		while(time<12) {
			System.out.println("Morning");
			time++; //(time=10 so time++=10+1)
		}

	}

}

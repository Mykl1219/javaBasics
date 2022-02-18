package com.syntax.class07;

import java.util.Scanner;

public class DoLoopExample {

	public static void main(String[] args) {
		
		/*
		 *  Create a secret number
		 *  
		 *  We want user to guess secret number
		 *  The moment user guesses secret number program should stop
		 *  otherwise, it should continue til number is correct
		 */
		
		int secretNumber=12;
		Scanner scan=new Scanner(System.in);
		int guessNumber;
		String name;
		
		System.out.println("Please enter your name:");
		name=scan.next();
		
		do {
			
			System.out.println(name+" please enter a number to win:");
			guessNumber=scan.nextInt();
		
		}while(guessNumber!=secretNumber);
		System.out.println(name+" Congrats!!! the number " +secretNumber+" is the correct number!!!");

	}

}

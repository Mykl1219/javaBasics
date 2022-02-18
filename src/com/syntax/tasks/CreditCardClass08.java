package com.syntax.tasks;

import java.util.Scanner;

public class CreditCardClass08 {

	public static void main(String[] args) {
		
		
		/*
		 * Create a program that will keep asking user 
		 * to apply for a credit card.
		 * As soon you get “yes” 
		 * from a user program should stop asking.
		 */
		
		String desired="yes";
		
		 Scanner scan=new Scanner(System.in);
		 String answer;
		 
		 while(true) {
		 System.out.println("Do you want to apply for credit card?");
		 answer=scan.nextLine();
		 
		 if(answer.equalsIgnoreCase(desired)) {
			 break;
		 }
		 System.out.println("Congrats!!!!");
		 }
		
		

	}

}


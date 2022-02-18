package com.syntax.homework;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do you have a credit card?");
		String card=scan.next();
		
		if(card.equalsIgnoreCase("No")) {
			System.out.println("Would you like to apply for a card");
		}else {
			System.out.println("What is the balance on card");
			
			int bal=scan.nextInt();
		if(bal>=1000) {
			System.out.println("Pay off balance immediately");
		}else {
			System.out.println("Spend more money");
		}
		}

	}

}

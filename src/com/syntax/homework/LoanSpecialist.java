package com.syntax.homework;

import java.util.Scanner;

public class LoanSpecialist {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is the amount of the loan needed?");
		
		int amount=scan.nextInt();
		
		if(amount<=200000) {
			System.out.println("I will give you the loan");
		}else {
			System.out.println("Sorry,that is way too much to loan");
		}

	}

}

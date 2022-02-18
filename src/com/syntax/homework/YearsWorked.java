package com.syntax.homework;

import java.util.Scanner;

public class YearsWorked {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("How many years have you worked?");
		int years=scan.nextInt();
		
		System.out.println("What is your annual salary?");
		int sal=scan.nextInt();
		
		if(years>=5) {
			System.out.println("You are eligible for bonus");
		if(sal>=50000) {
			System.out.println("Your bonus is $5000");
		}else {
			System.out.println("Your bonus is $3000");
		}
		}else {
			System.out.println("Unfortunately you are not eligible");
		}
	}

}

package com.syntax.class06;

import java.util.Scanner;

public class CleanCodeExample2 {

	public static void main(String[] args) {
		
		/*
		 * Find out the largest number out of 3
		 * and then define whether largest number is even or odd
		 */
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int num1=scan.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2=scan.nextInt();
		
		System.out.println("Enter final number");
		int num3=scan.nextInt();
		
		int largest = 0;
		
		if(num1>=num2 && num1>num3) {
			largest=num1;
		}else if(num2>num1 && num2>num3) {
			largest=num2;
		}else if(num3>num1 && num3>num2) {
			largest=num3;
			}
		System.out.println(largest+" is the largest number");
		
		if(largest%2==0) { // Checks for even or odd %2==0
			System.out.println(largest+" is an even number");
		}else {
			System.out.println(largest+" is an odd number");
		}
	}
		


	}




package com.syntax.homework;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter 1st number");
		int num1=scan.nextInt();
		
		System.out.println("Enter 2nd number");
		int num2=scan.nextInt();
		
		System.out.println("Enter final number");
		int num3=scan.nextInt();
		
		if(num1>=num2) {
			if(num2>=num3) 
				System.out.println(num1+" is the largest number");
			else
				System.out.println(num3+" is the largest number");
			
		}else {
			if(num2>=num3) {
				System.out.println(num2+" is the largest number");
			}else {

			}
		}
	}

}

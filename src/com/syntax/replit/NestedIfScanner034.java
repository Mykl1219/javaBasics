package com.syntax.replit;

import java.util.Scanner;

public class NestedIfScanner034 {

	public static void main(String[] args) {

		/*
		 * Write a program to find the largest number among three distinct numbers using
		 * nested if condition Please use Scanner class to take input from users
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter 3 distinct numbers");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();

		if (num1 >= num2) {
			if (num2 >= num3)
				System.out.println("The largest number is " + num1);
			else
				System.out.println("The largest number is " + num3);

		} else {
			if (num2 >= num3) {
				System.out.println("The largest number is " + num2);
			} else {
				System.out.println("The largest number is " + num3);
			}

		}

	}
}

package com.syntax.replit;

import java.util.Scanner;

public class ConditionalScanner030 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to take the month number from a user.
		 * Provide month name to the corresponding month number
		 * If a user provides any number that is out of month range, the program should display "Invalid"
		 * IMPORTANT: use Scanner Class
		 */
		
		Scanner scan=new Scanner(System.in);
	    System.out.println("Please enter month number");
	    int m1=scan.nextInt();

	    if(m1==1) {
				System.out.println("January");
			}else if(m1==2) {
				System.out.println("February");
			}else if(m1==3) {
				System.out.println("March");
			}else if(m1==4) {
				System.out.println("April");
			}else if(m1==5) {
				System.out.println("May");
			}else if(m1==6) {
				System.out.println("June");
			}else if(m1==7) {
				System.out.println("July");
			}else if(m1==8) {
				System.out.println("August");
			}else if(m1==9) {
				System.out.println("September");
			}else if(m1==10) {
				System.out.println("October");
			}else if(m1==11) {
				System.out.println("November");
			}else if(m1==12) {
				System.out.println("December");
			}else {
				System.out.println("Invalid");
			}

	}

}

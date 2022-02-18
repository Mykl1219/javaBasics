package com.syntax.replit;

import java.util.Scanner;

public class ScannerClass023 {

	public static void main(String[] args) {
		
		/*
		 * Create a program that will ask a user to input boolean value "Input the boolean value"
		 */
		
		  Scanner scan=new Scanner(System.in);
		  
		  System.out.println("Input the boolean value");
		  boolean a=scan.nextBoolean();
		  
		  System.out.println("The value is "+a);

	}

}

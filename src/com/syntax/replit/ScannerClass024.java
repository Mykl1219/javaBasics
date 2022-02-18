package com.syntax.replit;

import java.util.Scanner;

public class ScannerClass024 {

	public static void main(String[] args) {
		
		/*
		 * Write a program that takes a user's name and prints it.
		 */
		
		Scanner scan=new Scanner(System.in);
	    
		System.out.println("Hello, please enter your name");
	    String name=scan.next();
	    
	    System.out.println("Your name is "+name);

	}

}

package com.syntax.replit;

import java.util.Scanner;

public class ConditionalScanner028 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to take values of length and width from the user.
		 * Based on value define whether the shape is a square or rectangle.
		 */
		
		  Scanner scan=new Scanner(System.in);
		  
		  System.out.println("Please enter the length");
		  int len=scan.nextInt();
		  
		  System.out.println("Please enter the width");
		  int wid=scan.nextInt();

		  if(len==wid) {
		    System.out.println("The shape of your object is square");
		  }else {
		    System.out.println("The shape of your object is rectangle");

	}

}
}

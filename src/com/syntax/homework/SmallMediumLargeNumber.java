package com.syntax.homework;

import java.util.Scanner;

public class SmallMediumLargeNumber {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter a number");
		int num=scan.nextInt();
		
		if(num>=0 && num<=10) {
			System.out.println(num+" is a small number");
		}else if(num>10 && num<=100 ) {
			System.out.println(num+" is a medium number");
		}else if(num>=101 && num<=1000 ) {
			System.out.println(num+" is a large number");
		}else {
			System.out.println(num+" number is out of range");
		}

		

	}

}

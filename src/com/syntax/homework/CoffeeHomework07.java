package com.syntax.homework;

import java.util.Scanner;

public class CoffeeHomework07 {

	public static void main(String[] args) {
		
		double coffee=2.50;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please pay for coffee:");
		double price1;
		price1=scan.nextDouble();
		
		do {
			if(price1>2.50) {
				System.out.println("Give less");
				price1=scan.nextDouble();
			}else if(price1<2.50) {
				System.out.println("Give more");
				price1=scan.nextDouble();
			}
		}while(coffee!=price1);
		System.out.println("Enjoy");

	}

}

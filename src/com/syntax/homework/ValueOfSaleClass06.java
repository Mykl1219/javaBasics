package com.syntax.homework;

import java.util.Scanner;

public class ValueOfSaleClass06 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Will there be a value for sale?");
		String val=scan.next();
		
		double disc=0;
		
		if(val.equalsIgnoreCase("yes")) {
			System.out.println("What is the price of the item?");
			double item=scan.nextDouble();
			
			if(item<20) {
				disc=10;
			}else if(item>=20 && item<100) {
				disc=20;
			}else if(item>=100 && item<=500) {
				disc=30;
			}else {
				disc=50;
			}
			double disc2=item-(item*disc)/100;
			
			System.out.println("With a "+disc+"% discount the price is $"+disc2+" reduced from "+item);
			
				}else if(val.equalsIgnoreCase("No")) {
					System.out.println("I am not going shopping");
				}else {
					System.out.println("Invalid entry");
				}
		

	}

}

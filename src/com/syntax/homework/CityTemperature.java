package com.syntax.homework;

import java.util.Scanner;

public class CityTemperature {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What city?");
		String city=scan.nextLine();
		
		System.out.println("What is the temperature?");
		double temp=scan.nextDouble();
		
		double conv=(temp-32)*5/9;
		System.out.println("The temperature in the city of "+city+" is "+conv);
		
		
		
		

	}

}

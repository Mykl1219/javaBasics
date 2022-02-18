package com.syntax.homework;

import java.util.Scanner;

public class WeekendWeekday {

	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("What day is it?");
	int day=scan.nextInt();
	
	if(day>=1 && day<=5) {
		System.out.println("It is a weekday");
	}else if(day==6 || day==7) {
		System.out.println("It is a weekend");
	}else {
		System.out.println("Invalid day");
	}

	}

}

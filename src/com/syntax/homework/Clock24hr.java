package com.syntax.homework;

import java.util.Scanner;

public class Clock24hr {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("What time is it currently?");
		double hour=scan.nextDouble();
		
		if(hour>=1 && hour<=11) {
			System.out.println("It is morning time");
		}else if(hour>=12 && hour<=15) {
			System.out.println("It is the afternoon");
		}else if(hour>=16 && hour<=20) {
			System.out.println("It is the evening");
		}else if(hour>=21 && hour<=24) {
			System.out.println("It is night time");
		}else {
			System.out.println("Invalid time entry");
		}

	}

}

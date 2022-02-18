package com.syntax.homework;

import java.util.Scanner;

public class EnterName5times {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		for(int a=1; a<=5; a++) {
			System.out.println("Enter your name:");
			String name=scan.nextLine();
			
			System.out.println("Enter your last name:");
			String lastName=scan.nextLine();
			
			System.out.println("Enter your age");
			String age=scan.nextLine();
			
			System.out.println("Your name is "+name+" "+lastName+" and you are "+age+" years old");
		}

	}

}

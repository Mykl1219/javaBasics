package com.syntax.homework;

import java.util.Scanner;

public class DmvRepresentative {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("What is your age?");
		int age=scan.nextInt();
		
		if(age>=18) {
			System.out.println("Congrats you are eligible for license");
		}else {
			System.out.println("Sorry, you are not eligible for license but think about a permit instead");
		}

	}

}

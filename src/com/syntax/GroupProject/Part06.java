package com.syntax.GroupProject;

import java.util.Scanner;

public class Part06 {

	public static void main(String[] args) {
		
		//Write a java program to check whether a given number is prime or not?
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the number");
		int num=sc.nextInt();
		
		if(num%2!=0) {
			System.out.println("The "+num+ " is prime");
		}else {
			System.out.println("The "+num+ " is not prime ");
			
}
}
}

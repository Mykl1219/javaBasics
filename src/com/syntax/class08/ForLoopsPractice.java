package com.syntax.class08;

public class ForLoopsPractice {

	public static void main(String[] args) {
		
		for(int i=11; i<=13; i++) { // creates loop starting at 11 ending at 13
			System.out.println("Hello "+i);
		}
		System.out.println("*Multiplication Table*");
		
		/*
		 * 3x1=3
		 * 3x2=6
		 * 3x3=9
		 */
		
		int num=3;
		int result;
		
		for(int i=1; i<=10; i++) {
			result=num*i;
			System.out.println(num+" X "+i+" = "+result);
		}
		System.out.println("*What is the output*");
		
		for(int i=0; i<=10; i+=3) { // multiply by 3 til it's more than 10
			System.out.print(i+" ");
		}
		System.out.println("*What is the output*");
		
		int sum=0;
		
		for(int i=1; i<=5; i++) {
			sum+=i; // sum=sum+i=
		}
		System.out.println(sum);

	}
	
	
	}





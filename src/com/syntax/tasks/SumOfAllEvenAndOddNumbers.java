package com.syntax.tasks;

public class SumOfAllEvenAndOddNumbers {

	public static void main(String[] args) {
		
		// Sum of even numbers between 1-50
		int sumEven=0;
		int sumOdd=0;
		
		for(int i=1; i<=50; i++) {
			
			if(i%2==0) {
			sumEven=sumEven+i; // Sum of even
			}else {
				sumOdd=sumOdd+i;// Sum of odd
				
			}
		}
		System.out.println("The sum of all even numbers = "+sumEven+" and the sum of all odd numbers is "+sumOdd);

	}
		

	}



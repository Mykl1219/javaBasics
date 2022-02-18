package com.syntax.tasks;

public class WhileLoopTask01 {

	public static void main(String[] args) {
	
		// Print numbers from 1 to 100 in 1 line with space
		
int a=1;
		
		while(a<=100) {
			System.out.print(a+", ");
			a++;
		}
	System.out.println("****************End of Code*******************************");
		
		// Print numbers from 100 to 1
		
int b=100;
		
		while(b>1) {
			System.out.print(b+", ");
			b--;
		}
		System.out.println("***************End of code********************************");
		
		// Print even numbers from 20 to 100 
		
int m=20;
		
		while(m<=100) {
			System.out.print(m+", ");
			m+=2;
		}
		System.out.println("**************************End of code**********************************");
		
		// Print only odd numbers from 100 to 1
		
int j=100;
		
		while(j>=0) {
			
			if(j%2!=0) {
			System.out.print(j+", ");
			}
			j--;

	}

}
}

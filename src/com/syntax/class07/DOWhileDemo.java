package com.syntax.class07;

public class DOWhileDemo {

	public static void main(String[] args) {
		
		// While loop
		int num=1;
		
		while(num<=5) {
			System.out.println("Hello"); // 5 times
			num++;
		}
		
		// Do while loop
		
		int num1=1;
		
		do {
			System.out.println("Hello");
			num1++;
		}while(num1<=5);
		
		System.out.println("I want to print numbers 1-30 using do while");
		
		int num2=1;
		
		do {
			System.out.print(num2+", ");
			num2++;
		}while(num2<=30);

	}

}

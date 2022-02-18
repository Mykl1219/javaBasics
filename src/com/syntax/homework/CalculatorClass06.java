package com.syntax.homework;

import java.util.Scanner;

public class CalculatorClass06 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter number:");
		int num1=scan.nextInt();
		
		System.out.println("Please enter operator:");
		String operator=scan.next();
		
		System.out.println("Please enter number:");
		int num2=scan.nextInt();
		
		int result = 0;
		
		switch(operator) {
		
		case "+":
			result=num1+num2;
			break;
		case "-":
			result=num1-num2;
			break;
		case "*":
			result=num1*num2;
			break;
		case "/":
			result=num1/num2;
			break;
			default:
				System.out.println("Invalid entry");
				break;
		}
		
		
		System.out.println("The result of "+num1+" "+operator+" "+num2+" is "+result);
		
		

	}

}

package com.syntax.homework;

import java.util.Scanner;

public class CalculatorIfStatementClass06 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter number:");
		int n1=scan.nextInt();
		
		System.out.println("Please enter operator:");
		String oper=scan.next();
		
		System.out.println("Please enter number:");
		int n2=scan.nextInt();
		
		int result=0;
		
		if(oper.equals("+")) {
			result=n1+n2;
		}else if(oper.equals("-")) {
			result=n1-n2;
		}else if(oper.equals("*")) {
			result=n1*n2;
		}else if(oper.equals("/")) {
			result=n1/n2;
		}else {
			System.out.println("Invalid entry");
		}
		System.out.println("The result of "+n1+" "+oper+" "+n2+" is "+result);
		
		

	}

}

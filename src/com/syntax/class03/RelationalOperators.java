package com.syntax.class03;

public class RelationalOperators {

	public static void main(String[] args) {
		
		/*
		 *  Relational operators results will always show in Boolean value (True or False)
		 *  >, >=, <, <=, ==,!=
		 */
		
		
		int num1=10;
		int num2=16;
		
		System.out.println(num1>num2); // false
		System.out.println(num1==num2); // false
		System.out.println(num1<num2); // true
		
		 boolean result=num1!=num2; // Is num1 not equal to num2
		 System.out.println("Result is "+result);

	}

}

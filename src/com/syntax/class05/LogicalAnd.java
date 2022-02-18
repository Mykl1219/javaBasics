package com.syntax.class05;

public class LogicalAnd {

	public static void main(String[] args) {
		
		/*
		 * And &&: both conditions have to be True
		 * True && true=true
		 * false && true=false
		 * true && false=false
		 * false && false=false
		 */
		
		boolean likeJava=true;
		boolean practice=true;
		boolean understandJava=false;
		
		if(likeJava && practice && understandJava) {
			System.out.println("This is the best combination");
		}
		System.out.println("End of the code");
		
		/*
		 * We want to compare 3 numbers and find the largest
		 * 
		 * if num1>num2 && num1>num3--> num1 is the largest
		 * what if num2>num1 && num2>num3--> num2 is largest
		 * what if num3>num1 && num3>num2--> num3 is the largest
		 */
		
		int num1=10;
		int num2=20;
		int num3=30;
		
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is the largest");
		}else if(num2>num1 && num2>num3) {
			System.out.println(num2+" is the largest");
		}else if(num3>num1 && num3>num2) {
			System.out.println(num3+" is the largest");
		}

	}

}

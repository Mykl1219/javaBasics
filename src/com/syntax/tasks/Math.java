package com.syntax.tasks;

public class Math {

	public static void main(String[] args) {

		int a = 9;
		int b = 5;

		int sum1 = a + b;
		int sum2 = a - b;
		int sum3 = a / b;
		int sum4 = a * b;

		System.out.println("The addition of 2 numbers " + a + " and " + b + " is equal to " + sum1);
		System.out.println("The subtraction of 2 numbers " + a + " and " + b + " is equal to " + sum2);
		System.out.println("The division of 2 numbers " + a + " and " + b + " is equal to " + sum3);
		System.out.println("The multiplication of 2 numbers " + a + " and " + b + " is equal to " + sum4);

		System.out.println(
				"****************************************************************************************************");

		double sq = 3.9;
		double square = sq * sq;

		System.out.println("The square of the " + sq + " is " + square);

		System.out.println(
				"***************************************************************************************************");

		int wid = 5;
		int hgt = 8;
		
		int per = 2*(wid+hgt);
		int area = wid * hgt;

		System.out.println("The perimeter of a rectangle with width " + wid + " and height " + hgt + " "
				+ "is equal to " + per + " and the area is " + area);

	}

}

package com.syntax.tasks;

public class Class09PriceAverage {

	public static void main(String[] args) {
		
		/*
		 * Create an array to store 4 different prices
		 * find the average of how much we spent
		 */
		
		double[] price=new double[4];
		
		price[0]=17.99;
		price[1]=32.99;
		price[2]=109.99;
		price[3]=405.99;
		
		double avg=(price[0]+price[1]+price[2]+price[3])/4;
		
		System.out.println(avg);

	}

}

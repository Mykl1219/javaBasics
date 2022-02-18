package com.syntax.class09;

public class ForEachLoopArray {

	public static void main(String[] args) {
		
		// If you have an array you can use for each loop to iterate/loop through the entire array
		
		String[] cities={"Washington DC", "Boston", "Miami", "Los Angeles", "New York"};
		
		for(String city:cities) {
			System.out.println(city);
		}
		System.out.println("*********************************************************************");
		
		int[] numbers= {10,20,30,40};
		
		for(int num:numbers) {
			System.out.println(num);
		}
	}

}

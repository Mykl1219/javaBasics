package com.syntax.class10;

public class TwoDArraysAnotherWay {

	public static void main(String[] args) {
		
		int[][] nums= {{10,20,30,40}, // 1st row/ 1st array
			         {100,200,300,400}, // 2nd row/ 2nd array
			        {1000,2000,3000,4000}}; // 3rd row/ 3rd arrays
	
		System.out.println(nums[2][1]);//2000
		System.out.println(nums[1][2]);//300
		

	}

}

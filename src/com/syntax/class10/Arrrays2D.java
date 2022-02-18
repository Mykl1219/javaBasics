package com.syntax.class10;

public class Arrrays2D {

	public static void main(String[] args) {
		
		/*
		 *  2D arrays= Array of Arrays/ Rows and Columns
		 */
		
		// Longer way
		
		int[][]numbers=new int[3][4];
		
		// 1st row/ 1st array
		numbers[0][0]=10;
		numbers[0][1]=20;
		numbers[0][2]=30;
        numbers[0][3]=40;
        
        // 2nd row/ 2nd array
        numbers[1][0]=100;
        numbers[1][1]=200;
        numbers[1][2]=300;
        numbers[1][3]=400;
        
        // 3rd row/ 3rd array
        numbers[2][0]=1000;
        numbers[2][1]=2000;
        numbers[2][2]=3000;
        numbers[2][3]=4000;
        
        System.out.println(numbers[1][2]);// 300
        System.out.println(numbers[0][1]+numbers[1][0]);// 120
	}
	
	
}

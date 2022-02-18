package com.syntax.class10;

public class AllValuesFromArray {

	public static void main(String[] args) {
		
		int[][] nums= {{10,20,30}, // 1st row/ 1st array
		         {100,200,300,400}, // 2nd row/ 2nd array
		        {1000,2000}}; // 3rd row/ 3rd
		
		int size=nums.length;// .length(when used with 2d arrays gives the number of rows
		
		
		System.out.println(size);// 3
		
		int sizeOf1Array=nums[0].length;
		System.out.println("The size of 1st array is "+sizeOf1Array);// 4
		
		int sizeOf2Array=nums[1].length;
		System.out.println("The size of 2nd array is "+sizeOf2Array);
		
		int sizeOf3Array=nums[2].length;
		System.out.println("The size of 3rd array is "+sizeOf3Array);
		
		// Retrieving all elements of 2D array
		
		for(int i=0; i<nums.length; i++) { // I Gives count of rows
			
			for(int j=0; j<nums[i].length; j++) { // J Gives values inside of columns
			
				System.out.print(nums[i][j]+" ");
			}
			System.out.println();
		}
		

	}

}

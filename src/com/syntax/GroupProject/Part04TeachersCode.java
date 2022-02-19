package com.syntax.GroupProject;

public class Part04TeachersCode {

	public static void main(String[] args) {
		
		
		/*
		 * 2D array to calculate sum of even and odd
		 */
		
int[][] array2D= {{2,3,4},{5,6},{12,6,8}};

int sumEven=0;
int sumOdd=0;
		
		for(int x=0; x<array2D.length; x++) {
			
		for(int y=0; y<array2D[x].length; y++) {
			int element=array2D[x][y];
			if(element%2==0) {
				sumEven+=element;
			}else {
				sumOdd+=element;
			}

}
		}
		System.out.println("Sum of even numbers "+sumEven);
		System.out.println("Sum of odd numbers "+sumOdd);
	}
}

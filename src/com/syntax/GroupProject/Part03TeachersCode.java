package com.syntax.GroupProject;

import java.util.Arrays;

public class Part03TeachersCode {

	public static void main(String[] args) {
		
		/*
		 * 2D array store even and odd numbers
		 */
		
     int[][] array2D= {{2,3,4},{5,6},{12,6,8}};
		
		for(int x=0; x<array2D.length; x++) {
			
		for(int y=0; y<array2D[x].length; y++) {
			int element=array2D[x][y];
			if(element%2==0) {
				System.out.println(element);
			}
			}
		}
		

	}

}

package com.syntax.GroupProject;

public class Part08TeachersCode {

	public static void main(String[] args) {
		
		/*
		 * maximum and minimum num in array
		 */
		
		int[] arr= {10,20,90,50,70};
		
		int largest=arr[0];
		int smallest=arr[0];
		
		for(int elements:arr) {
			if(elements>largest) {
				largest=elements;
			}
			if(elements<smallest) {
				smallest=elements;
			}
		}
		System.out.println("Largest number is: "+largest);
		System.out.println("Smallest number is: "+smallest);

	}

}

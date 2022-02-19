package com.syntax.GroupProject;

import java.util.Arrays;
import java.util.Scanner;

public class Part01TecherCode {

	public static void main(String[] args) {
		
		
		/*
		 * Create an int array using Scanner 
		 * To calculate the sum of all stored elements 
		 */
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Please Enter the size of the array:");
		int size=scanner.nextInt();
		System.out.println("Size of the array "+size);
		
		int[] array=new int[size];
		System.out.println("Please enter "+size+" element:");
		
		for(int i=0; i<size; i++) {
			System.out.println("Please enter the element for index "+i);
			array[i]=scanner.nextInt();
		}
		System.out.println(Arrays.toString(array)); // Shows the actual arrays without loops
		int sum=0;
		for(int x=0; x<size; x++) {
			sum=sum+array[x];
		}
		System.out.println("Sum of array elements is "+sum);

	}

}

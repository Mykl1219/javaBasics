package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		
		int num=1;
		// Creating an array containing 4 elements/values
		int[] numbers=new int[4];
		
		// Storing values/elements inside of an array
		numbers[0]=90;
		numbers[1]=87;
		numbers[2]=89;
		numbers[3]=99;
		
		System.out.println(numbers[3]);
		
		System.out.println(numbers[3]+numbers[0]);// 189
		
		// I want to create an array of countries
		
		String[] countries=new String[5];
		
		countries[0]="USA";
		countries[1]="Canada";
		countries[2]="Afghanistan";
		countries[3]="Moldova";
		countries[4]="Morocco";
		//countries[5]="Turkey"; ArrayIndexOutOfBoundsException:
		
		//System.out.println(countries[5]);
		System.out.println(countries[3]+countries[4]);
		
		
		
		
		
		

	}

}

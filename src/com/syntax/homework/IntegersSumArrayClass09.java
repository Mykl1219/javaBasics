package com.syntax.homework;

public class IntegersSumArrayClass09 {

	public static void main(String[] args) {
		
int[] price=new int[4];
		
		price[0]=77;
		price[1]=92;
		price[2]=85;
		price[3]=93;
		
		int avg=(price[0]+price[1]+price[2]+price[3])/4;
		
		System.out.println(avg);
		
		System.out.println("**********************Another Way*********************");
		
		int[] numbers= {15,45,10,32};
		
		int size=numbers.length;
		int sum=0;
		for(int i=0; i<size; i++) {
			sum+=numbers[i];
	}
		System.out.println("Sum of all elements in the array = "+sum);
	}
}

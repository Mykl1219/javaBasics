package com.syntax.homework;

public class Class09LargestNumber {

	public static void main(String[] args) {
		
		int[] num= {20,45,70,93,55};
		
		if(num[0]>=num[1]) {
			if(num[1]>=num[2]) 
				System.out.println(num[1]+" is the largest number");
			else
				System.out.println(num[2]+" is the largest number");
			
		}else {
			if(num[3]>=num[4]) {
				System.out.println(num[3]+" is the largest number");
			}else {

			}
			
			System.out.println("*****************************************************************");
			
			int[] number= {15, 45, 10, 32};
			
			int large=number[0];
			
			for(int a=0; a<number.length; a++) {
				if(number[a]>large) {
					large=number[a];
				}
				System.out.println(large);
			}
				
				System.out.println("***************************************************************");
				int[] numbers= {100, 45, 100, 32};
				
				int largest=numbers[0];
				
				for(int b=1; b<numbers.length; b++) {
				
					if(number[b]>largest) {
						largest=number[b];
						
					}
				}
						System.out.println("The largest number is "+largest);

			
			}

	}

}


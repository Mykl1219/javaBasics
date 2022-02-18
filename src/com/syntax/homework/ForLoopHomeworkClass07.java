package com.syntax.homework;

public class ForLoopHomeworkClass07 {

	public static void main(String[] args) {
		
		System.out.println("Print numbers from 1 to 100 in 1 line with space");

		for(int a=1; a<=100; a++) {
			System.out.print(a+", ");
		}
		System.out.println("******Print numbers from 100 to 1******");
		
		for(int b=100; b>=1; b--) {
			System.out.print(b+", ");
		}
		System.out.println("Print even numbers from 20 to 1 (2 ways)");
		
		for(int c=20; c>1; c-=2) {
			System.out.print(c+", ");
		}
		System.out.println("************2nd way*****************");
		
		for(int d=20; d>=2; d-=2) {
			if(d%2==0) {
				System.out.print(d+", ");
			}
			System.out.println("Print odd numbers between 20 and 50 (2 ways)");
			
			for(int e=21; e<=50; e+=2) {
				System.out.print(e+", ");
			}
			System.out.println("***********2nd way***********************");
			
			for(int f=20; f<=50; f++) {
				if(f%2!=0) {
					System.out.print(f+", ");
				}
			}
		}

	}

}

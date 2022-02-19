package com.syntax.GroupProject;

public class Part06TeachersCode {

	public static void main(String[] args) {
		
		/*
		 * Write a program to check whether a num is prime or not
		 */
		
		int number=5;
		boolean isPrime=true;
		
		if(number>1) {
			for(int i=2; i<number; i++) {
				if(number%i==0) {
					isPrime=false;
					break;
				}
				
			}
		}else {
			isPrime=false;
		}
		System.out.println(number+" isPrime "+isPrime);

	}

}

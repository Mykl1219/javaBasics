package com.syntax.GroupProject;

public class Part07TeachersCode {

	public static void main(String[] args) {
		
		/*
		 * Write a program to print the first 100 numbers
		 * Fibonacci sequence: 0,1,1,2,3,5,8,13,21,34
		 * 0+1=1, 1+1=2,2+1=3,3+2=5,5+3=8, 8+5=13 ect ect
		 */
		
		int howMany=100;
		int previous=0;
		int current=1;
		int next=0;
		
		
		for(int i=0; i<howMany-2; i++) {
			next=previous+current;
			System.out.println("Previous number: "+previous);
			System.out.println("Current number: "+current);
			System.out.println(previous+"+"+current+"="+next);
			previous=current;
			current=next;
		}

	}

}

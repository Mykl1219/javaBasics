package com.syntax.class08;

public class ContinueKeyword {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=7; i++) {
			
			if(i==3) {
				continue;// skips current iteration/cycle
			}
			System.out.println("Hello "+i);
			System.out.println("We are Batch 12");
		}
		
		// I want to print all numbers 1-10 except number 4 and 7
		
		for(int i=1; i<=10; i++) {
			
			if(i==4 || i==7) {
				continue;
			}
			System.out.print(i+", ");
		}

	}

}

package com.syntax.class08;

public class BreakKeyword {

	public static void main(String[] args) {
		
		
		for(int i=1; i<=5; i++) {
			System.out.println("I am code inside for loop");
			
			if(i==3) {
				break;
			}
			
		}
		System.out.println("End of the code");
		
		
		int temp=0;
		boolean winter=true;
		
		while(winter) {
			System.out.println("It is cold");
			
			if(temp==20) {
				break;
			}
			temp+=5;
			
			
		}

	}

}

package com.syntax.class07;

public class WhileLoopDemo {

	public static void main(String[] args) {
		
		/*
		 *  This code counts so i=1
		 *  I is less than 5
		 *  so 1 less than 5 print
		 *  2 less than 5 print
		 *  3 less than 5 print all the way til 5
		 *  after 5 print code executes last print out statement
		 */
		
		int i=1;
		
		while(i<=5) {
			System.out.println(i);
			i++;
		}
		System.out.println("The value of i outside of while loop = "+i);
		
		// Want to print all values from 2-20
		
		int a=2;
		
		while (a<=20) {
			System.out.println(a);
			a++;
		}
		

		
		// Need to print 1-50 on 1 line
		
		int b=1;
		
		while(b<=50) {
			System.out.print(b+", ");
			b++;
		}
		System.out.println("The value of a outside of while loop = "+b);
		
		System.out.println("-----I need numbers from 20 til 1------------------");
		
		int c=20;
		
		while(c>=1) {
			System.out.print(c+", ");
			c--;
		}
		System.out.println("The value of a outside of while loop = "+c);
		
		
		
		System.out.println("-------------Print only even numbers from 1-30-------------------------");
		
		int m=2;
		
		while(m<=30) {
			System.out.print(m+", ");
			m+=2;
		}
		
		System.out.println("Another way to print even numbers 1-30");
		
		int e=1;
		
		while(e<=30) {
			
			if(e%2==0) {
			System.out.print(e+", ");
			}
			e++; // if this goes above the { the loop becomes infinite (in this code))
		
		//System.out.println("The value of a outside of while loop = "+m);
		
		//System.out.println("The End");

	}

}
}

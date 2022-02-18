package com.syntax.tasks;

public class Class09GradesArray {

	public static void main(String[] args) {
		
		char[] let=new char[6];
		
		let[0]='A';
		let[1]='B';
		let[2]='C';
		let[3]='D';
		let[4]='E';
		let[5]='F';
		
		System.out.println(let[1]);
		
		char[] let2= {'A', 'B', 'C', 'D', 'E', 'F'};
		int size=let2.length;
		System.out.println("The number of elements is "+size);
		
		System.out.println(let2[1]);
		
		

	}

}

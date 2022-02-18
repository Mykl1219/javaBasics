package com.syntax.tasks;

public class Differences {

	public static void main(String[] args) {
		
		String a="Hello";
		String b="bye";
		
		int c=10;
		int d=20;
		
		int sum=c+d;
		
		System.out.println(c+d+a+b); // 30Hellobye
		System.out.println(a+b+c+d); // Hellobye1020
		System.out.println(a+c+b+d); // Hello10bye20
		System.out.println(a+b+(c+d)); // Hellobye30
		
		int num=123;
		String num2="123";
		
		String what=num+num2;
		System.out.println(what); // 123123
		
		System.out.println(num+num2);// 123123

	}

}

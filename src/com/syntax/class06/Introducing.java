package com.syntax.class06;

import java.util.Scanner;

public class Introducing {

	public static void main(String[] args) {
		
Scanner scan=new Scanner(System.in);
		
		System.out.println("Please enter your quiz score:");
		int quiz=scan.nextInt();
		
		System.out.println("Please enter your mid-term score:");
		int midterm=scan.nextInt();
		
		System.out.println("Please enter your final exam score:");
		int finalScores=scan.nextInt();
		
		int score=quiz+midterm+finalScores;
		int totalScore=score/3;
		char grade;
		
		if(totalScore>=90) {
			grade='A';
		}else if(totalScore>=70 && totalScore<90) {
			grade='B';
		}else if(totalScore>=50 && totalScore<70) {
			grade='C';
		}else {
			grade='F';
		}
		System.out.println("Your grade is "+grade);
		
		// If your grade is A or B--> you are a good student
		// otherwise-->you should study harder
		
		if(grade=='A' || grade=='B') {
			System.out.println("You are a great student!");
		}else {
			System.out.println("You should study harder dummy!");
		}

	}

}

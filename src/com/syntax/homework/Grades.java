package com.syntax.homework;

import java.util.Scanner;

public class Grades {

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
		
		if(totalScore>=90) {
			System.out.println("Based on your average your grade is: A");
		}else if(totalScore>=70 && totalScore<90) {
			System.out.println("Based on your average your grade is: B");
		}else if(totalScore>=50 && totalScore<70) {
			System.out.println("Based on your average your grade is: C");
		}else if(totalScore<50) {
			System.out.println("Based on your average your grade is: F");
		}
		System.out.println("******************************************************************************");
		
		

	}

}

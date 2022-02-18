package com.syntax.homework;

import java.util.Scanner;

public class GradesClass06 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("please enter the grade:");
		
		String grade=scan.nextLine();
		String explination;
		
		switch(grade.toLowerCase()) {
		
		case "a":
			explination="Excellent";
			break;
		case "b":
			explination="Good";
			break;
		case "c":
			explination="Average";
			break;
		case "d":
			explination="Bad";
			break;
			default:
				explination="Not acceptable";
				break;
				
		}
		scan.close();
		System.out.println(grade+"-"+explination);
		
		
		
		

	}

}

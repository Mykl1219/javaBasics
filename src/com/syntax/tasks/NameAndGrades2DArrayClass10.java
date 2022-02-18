package com.syntax.tasks;

public class NameAndGrades2DArrayClass10 {

	public static void main(String[] args) {
		
		String[][] names= {{"Mykl", "Saniya", "August", "Chrys"}, 
		         {"A", "B", "C", "D", "E", "F"}};
		
		System.out.println(names[0][0]+" has the grade "+names[1][0]);
		System.out.println(names[0][1]+" has the grade "+names[1][5]);
		System.out.println(names[0][2]+" has the grade "+names[1][1]);
		System.out.println(names[0][3]+" has the grade "+names[1][2]);
		
		

	}

}

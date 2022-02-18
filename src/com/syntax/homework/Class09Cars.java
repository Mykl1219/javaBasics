package com.syntax.homework;

public class Class09Cars {

	public static void main(String[] args) {
		
		
		String[] cars=new String[6];
		
		cars[0]="Tesla";
		cars[1]="Dodge";
		cars[2]="Ferrari";
		cars[3]="Ford";
		cars[4]="Toyota";
		cars[5]="Honda";
		
		System.out.println(cars[2]);
		
		System.out.println("**********2nd Way**********");
		
		String[] cars2= {"Tesla", "Dodge", "Ferrari", "Ford", "Toyota", "Honda"};
		
		for(String car:cars2) {
			System.out.println(car);
		
		
		}
		System.out.println("******************3rd Way*********************************");
		
String[] cars3= {"Audi", "BMW", "Honda", "Ford", "Kia", "Lexus"};
		
		for(int i=0; i<cars3.length; i++) {
			System.out.println(cars3[i]+" ");
		
			}
		}
		

	}



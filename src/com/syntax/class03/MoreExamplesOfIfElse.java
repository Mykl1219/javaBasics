package com.syntax.class03;

public class MoreExamplesOfIfElse {

	public static void main(String[] args) {
		 
		
		/*
		  * We need to declare a boolean variable hungry yes or no
		   *  otherwise--> I am going to drink a tea
		    */
		
		boolean hungry=false;
		
		if(hungry) { // since hungry is already is boolean no need to If(hungry==true?false)
			System.out.println("I am going to eat");
		}else {
			System.out.println("I am going to drink a tea");
		}
		
		boolean traffic=false;
		
		if(traffic) {
			System.out.println("I am coming home late");
		}else {
			System.out.println("I will be home on time");
		}
		
		/*
		  *  Define a variable to store a browser
		   *  if browser is chrome--> we will executing tests on chrome
		    *  otherwise--> browser is not supported for tests
		     */
		
		String browser="chrome";
		// always use .equals to compare 2 strings
		
		if(browser.equals("chrome")) {
			System.out.println("We are executing tests on chrome");
		}else {
			System.out.println("We are not executing any test cases");
		}
		// == not preferred for comparing 2 strings
		if(browser=="chrome") {
			System.out.println("We are executing tests on chrome");
		}else {
			System.out.println("We are not executing any test cases");
		}

	}

}

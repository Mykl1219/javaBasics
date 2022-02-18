package com.syntax.tasks;

import java.util.Scanner;

public class CountryLanguage {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter you country of origin: ");
		
		String country=scan.nextLine();
		String language=null;
		
switch(country.toLowerCase()) {
		
		case "usa":
			language="English";
			break;
		case "germany":
			language="German";
			break;
		case "france":
			language="French";
			break;
		case "japan":
			language="Japanese";
			break;
		default:
			language="Gibberish";
				break;
		}
        
        scan.close();
		System.out.println("In "+country+" we speak "+language);
		

	}
		

	}


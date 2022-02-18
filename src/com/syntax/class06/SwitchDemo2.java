package com.syntax.class06;

public class SwitchDemo2 {

	public static void main(String[] args) {
		
		char choice='N';
		String answer;
		
		switch(choice) {
		
		
		case 'Y':
		    answer="Yes";
		    break;
		case 'N':
			answer="NO";
			break;
		case 'M':
			answer="Maybe";
			break;
		default:
			answer="Unknown";
			break;
			
		}
		System.out.println(answer);
		
		System.out.println("************************************************************************");
		
		/*
		 * Declare a variable to store a car
		 * based on the value of car defined the country of origin
		 */
		
		String car="LADA";
		String country;
		
		switch(car.toLowerCase()) {
		
		case "bmw":
			country="country of Germany";
			break;
		case "ford":
			country="country of USA";
			break;
		case "lada":
			country="country of Russia";
			break;
		case "toyota":
			country="country of Japan";
			break;
		default:
			country="Unknown country";
				break;
		}
		System.out.println(car+" is from "+country);
		

	}

}

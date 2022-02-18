package com.syntax.tasks;

public class CountriesArrayClass10 {

	public static void main(String[] args) {
		
		/*
		 *  Create an array of countries
		 *  While retrieving all values from an array
		 *  Print the capitol for the country
		 */
		
		String[] country= {"USA", "China", "Japan", "France", "Africa"};
		String capital = null;
		
		for(int i=0; i<country.length; i++) {
			
			switch(country[i]) {
			
			case "USA":
				capital="Washington DC";
				break;
			case "China":
				capital= "Beijing";
				break;
			case "Japan":
				capital="Tokyo";
				break;
			case "France":
				capital="Paris";
				break;
			case "Africa":
				capital="Johanasburg";
				break;
				default:
					capital="Invalid";
					break;
			}
			System.out.println("The capital of the country "+country[i]+" is "+capital);
		}
			System.out.println("*********************************************************************");
			
			for(String count:country) {
				
				if(count.equals("USA")) {
					capital="Washington DC";
				}else if(count.equals("China")) {
					capital="Beijing";
				}else if(count.equals("Japan")) {
					capital="Tokyo";
			}else if(count.equals("France")) {
				capital="Paris";
			}else if(count.equals("Africa")) {
				capital="Johanasburg";
			}
				System.out.println("The capital of "+count+" is "+capital);	
		}
			
		
	
			
		}

	}




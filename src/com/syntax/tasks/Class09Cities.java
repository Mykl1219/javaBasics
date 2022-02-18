package com.syntax.tasks;

public class Class09Cities {

	public static void main(String[] args) {
	
		
		String[] cities={"Washington DC", "Boston", "Miami", "Los Angeles", "New York"};
		
		for(int a=0; a<cities.length; a++) {
			System.out.println(cities[a]+",");
			
			
			// If value is Miami--> I want to live in  Miami
			
			if(cities[a].equalsIgnoreCase("Miami")) {
			System.out.println("I want to live in Miami");
			
		}

	}

}
}

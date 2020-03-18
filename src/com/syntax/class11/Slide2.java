package com.syntax.class11;

public class Slide2 {

	public static void main(String[] args) {
//let's create a 2D array in which we store professions
		
		String[][] professions = {
				{"QA Tester", "Developers", "Product Owener", "Scrum Master"},
				{"Math Teacher", "Science Teacher", "ESL Teacher" },
				{"Dentist", "Surgeon"},
		};
//get elements using advanced for loop
		
		for(String [] occupation:professions) {
			for(String title:occupation) {
			System.out.print(title+", ");	
			}
			System.out.println();
		}
	}

}

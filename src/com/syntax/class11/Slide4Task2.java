package com.syntax.class11;

public class Slide4Task2 {

	public static void main(String[] args) {
		//Task2)Create an array of countries: 
		//north America countries, south America countries, Europe countries, asian countries, 
		//African countries. Then print all values from that array using 2 different loops and 
		//calculate how many total countries been stored.
	
		String[][] countries= {
				{"USA","Canada"},
				{"Brasil", "Chile", "Argentina"},
				{"german, Italy", "UK", "Poland"},
				{"China", "Japon", "India"},
				{"Kenya", "Morocco", "Egypt"}
		};
		
		for(String [] a:countries) {
			for(String b:a) {
				System.out.print(b+" ");
		}
			System.out.println();
		}
	
		System.out.println("--------------USING LOOP-------");
		int sum=0;
		for(int i=0; i<countries.length; i++) {
			for(int j=0; j<countries[i].length; j++) {
				
				System.out.print(countries[i][j]+" ");
				sum+=1;
			}
			System.out.println();
		}
		
		System.out.println(sum);
	}

}

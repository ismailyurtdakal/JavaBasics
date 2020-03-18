package com.syntax.class11;

public class Study2 {

	public static void main(String[] args) {
//Create an array of soccer teams: Turkish, Spanish, UK, Italian, 
//print them all, find number of elements		
		
		String [][] teams= {
				{"Fener","BJK", "Cimbom", "Trabzon"},
				{"Barca", "Real Madrid", "Atletico", "Valencia" },
				{"Liverpool", "Chelsea", "Man City", "Man United"},
				{"Juventus", " Napoli", "Roma"},
		         };
		int sum=0;
		for(int i=0; i<teams.length; i++ ) {
			for(int j=0; j<teams[i].length; j++) {
				System.out.print(teams[i][j]+" ");
				sum=sum +=1;
			}
			System.out.println();
		}
		
		System.out.println(sum);
		
		System.out.println("----------------");
		
		int total=0;
		for(String [] a:teams) {
			for(String b:a) {
			total+=1;
			
			System.out.print(b+" ");
			}
			System.out.println();
		}
		System.out.println(total);
	}

}

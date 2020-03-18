package com.syntax.class11;

public class Study1 {

	public static void main(String[] args) {
		// Task1) Create an array of cars : american, german, korean, italian. 
		//Then retrieve all values from that array using 2 different loops
		
		String[][] cars= {{"Chrisyler", "Ford", "Chevrolet","GMC"}, {"BMW", "AUDI", "Mercedes","Porche" },{"Hyundai", "Kia"},{"Ferrari", "Fiat","Alfa Romeo"}};

		for (String[] a:cars) {
			for(String b:a) {
			System.out.print(b+", ");	
			}
           System.out.println();			
		}
		
		System.out.println("------------------");
		int sum=0;
for(int i=0; i<cars.length; i++) {
	for (int j=0; j<cars[i].length; j++) {
		System.out.print(cars[i][j]+", ");
		sum+=1;
	}
	System.out.println();
}		
	System.out.println(sum);	
	}

}

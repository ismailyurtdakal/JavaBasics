package com.syntax.class11;

public class Slide1 {

	public static void main(String[] args) {
		int [][] nums = new int[2][2];

// Let's create array of groceries
		
	String [][]	 groceries = {
			{"cucumber", "potato", "carrot"},
			{"mango", "apple", "banana", "kiwi"},
			{"milk", "cheese", "yogurt"}
		     };

	//get all values from 2D array
		
	for(int r=0; r<groceries.length; r++) {
		for(int c=0; c<groceries[r].length; c++) {
		System.out.print(groceries[r][c]+ ", ");
	}
	System.out.println();
	}
System.out.println("----------Geeting all elements using advanced for loop");

for (String [] array:groceries) {//loop through all arrays
	
	for(String items:array) {
		System.out.print(items+", ");
	}
	System.out.println();
}
}
}
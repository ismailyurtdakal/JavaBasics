package com.syntax.class010;

public class Class10Slide3 {

	public static void main(String[] args) {
		// create an array of fruits and retrieve all elements
		
		String[] fruits = {"Banana", "Kiwi","Orange", "Apple", "Mango"};
		//if fruit is apple--> that is your favorite fruit
		//advanced for loop, enhanced for loop, for each loop
		
		for(String f:fruits) {
			if(f.equals("Apple")) {
				System.out.println(f+" is your favorite fruit");
			
			}else {
				System.out.println(f);
			}
		}
//regular for loop
//fuits.lenght=number of elements		
		System.out.println("----for loop---");
		for(int i=0; i<fruits.length; i++) {
			System.out.println(fruits[i]);
		}
	}

}

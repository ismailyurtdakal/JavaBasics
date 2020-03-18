package com.syntax.class010;

public class Class10Slide1Recap {

	public static void main(String[] args) {
		int [] grades= new int[4];
		
		grades[0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=78;
		
		//what is average?
	int average=(grades[0]+grades[1]+grades[2]+grades[3]/4);

	System.out.println("Average grade is "+average);
	
	
	//--------------------
	//--creating an array of cities----------
	
	String[] cities= {"Washington DC", "New York", "Paris", "Miami","Los Angeles", "Dallas", "Warren"};
	
	//I live in Paris
		
	int x=1;
	System.out.println("I live in "+cities[x]);
	
	x+=3;  //will be LA
	
	//How many elements stored inside an array?
	//cities.lenght
	System.out.println("^^^^^^^^^^^^^^^^^^^^^^^");
	int arraySize=cities.length;
	
	System.out.println("Total elements is "+arraySize);
	
	//how can we access the last element from an array
	
	
	System.out.println("**************************");
	System.out.println(cities[arraySize-1]);
	
	//access all elements from an array
	//cities[0], cities[1], cities[2]
	
	System.out.println("----------------");
	for(int i=0; i<arraySize; i++) {
	
		System.out.println(cities[i]);
	}
	
	
	}

}

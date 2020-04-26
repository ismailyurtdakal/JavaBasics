package com.syntax.class23;

public class ComputerTest {
//Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell. 

//Define common behavior within and some fields in parent class and override some of the methods in child classes
//Define some methods specific to child classes
//Create objects of child classes and store them into array. Loop through each object and execute available methods.
	
	public static void main(String[] args) {
		Computer comp1=new Apple();
		Computer comp2=new Lenovo();
		Computer comp3=new HP();
		Dell comp4=new Dell();
		
		Computer[] comps= {comp1,comp2,comp3,comp4};
//		for(Computer a:comps) {
//			a.start();
//			a.turnoff();
//			System.out.println("--");
		
	for (int i=0; i<comps.length; i++) {
		comps[i].start();
		comps[i].turnoff();
		
	}	
		
		
		}
		
		
		
	}


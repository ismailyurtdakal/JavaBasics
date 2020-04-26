package com.syntax.class19;

public class S5Task {
//	Write program as a Student class that has 
//  instance variables name and address. 
//  Create a constructor that will initialize those variables. 
//	Print name & address of given  student using displayInfo method.

	
	
	String name, address;
	
	void displayInfo() {
		this.name="Mert";
		this.address="Warren";
				
		System.out.println("Name is "+name+" and his address is "+ address);
	}
	
	public static void main(String[] args) {
		S5Task obj = new S5Task();
		obj.displayInfo();
	}
}

package com.syntax.class18;

public class S3Car {

	String make, model, color;// instance variables
	int year,door, wheels;

	public void printDetails() {
		System.out.println("I have " + year + " " + make + " " + model + "  in " + color + " color");
	}

	public static void main(String[] args) {
		S3Car car = new S3Car();
		car.make = "BMW";
		car.model = "m5";
		car.year = 2020;
		car.color="Blue";
		car.door=2;
		car.wheels=5;
		car.printDetails();
		

		S3Car car1 = new S3Car();
		//car1.printDetails();
		// we are using instance variales without assigning any value
		// constructor initializes all instance variables and assign default values to
		// them

		// int doors;
		// System.out.println(doors);CE: local variables mus be initialized
	}

}

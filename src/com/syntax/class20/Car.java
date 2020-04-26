package com.syntax.class20;

public class Car {

	String make, model;

	public Car() {// constructor
		System.out.println("I am a Parent class constructor");
	}

	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}
}

class Mercedes extends Car {
	String sportModel;

	public Mercedes() {// constructor
		// super(); compiler add super() by default

		System.out.println("I am a Child class constructor");
	}

	public Mercedes(String sportModel) {
		super("Mercedes", "S");
		this.sportModel = sportModel;

	}

	public void display() {
		System.out.println("I have " + make + " " + model + " " + sportModel);
	}

}

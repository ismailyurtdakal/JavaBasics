package com.syntax.class18;

public class S6BestCar {
	String make, model, color;// instance variables
	int year,door, wheels;

	public void printDetails() {
		System.out.println("I have " + year + " " + make + " " + model + "  in " + color + " color");
	
	System.out.println(make+" has "+door+ " doors and "+ wheels+" wheels");
	}
	S6BestCar(String carMake, String carModel, String carColor, int carYear, int carDoor, int carWheels){
		make=carMake;
		model=carModel;
		color=carColor;
		year=carYear;
		door=carDoor;
		wheels=carWheels;
		
	}
	
	public static void main(String[] args) {
	//once we create our own constructor, compiler WILL NOT be creating default constructor for you!!!
	//className obj=new className(); CE==> add parameters to resolve	
		
		S6BestCar car=new S6BestCar("BMW","m5","Blue",2020,4,4);
		//car.make="BMW";
		car.printDetails();

	}

}

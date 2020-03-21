package com.syntax.class14;

public class Car {
//define feature of the car
	String make;
	String model;
	String color;
	int year;
	int speed;
	//define behavior
	
	public static void main(String[] args) {
	
	Car car4=new Car();
	car4.color="Red";
	car4.make="Toyota";
	car4.model="Camry";
	car4.speed=130;
	car4.year=2014;
}
void drive() {
	System.out.println(make+" can drive");
}
void accelerate() {
	System.out.println(make+" can accelerate");
}void makeNoise(){
	System.out.println(make +" can accelerate");
}void stop(){
	System.out.println(make+ " can stops");
}
}

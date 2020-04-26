package com.syntax.class14;

public class Task2DogClass {

	private static final String Husky = null;
	private static final String Bulldog = null;
	private static final String Labrador = null;
	String name;
	String color;
	String breed;
	int weight;

	void bark() {
		System.out.println(breed + " can bark");
	}

	void eat() {
		System.out.println(breed + " can eat");
	}

	public static void main(String[] args) {

		Task2DogClass obj = new Task2DogClass();
		obj.breed ="Husky";
		obj.bark();
		obj.eat();

		Task2DogClass obj1 = new Task2DogClass();
		obj1.breed = "Bulldog";
		obj1.bark();
		obj1.eat();

		Task2DogClass obj2 = new Task2DogClass();
		obj2.breed = "Labrador";
		obj2.bark();
		obj2.eat();
		
	}

}

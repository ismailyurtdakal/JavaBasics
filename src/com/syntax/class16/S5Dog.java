package com.syntax.class16;

public class S5Dog {

	// instance variables
	String name, size;
	int age;

	// static variables
	static String breed = "Husky";
	static int paws = 4;
	static int tail = 1;
	static int eyes = 2;

	void displayDog() {
		System.out.println("Dog name is " + name + " and it " + size + " dog and age is " + age);
		System.out.println("Dogs breed is " + breed + "and it has " + paws + " paws and " + tail + " tail");

	}

	public static void main(String[] args) {

		S5Dog obj = new S5Dog();
		// how to access instance variables?--> by creating an object and using
		// reference varibale
		obj.name = "Lucy";
		obj.size = "Big";
		obj.age = 5;
		obj.displayDog();
		// System.out.println("Dog name is "+ obj.name);

//how to acess static variables?--> static variables belong to the class --> accesed by className
		System.out.println(obj.breed);// access static variable in static way
		System.out.println(S5Dog.paws);
		System.out.println(S5Dog.eyes);
		System.out.println(S5Dog.tail);
		System.out.println(breed);

// ********* changing value of static variable*********************************
		breed = "Bulldog";

		S5Dog obj1 = new S5Dog();
		obj1.name = "Sharik";
		obj1.size = "Small";
		obj1.age = 2;
		obj1.displayDog();
		// System.out.println("Dog name is "+ obj1.name);

		S5Dog obj2 = new S5Dog();
		obj2.name = "Pepsi";
		obj2.size = "Big";
		obj2.age = 10;
		obj2.displayDog();

	}

}

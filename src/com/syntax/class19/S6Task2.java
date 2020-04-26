package com.syntax.class19;

public class S6Task2 {
//	Write program as a Book class that will have 2 Constructors. 
//	While creating an object make sure:
//	Instance variables are being initialized
//	Both Constructors are being executed

	String bookName, bookName2;

	void m1() {

		System.out.println("First method");

	}

	void m2() {
		System.out.println("Second method");
	}

	public static void main(String[] args) {
		S6Task2 obj1 = new S6Task2();
		obj1.m1();

		S6Task2 obj2 = new S6Task2();
		obj2.m2();
	}
}

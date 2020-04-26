package com.syntax.class21;

public class Parent {

	String name = "Mesut";

	Parent() {
	}

	void hello() {
		System.out.println("I am parent class method");
	}
}

class Child extends Parent {

	String name = "Saadet";

	public void display() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	void sayHello() {
		display();//compiler adds this.display();
		hello();//compiler adds super ==> super.hello();
	}
}

package com.syntax.class22;

public class Parent {
	private void hello() {
		System.out.println("Hello from parent class");
	}
	static void bye() {
		System.out.println("Bye from parent class");
	}

}

class Child extends Parent {
    //private method is not visible in chid class, so WE AREN'T OVERRIDING here!!!!!!!! 
	private void hello() {
		System.out.println("Hello from child class");
	}
	
	//we are not overriding, this is a different static method than parent static method
	static void bye() {
		System.out.println("Bye from child class");
	}
}

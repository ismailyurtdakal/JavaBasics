package com.syntax.class18;

public class S4ConstructorIntro {
	S4ConstructorIntro() {
		System.out.println("I am a constructor");
	}

	// to create a constructor:
	// 1. name must be same as class name
	// 2. no return type(not even void)

	public static void main(String[] args) {
		S4ConstructorIntro obj = new S4ConstructorIntro();
		System.out.println("Code after constructor");
		
		obj.hello();
	}

	void hello() {
		System.out.println("Hello Class");
	}

}

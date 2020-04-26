package com.syntax.class14;

public class MethodExamples {
//I want to create a method that will be greeting a person
	void greet() {
		System.out.println("Hello BABA");
	}

	void greet1(String name) {
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {
//how do I call method greet?--first we need to create an object of the class
//where that method belongs	

		// className variableName=new ClassName();

		MethodExamples object1 = new MethodExamples();
		object1.greet();
		object1.greet();
	
		object1.greet1("Mesut");
		object1.greet1("Saadet");
		object1.greet1("Esin");
		object1.greet1("Ismail");
		object1.greet1("Mert");
		object1.greet1("Omer");

		// object1.gree1('c'); CE: not applicable type

	}
}

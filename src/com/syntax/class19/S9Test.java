package com.syntax.class19;

public class S9Test {

	public static void main(String[] args) {
		S8Dog obj = new S8Dog();
		// access variables from won class
		obj.breed = "Husky";

		// access variables from parent class
		obj.color = "Grey";
		obj.fur = "Too much";
		obj.size = "Big";

		// access method from own class
		obj.bark();

		// access methods from parent class
		obj.beWild();
		obj.eat();
		obj.sleep();
		
		S8Dog.age=2;// static way to access variable===> className.variable;
		S8Dog.display(); //static way to access variable===> className.method();
		
		
		S7Animals obj1=new S7Animals();
		//can access only features defined with in the paren class
		obj1.color="Any";
		obj1.size="Any";
		obj1.fur="Any";
		
		obj1.beWild();
		obj1.eat();
		obj1.sleep();
		
		
	}
}

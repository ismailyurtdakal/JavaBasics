package com.syntax.class22;

public class AnimalTest {

	public static void main(String[] args) {

		// Non primitive casting:Upcasting
		Animal obj = new Tiger();
		//obj.run():CE method run() is not defined in Animal classs
		

		obj.eat();
		obj.sleep();

		Animal animal = new Animal();
		animal.eat();
		animal.sleep();

		Tiger t = new Tiger();
		t.eat();
		t.sleep();
		t.run();

	}

}

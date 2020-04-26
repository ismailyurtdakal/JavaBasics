package com.syntax.class15;

public class S4aMethods {

	// create a method tat will say welcome 10 times
	void sayWelcome() {

		for (int i = 0; i < 10; i++) {

			System.out.println(i + ": Welcome");
		}
//create method that will say any word #number of times		
	}

	void sayAnything(String word, int times) {

		for (int i = 1; i <= times; i++) {
			System.out.println(i+" "+word);
		}
	}
//create a method isItRaining that will accept boolean value as a a parameter
//and based on the value it will print message accordingly

	void isItRaining(boolean isRain) {
		if (isRain) {
			System.out.println("It is raining, stay home and learn Java");
		} else {
			System.out.println("It is not raining, go for a walk");
		}
	}
}

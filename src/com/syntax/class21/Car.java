package com.syntax.class21;

public class Car {

	Car() {
		System.out.println("I am a parent class constructor");
	}

}
	class BMW extends Car {
		// when we do not create a constructor, compiler will create a default nonargument
		BMW() {

			// by default first line, it will make a call to parent class const super();
			super();//when it is not added, it is created by Java in order to call the constructor and initialize parent variables

		}
		
		public static void main(String[] args) {
			BMW bmw=new BMW();
			
		}
	}


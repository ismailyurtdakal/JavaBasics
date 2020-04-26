package com.syntax.class24;

public class VehicleTest {

	public static void main(String[] args) {
		Vehicle tesla = new Tesla("yellow", "sedan", "tesla");//upcasting

		tesla.brake();
		tesla.drive();
		tesla.stop();
		tesla.start();
		//tesla.display(); CE: this is not Vehicle type
		
		Vehicle.total();
		
		new Toyota("red", "sedan","toyota");
		new Toyota("blue", "sedan","toyota");
		Toyota.total();//static variable can be called with class name Toyota
		
	}

}

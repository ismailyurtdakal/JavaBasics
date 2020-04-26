package com.syntax.class23;

public class CarTest {

	public static void main(String[] args) {
		Car bmw = new BMW("BMW");
		Car tesla = new Tesla("Tesla");
		Car merc = new Mercedes("Mercedes");
		Car honda = new Honda("Honda");
		
		Car[] cars={bmw,tesla,merc,honda};// or {new BMW("BMW"), new Tesla("Tesla"), new Mercedes("Mercedes", new Honda{"Honda")};
		
for(int i=0; i<cars.length; i++) {
	
	cars[i].start();
	
	//2nd way
//	System.out.println("  ");
//	for(Car c:cars) {
		//c.display();
		//c.start();
		//System.out.println("----------");
	}
}
	}

//}

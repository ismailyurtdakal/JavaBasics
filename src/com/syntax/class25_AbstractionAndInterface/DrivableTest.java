package com.syntax.class25_AbstractionAndInterface;

public class DrivableTest {

	public static void main(String[] args) {
		Drivable obj=new Cars();
		System.out.println("---- from interface Drivable---------");
		obj.drive();
		
		//Drivalble.MOVE_FAST cannot be called!!!
		
		System.out.println("---from abstract vehicle class---");
		Vehicle vec=new Cars();
		vec.stop();
		
		System.out.println("-------from Child Cars class-----");
		Cars car=new Cars();
		car.drive();
		car.stop();
	}

}

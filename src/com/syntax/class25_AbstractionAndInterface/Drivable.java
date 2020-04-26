package com.syntax.class25_AbstractionAndInterface;

public interface Drivable {

//interface is a collection of public static final variables and public abstract methods.
//(public static final) by default will be added by compiler if it is not written

	public static final boolean MOVE_FAST = true; // Since it is final, it has to be initialized

//public abstract will be added by compiler if it is not written
	public abstract void drive();// it has to be public abstract NO EXCEPTION
}

abstract class Vehicle {
	abstract void stop();
}

//Achieving multiple inheritance
class Cars extends Vehicle implements Drivable {

	@Override
	public void drive() {// it has to be public, visibility cannot be decreased!!
		System.out.println("Car drives");
	}

	@Override
	void stop() {
		System.out.println("Car stops");
	}
}

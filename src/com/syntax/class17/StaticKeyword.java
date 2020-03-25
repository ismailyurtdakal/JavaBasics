package com.syntax.class17;

public class StaticKeyword {
//create a templeate ofr a phone

	String color;
	int memory;

	static String brand;
	static boolean touchScreen;

	// return type, name, parameters{}

	static void displayGenInfo() {
		System.out.println("We are building " + brand + " with touch screen=" + touchScreen);

	}

	void displaySpecificitations() {
		System.out.println("we build a phone with " + memory + "GB memory inl" + color + " color");
	}

	public static void main(String[] args) {

		brand="iPhone";
		touchScreen=true;
		
		StaticKeyword obj= new StaticKeyword();
		obj.color="grey";
		obj.memory=64;

		StaticKeyword.displayGenInfo();//by using instance
		obj.displaySpecificitations();// by using object name is valid but preferable
	
	
	}
}

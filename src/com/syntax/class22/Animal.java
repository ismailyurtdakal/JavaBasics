package com.syntax.class22;

public class Animal {

	public void eat() {
		System.out.println("Animals eat");
	}
	
	public void sleep() {
		System.out.println("Animals sleep");
	}
}

class Tiger extends Animal{
	
	public void eat() {
		System.out.println("Tigers eat a lot");
	}
	
	public void run() {
		System.out.println("Tiger runs very fast");
	}
}

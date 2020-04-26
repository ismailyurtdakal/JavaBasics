package com.syntax.class24;

public abstract class Phone {
	
	// have body=implemented method
	public void call() {
		System.out.println("Phone can make a call");
	}

	public void text() {
		System.out.println("Phone can send text");
	}

//no body unimplemented method=undifined methods=abstract method
	public abstract void takePicture();

	public abstract void playMusic();
}

class iPhone extends Phone {

	@Override
	public void takePicture() {
		System.out.println("iPhone takes pictures");
	}

	@Override
	public void playMusic() {
		System.out.println("iPhone play music using apple store");
	}
}

class Samsung extends Phone {

	@Override
	public void takePicture() {
		System.out.println("Samsung takes pictures");
	}

	@Override
	public void playMusic() {
		System.out.println("Samsung plays music using google store");
	}
}
//OVERRIDE RULES:
//Rule #1: Only inherited methods can be overridden.
//Rule #2: Final and static methods cannot be overridden.
//Rule #3: The overriding method must have same argument list.
//Rule #4: The overriding method must have same return type (or subtype).
//Rule #5: The overriding method must not have more restrictive access modifier.

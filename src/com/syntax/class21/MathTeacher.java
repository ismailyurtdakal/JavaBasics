package com.syntax.class21;

public class MathTeacher extends Teacher {

	public MathTeacher(String name,String lastName) {
		//super(); this default call implicity takes place
		super(name,lastName);
		System.out.println("I am a child class constructor");
	}
	
}

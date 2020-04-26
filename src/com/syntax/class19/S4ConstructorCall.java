package com.syntax.class19;

public class S4ConstructorCall {

	public S4ConstructorCall() {
		System.out.println("I am a non argument constructor");
	}

	public S4ConstructorCall(String str) {
		this();// call another constructor!!!
		System.out.println("hi");
		
	}
	public S4ConstructorCall(String str, String str1) {//str=Java, str1=Love
		this(str);
	}

	public static void main(String[] args) {
		S4ConstructorCall obj = new S4ConstructorCall("Java");
		System.out.println("---------------------------");
		S4ConstructorCall obj1 = new S4ConstructorCall("Java", "Java");

	}
}

package com.syntax.class18;

public class S5ConstructorDemo {
	static String str = "Hello";

	S5ConstructorDemo() {

		System.out.println("I am your constructor");
		System.out.println("I am your non argument constructor");
	}

	S5ConstructorDemo(String str) {
		System.out.println("I am a constructor with String parameter " + str);
	}

	S5ConstructorDemo(int num) {
		System.out.println("I am constructor with 1 integer value=" + num);
	}

	S5ConstructorDemo(String str, int num) {
		System.out.println("I am a constructor with 2 parameters:" + str + "&" + num);
	}
	void S5ConstructorDemo() {//if there is return type including void, it becomes a method!!!
		System.out.println("This is a method has to be called by obj.className(); !!!!!!!!!!!");
	}

	public static void main(String[] args) {
		// S5ConstructorDemo obj = new S5ConstructorDemo();

		System.out.println(str);
		S5ConstructorDemo obj = new S5ConstructorDemo();

		S5ConstructorDemo obj1 = new S5ConstructorDemo("Today is Java Class");
		S5ConstructorDemo obj2 = new S5ConstructorDemo(12);
		S5ConstructorDemo obj3 = new S5ConstructorDemo("Yes", 13);
		obj.S5ConstructorDemo();

	}

}

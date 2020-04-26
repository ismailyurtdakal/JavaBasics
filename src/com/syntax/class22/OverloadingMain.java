package com.syntax.class22;

public class OverloadingMain {
	static String str = "Syntax";

	public static void main(String[] args) {
		System.out.println("Method with String array arguments");
		// Java always looks for this main method with this signature!!
		// only this one will be printed without calling them below!!!!
		// Java only prints its original main method with signature
		OverloadingMain.main("str");// ==> static method
		main("str");
		main("hello", "hi");

		main(new int[2]);
	}

	public static void main(int[] args) {
		System.out.println("Method with int array arguments");
	}

	public static void main(String args) {
		System.out.println("Method with String argument");
	}

	public static void main(String args, String args1) {
		System.out.println("Method with 2 String arguments");
	}

	public static void main(int num, String args1) {
		System.out.println("Method with 1 int and 1 String arguments");
	}

}

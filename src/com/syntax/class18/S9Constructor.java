package com.syntax.class18;
import com.syntax.class17.*;


public class S9Constructor {
//Write a program  that will have 4 different access levels of constructors and 
//create 3 objects of this class: 
//1 - inside same class; 
//2 - from outside the class; 
//3 - from different class inside different package and observe result.
	String str;
	int year, age;

	public S9Constructor() {
		System.out.println("Public constructor");
	}
	public S9Constructor(int num){
		System.out.println("Default constructor");
	}
	protected S9Constructor(int num, int num1) {
		System.out.println("Protected constructor");
	}
	private S9Constructor(String str) {
		System.out.println("Private constructor");	
	}

	public static void main(String[] args) {
		S9Constructor obj = new S9Constructor();
		S9Constructor obj1 = new S9Constructor(12);
		S9Constructor obj2 = new S9Constructor(12,13);
		S9Constructor obj3 = new S9Constructor("Hi");

	}


}

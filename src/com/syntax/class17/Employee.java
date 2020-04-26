package com.syntax.class17;

public class Employee {

	//create variables to hold: name=, last name, title, ssn;
	
	public static String title;//accesible everywhere
	public String name;//accessible within the same package
	protected String lastName;//accesible within the same package
	double salary;//accessible within the same package
	private long ssn;//access only withn the same class
	
	public void method1() {
		System.out.println("I am public method");
	}
	
	protected void method2() {
		System.out.println("I am protected method");
	}
	void method3() {
		System.out.println("I am a default method");
	}
	
	private void method4() {
		System.out.println("I am a private method");
	}
	public static void main(String[] args) {
		
		Employee obj=new Employee();
		
		obj.lastName="John";
		obj.lastName="Smith";
		obj.salary=90000;
		obj.ssn=910101010;
		
		
		//access all methods
		obj.method1();
		obj.method2();
		obj.method3();
		obj.method4();
	}
}

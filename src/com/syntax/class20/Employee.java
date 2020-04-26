package com.syntax.class20;

public class Employee {
	public static String company;
	protected int empNumber;
	double salary;

	void getPaid() {
		System.out.println("Employee.. " + salary);
	}

	static void work() {
		System.out.println("Employeee..." + company);
	}
}

package com.syntax.class26_EncapsulationAndArrayList;

public class Employee {

	// define private variables
	private String name;
	private int age;
	private double salary;

// define public methods to give access to private variables
//getters gives read only access
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getsalary() {
		return salary;
//getters=accessors, setters=mutators

	}

//setters gives write only access
	public void setName(String name) {
		if (!name.isEmpty()) {
			this.name = name;
		}
	}

	public void setAge(int age) {
		if (age > 18) {
			this.age = age;
		}
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

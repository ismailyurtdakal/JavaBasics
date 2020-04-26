package com.syntax.class26_EncapsulationAndArrayList;

public class EncapsulationTest {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.getAge();
		//emp.getAge(22);
		emp.getName();
		emp.getsalary();
		emp.setSalary(100000);
		
		//set is to initialize the variables and get is to return the variables
		emp.setName("Mesut");//we cannot use emp.name-->It is private
		System.out.println(emp.getName());

	}

}

package com.syntax.class20;

public class Test {
//in test class create objects of employee, ScrumTeam, Tester 
//and whihc features are available t each object

	public static void main(String[] args) {
		Employee obj1 = new Employee();
		obj1.empNumber = 2222;
		obj1.salary = 80000;

		ScrumMaster obj2 = new ScrumMaster();
		obj2.empNumber = 3333;
		obj2.salary = 90000;
		obj2.attendMeetings();

		Tester obj3 = new Tester();
		obj3.empNumber = 4444;
		obj3.attendMeetings();
		obj3.work();
		
		ProductOwner.work();//==> className.method
		Employee.work();

	}
}

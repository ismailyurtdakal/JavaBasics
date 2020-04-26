package com.syntax.class21;

public class TestClass {

	public static void main(String[] args) {

		MathTeacher mt = new MathTeacher("Brian", "Quisbert");
		System.out.println(mt.name);
		
		MathTeacher mt1 = new MathTeacher("Ismail", "Yk");
		System.out.println(mt1.name+" "+mt1.lastName);
		
		JavaTeacher jt= new JavaTeacher("Anna", "Smith", "Java 10");
		System.out.println("Teacher "+jt.name+" has "
		        +jt.certifications+
				" certification");

	}
}

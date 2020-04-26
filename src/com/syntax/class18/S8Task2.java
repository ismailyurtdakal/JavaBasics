package com.syntax.class18;

public class S8Task2 {

	// Task2) Write a java program of Class Students that takes students name and
	// 3 subject grades. Inside your class also have a method to Calculate Average
	// Grade.
	// Test Student class for 5 different students with different marks.
	// Your program should print an average mark of each students name.
	// NOTE: please use different names for instance and local variables.

	String name;
	int grade1, grade2, grade3;

	S8Task2(String studentName, int studentGrade1, int studentGrade2, int studentGrade3) {
		name = studentName;
		grade1 = studentGrade1;
		grade2 = studentGrade2;
		grade3 = studentGrade3;
	}

	public int gradeAverage() {
		int total = grade1 + grade2 + grade3;
		int avg = total / 3;
		return avg;
	}

	public static void main(String[] args) {
		S8Task2 s1 = new S8Task2("Abdullah", 81, 89, 74);
		System.out.println(s1.name + "'s average grade is : " + s1.gradeAverage());
		
		S8Task2 s2 = new S8Task2("Omer", 66, 73, 69);
		System.out.println(s2.name + "'s average grade is : " + s2.gradeAverage());
		
		S8Task2 s3 = new S8Task2("Gulen", 97, 95, 91);
		System.out.println(s3.name + "'s average grade is : " + s3.gradeAverage());
	}
}

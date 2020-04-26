package com.syntax.class15;

public class S10CreatingMethods {
//we want to create a method that will accept marks(90,80) 
//based on the marks it will return grade(A,B,C)
//If grade is greater than 90-->A, 80>--B, 80< and >70 --C

	String getGrade(int a) {
		String grade;

		if (a > 90) {
			grade = "A";

		} else if (a <= 90 && a > 80) {
			grade = "B";
		} else if (a <= 80 && a > 70) {
			grade = "C";

		} else if (a > 60) {
			grade = "D";
		} else {
			grade = "F";
		}
		return grade;
	}

	public static void main(String[] args) {
		S10CreatingMethods obj = new S10CreatingMethods();
		String grade = obj.getGrade(55);
		// System.out.println(obj.getGrade(65));

		System.out.println("Your grade is " + grade);

		// if grade is A or B--> good job, otherwise, studey more

		if (grade == "A" || grade == "B") {

			System.out.println("Good job");
		} else {
			System.out.println("Study more");
		}
	}
}

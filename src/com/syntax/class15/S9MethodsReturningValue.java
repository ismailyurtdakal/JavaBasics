package com.syntax.class15;

public class S9MethodsReturningValue {

	public static void main(String[] args) {
		// create a String and based on the length of the String
		// we define whether String is short of long

		String str = "Hello my friend";
		int length = str.length();

		if (length > 10) {
			System.out.println("String is long");
		} else {
			System.out.println("String is short");

		}

// compare 2 numbers and then identify whether largest number is even or odd 
//int num=obj.isLarger(10,20);CE: WATCH THE VIDEO and LOOK AGAIN> Since isLarger does not return any value

//create a method that returns the largest number from 2 given numbers

		S5aNumbers obj = new S5aNumbers();// we are trying to call isLarger method from S5aNumbers
											// class!!!!!!!!!!!!!!!!!!1
		// int num obj.isLarger(10, 20); CE since isLarger does not return any value

		S9MethodsReturningValue obj1 = new S9MethodsReturningValue();
		int num = obj1.largest(12, 13);
		System.out.println(num);

		boolean flag = obj1.isOdd(num);
		System.out.println("Largest number "+num+" is odd which is "+flag);
	}

	// create a method that returns largest number from 2 given numbers

	int largest(int a, int b) {
		int largest;
		if (a > b) {
			largest = a;
		} else {
			largest = b;
		}
		return largest;
	}

	boolean isOdd(int num) {

		boolean isOdd;
		if (num % 2 == 0) {
			isOdd = false;
		} else {
			isOdd = true;
		}
		return isOdd;
	}
}

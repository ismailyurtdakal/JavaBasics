package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperatorsSlide5 {
// if you checking range then will be and & & if you check exact then will be || or
	public static void main(String[] args) {
		/*
		 * Take age input from a user and then based on the age print output if age from
		 * 0-3 --> you are a baby if age from 4-5 --> you are a kid if age from 6-12 -->
		 * you are a child if age from 13-19 --> you are a teenager if age from 20-64
		 * --> you are an adult if age is more or equal to 65 --> you are a senior
		 */

		// step1 - lets declare all variables
		int age;
		Scanner scan; // to import we use shortcut - ctrl+shft+o

		// step2 - capture values
		scan = new Scanner(System.in); // already declared -- not Scanner scan=new Scanner(system.in);
		System.out.println("Please enter your age");
		age = scan.nextInt(); // already declared, not int age=scan.nextInt();

		// step3 - perform verification
		if (age > 0) {

			if (age < 3) {
				System.out.println("You are a baby");
			} else if (age >= 3 && age <= 5) {
				System.out.println("You are a kid");
			} else if (age >= 6 && age <= 19) {
				System.out.println("You are a teenager");
			} else if (age > 20 && age < 65) {
				System.out.println("You are an adult");
			} else if (age == 65) {
				System.out.println("You are a senior");
			} else {
				System.out.println("You are enjoying life");
			}
		} else {
			System.out.println("Please enter a valid age");
		}

	}
}

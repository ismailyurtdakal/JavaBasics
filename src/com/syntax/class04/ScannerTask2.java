package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {

		/*Task 2
		 * You are DMV representative and you need to ask customer 
		 * their age. If they are 18 and older you will issue a 
		 * driver license to them,
		 *  otherwise you will offer them to get a learners permit.
		 */
		Scanner age=new Scanner(System.in);
		System.out.println("Please enter your age");
		int age1=age.nextInt();
		
		if (age1>=18) {
			System.out.println("You can get a diver license");
		}else {
			System.out.println("Please get a learner's permit");
		}
		
		

	}

}

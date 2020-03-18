package com.syntax.class06;

import java.util.Scanner;

public class Class6Slide12Task3 {

	public static void main(String[] args) {
		/*
		 * Using scanner class create calculator. Allow user to enter 2 numbers and
		 * operator(+,-,*,/). Based on operator provide the result to user.
		 * 
		 */

	Scanner scan = new Scanner(System.in);
		System.out.println("please enter a number:");
		double num1 = scan.nextDouble();
		
		System.out.println("please enter another number:");
		double num2 = scan.nextDouble();

	System.out.println("Please enter an operator:+,-,*,/:");
	 char operator=scan.next().charAt(0); 	
  
	    double result=0.0;
		           	
		switch (operator) {
		case '+':
			result = num1 + num2;
			break;

		case '-':
			result = num1 - num2;
			break;

		case '*':
			result = num1 * num2;
			break;

		case '/':
			result = num1 / num2;
			break;
			default:
	System.out.println("Wrong operator");
		}
		if (result!=0.0) {
	System.out.println(num1+" "+operator+" "+ num2+" = "+result);		
		}

	}

}

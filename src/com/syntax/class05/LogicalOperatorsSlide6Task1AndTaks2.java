package com.syntax.class05;

import java.util.Scanner;

public class LogicalOperatorsSlide6Task1AndTaks2 {

	public static void main(String[] args) {
		/*Task1
		 * Prompt the user to enter person heights in inches. Person should be
		 * classified as one of the following: short (under 60 inch) medium(between 60
		 * -72 inch) tall (over 72 inch) 
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("Enter your height");
		
		int h=input.nextInt();
		
		if(h<60 && h>=0) {
			System.out.println("You are short");
		}else if (h>=60 && h<=72) {
			System.out.println("You are medium tall");
		}else if(h>72) {
			System.out.println("You are tall");
		}else {
			System.out.println("Invalid height");
		}
		
		
		/* Task2
		 * Write a program that will print whether it is a
		 * weekend or weekday. If any day from 1-5 → output “It is a weekday”, anyday
		 * from 6-7 → output “It is a weekend”, any other day → output “Invalid day”
		 */

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a day number");
		
		int day=scan.nextInt();
		if(day>=1 && day<=5) {
		System.out.println("Weekday");
		}else if(day==6 || day==7) {
			System.out.println("Weekend");
		}else {
			System.out.println("Invalid day");
		}
		}

}

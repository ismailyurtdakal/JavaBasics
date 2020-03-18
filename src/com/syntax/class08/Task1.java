package com.syntax.class08;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
// Q1)Print numbers from 1 to 50 except those that are divisible by 3

	for (int i=1; i<=50; i++) {
	if(i%3==0) {
		continue;
	}	
		System.out.println(i);
	}	

//Q2))Create a program that will be asking user to apply for 
//a credit card 10 times. As soon you get an “yes” from a user 
//program should stop asking.
	
	int num=1;
	Scanner input= new Scanner(System.in);
	
	for(num=1; num<=10; num++) {
	
	System.out.println("Do you want to apply for a credit card?");
	boolean answer=input.nextBoolean();
	
	if(answer) {
		System.out.println("Congratulations");
		break;
	}
	}
	}
}

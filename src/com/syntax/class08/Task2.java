package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
//Q3)Write a program that reads a range of integers (start and end point), 
//provided by a user and then from that range prints the sum of the even and 
//odd integers.

		Scanner input = new Scanner(System.in);
        		
		System.out.println("please enter starting integer");
		int min= input.nextInt();
		
		System.out.println("please enter starting integer which is bigger than starting integer");
		int max=input.nextInt();
		
		int evenSum=0;
		int oddSum=0;
		
		for (int i=min; i<=max; i++ ) {
			if (i%2==0) {
				evenSum=evenSum+i;
			} else {
				oddSum=oddSum+i;
			}
		}
		System.out.println("The sum of the even integers is "+evenSum);
		System.out.println("The sum of the odd integers is "+oddSum);
			}

}	
		

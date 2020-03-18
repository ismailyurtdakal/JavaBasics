package com.syntax.class07;

import java.util.Scanner;

public class Class7Slide10Examples2ndWay {

	public static void main(String[] args) {
//we are playing a lottery and lucky number is 17;
//we want to keep asking user any number from 1-20 
//until he guess the lucky number			
		
		Scanner scan;
		int number;
		int lukcyNumber;
		scan=new Scanner(System.in);

		int luckyNumber = 17;
		do {
		System.out.println("Please enter ny number from 1 to 20");
		
		number=scan.nextInt();
		}while(number!=luckyNumber);
		System.out.println("You got it!!!!");
	
	}

}

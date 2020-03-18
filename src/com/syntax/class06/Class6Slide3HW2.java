package com.syntax.class06;

import java.util.Scanner;

public class Class6Slide3HW2 {

	public static void main(String[] args) {
		
//		Write a program that will read three inputs of scores (quiz, mid term, and final scores) and determine the grade based on the following rules: 
//		if the average score >=90 → grade=A
//		if the average score >= 70 and <90 → grade=B
//		if the average score>=50 and <70 → grade=C
//		if the average score<50 → grade=F
	Scanner scan = new Scanner(System.in);
	String grade=null;
	System.out.println("What is your quiz score? ");
	int q = scan.nextInt();
	System.out.println("What is your mid term score? ");
	int m = scan.nextInt();
	System.out.println("What is your final score? ");
	int f = scan.nextInt();
	if (((q + f + m) / 3) >= 90) 
		grade ="is A";
	 else if (((q + f + m) / 3) >= 70 && ((q + f + m) / 3)< 90) 
		grade="is B";
	 else if (((q + f + m) / 3) >= 50 &&((q + f + m) / 3) < 70) 
		grade=" is C";
	 else if (((q + f + m) / 3) < 50 && ((q + f + m) / 3)>=0) 
	grade="is F";
		System.out.println("Your average score "+ grade);
}


		

	}



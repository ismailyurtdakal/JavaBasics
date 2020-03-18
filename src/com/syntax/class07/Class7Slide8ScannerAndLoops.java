package com.syntax.class07;

import java.util.Scanner;

public class Class7Slide8ScannerAndLoops {

	public static void main(String[] args) {
	
//we want to ask user's name and print Good afternoon ____;
	
		
		int num = 1;
		Scanner input=new Scanner(System.in);
		while(num<=5) {
		
		System.out.println("What is your name");
		String name=input.nextLine();
		
		System.out.println("Good afternoon "+name);

		num++;
	}
		
	}
}

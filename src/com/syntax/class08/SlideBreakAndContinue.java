package com.syntax.class08;

public class SlideBreakAndContinue {

	public static void main(String[] args) {
		for (int i=1; i<21; i++) {
			if(i==5 || i==6 || i==7) {
		continue;		
			}
		System.out.println(i);
		}
System.out.println("---------------Continue Example-------");
	
//Write a program that prints numbers from 1 to 100
// I do not want to print 35-55
	
	for (int i=1; i<=100; i++) {
		if(i>=35 && i<=55) {
			continue;
		}
		System.out.println(i);
	}
}
}


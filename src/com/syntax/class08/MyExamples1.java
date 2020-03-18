package com.syntax.class08;

public class MyExamples1 {

	public static void main(String[] args) {
		// Q1) print even numbers from 100 to 1 using for loop
		
		for (int i=50; i>=1; i--) {
		
			System.out.println(2*i-1);
		}	
		System.out.println("----------2nd Way-----");
		
		for (int x=99; x>=1; x-=2) {	
		
		System.out.println(x);
		}
		System.out.println("----------3rd Way-----");
		
		for (int y=1; y<=50; y++ ) {
			
			System.out.println(101-2*y);
		}
	}

}

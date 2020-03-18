package com.syntax.class08;

public class MyExamples2 {

	public static void main(String[] args) {
		// Q2) Print odd numbers from 100 to 1 by using for loop.
		for (int i = 0; i <= 100; i += 2) {

			System.out.println(100 - i);
		}
		System.out.println("---------------2nd way------");

		for (int a = 0; a <= 50; a++) {

			System.out.println(100-2*a);
		}
		System.out.println("---------------3rd way------");
		
		for(int b=100; b>=0; b-=2) {
			System.out.println(b);
		}
		System.out.println("---------------4th way------");
		
		for(int c=51; c>=1; c--) {
		System.out.println(2*c-2);	
		}
	}

}

package com.syntax.class08;

public class MyExample3 {

	public static void main(String[] args) {
		// Q3) Print numbers both divisible by 3 and 7 from 1 to 100.
		
		for (int i=1; i<=100; i++) {
		
		
		if(i%3==0 && i%7==0) {
			System.out.println(i);	
		}
		
		}
		System.out.println("----------2nd way----------");	
		
		for (int a=1; a<=100; a++) {
		if(a%21==0) {
		System.out.println(a);	
			
		}	
		
		System.out.println("----------3rd way----------");	
		for(int b=1; b<=4; b++) {
		System.out.println(b*21);	
			
		}
		}
		
		
	}

}

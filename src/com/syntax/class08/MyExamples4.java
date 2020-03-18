package com.syntax.class08;

public class MyExamples4 {

	public static void main(String[] args) {
		// Q4) Print the powers of 2 till 256 (2,4,8,16,32...)

		for (int i=1; i<=256; i*=2) {
		System.out.println(i);	
		}
	System.out.println("----------------2nd way--------");	
	
	for(int a=0; a<=7; a++ ) {
	
		System.out.println((int)Math.pow(2, a));
		
	}
	
	System.out.println("--------------3rd way------");
	
	int power=1;
	for (int b=0; b<8; b++) {
		System.out.println(power);
		power=power*2;
	}
	}

}

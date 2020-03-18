package com.syntax.class08;

import java.util.Scanner;

public class Slide1Recap {
	public static void main(String[] args) {
/* Ask a user to pay for a candy
 * As long as the entered price is not 2
 * We need to keep asking for paying
 * One amount is correct --> "Enjoy your candy"
 * 
 */
		Scanner s;
	double price;
	s=new Scanner(System.in);
	
	do {
	System.out.println("Please pay for a candy");
	price=s.nextDouble();
	
	} while (price!=2);
	System.out.println("Enjoy your candy");
//2nd way with while
	
// while (price!=2){
// System.out.println("Please pay for a candy");
//	price=s.nextDouble();
//	}
//	System.out.println("Enjoy your candy");
	
}
}
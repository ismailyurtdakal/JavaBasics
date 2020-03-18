package com.syntax.class04;

import java.util.Scanner;

public class ScannerExample1 {

	public static void main(String[] args) {
		
		/*Scanner class --> it takes input from a user, we will provide input value from a console. That value will be taking and used in the program.
		 * 
		 * 
		 * String a=scan.next();  --> one word
		 * String b=scan.nextLine();  --> more than one word
		 */
		
		Scanner scan=new Scanner(System.in);
        
		System.out.println("Please enter and text");
		
		String text=scan.nextLine();
		System.out.println(text);
		
		System.out.println("Please enter any number");
		int number=scan.nextInt();
		
		System.out.println(number);
				
		System.out.println("End of program");
		
		
		
	}

}

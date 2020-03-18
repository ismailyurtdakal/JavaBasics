package com.syntax.class06;

import java.util.Scanner;

public class Class6Slide10Task1 {

	public static void main(String[] args) {
		/* Task1
		 * Ask user to enter their country and capture it. 
		 * Once values are captured print which language user speaks. 
		 */
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please your country");
		
		String country=scan.nextLine();
		String language;
		
		switch(country) {
		
		case "Turkey":
		language = "Turkish";	
		break;
		
		case "France":
			language ="French";
		break;
		
		case "German":
		language="German";	
		break;
		
		default:
			language="Unknown";
		}
		System.out.println("You speak "+language);
	}

}

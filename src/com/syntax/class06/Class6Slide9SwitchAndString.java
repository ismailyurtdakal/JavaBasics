package com.syntax.class06;

import java.util.Scanner;

public class Class6Slide9SwitchAndString {

	public static void main(String[] args) {
		/* Ask user where he or she is from
		 * based on the country we will define favorite food 
		 * Your favorite food is ________
		 * 
		 */

		
		Scanner scan;
		String country;
		String favoriteFood;
		
		favoriteFood=null;
		scan=new Scanner(System.in);
		System.out.println("Please enter your country");
		
		country=scan.nextLine();
		
		switch(country) {//country.toLowerCase()
		
		case "Morocco":
			favoriteFood="couscous";
			break;
		case "Belarus":
			favoriteFood="Potato";
			break;
		case "Turkey":
			favoriteFood="baklava";
			break;
		case "Afghanistan":
			break;
		case "Kazakhstan":
			favoriteFood="Beshparmak";
			break;
			default:
			favoriteFood="Unknown";
	}
	System.out.println("Your favorite food is "+ favoriteFood);
	}
}

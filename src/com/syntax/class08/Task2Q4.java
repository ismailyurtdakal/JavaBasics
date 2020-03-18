package com.syntax.class08;

import java.util.Scanner;

public class Task2Q4 {

	public static void main(String[] args) {
		//Q4) Write a program to ask a user to enter item they want to buy and 
		//the price of that item. Every time user enters money accumulate the amount and 
		//tell the user how much is left to pay off the amount. If user give more money 
		//program should return a change. Whenever a user done with payments program should 
		//say “Thank you for shopping!”

		Scanner input = new Scanner(System.in);
		double paid = 0;
		
		System.out.println("Please enter what you want to buy:");
		String item = input.nextLine();
		
		System.out.println("Enter the price of " + item+ " in dollars");
		double price = input.nextDouble();
		while (paid < price) {
		
		System.out.println("Enter the money you want to pay at this time");
		double amount = input.nextDouble();
		
		paid = paid + amount;
		if(paid>price){
			break;
}
	System.out.println("You have "+(price-paid)+" dollars left to pay off");
}
	System.out.println("Thank you for shopping, here is your change :" + (paid-price));

	}

}

package com.syntax.class08;

import java.util.Scanner;

public class Q42ndWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s;
		String item;
		double amount = 0;
		double price;
		double money;
			double change;
		double remaingBalance;
		s=new Scanner(System.in);
		
		System.out.println("What are you buying today");
		item = s.nextLine();
		
		System.out.println("What is the price for the "+item);
		price=s.nextDouble();
	
		do {
		System.out.println("please give payment");	
		money=s.nextDouble();

		amount=amount+money;
		
		if(money<price) {
			remaingBalance=price-money;
			System.out.println("Please give more "+remaingBalance);
		}else if (amount>price) {
			change=amount-price;
			System.out.println("Here is your change "+change); 
		}else
		System.out.println("Thank you");	
		}while(price!=amount);
		
	}

}

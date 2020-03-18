package com.syntax.class04;

import java.util.Scanner;

public class ScannerTasks {

	public static void main(String[] args) {
	/*Task 1
	 *  You are a loan specialist and you need to ask user what is 
	 *  the amount of loan is needed. If loan is less than 200000 
	 *  then you would lend the money otherwise you would reject the client.
	 */

		Scanner loan=new Scanner(System.in);
		System.out.println("Please enter the loan amount you need");
		int loan1=loan.nextInt();
		
		if(loan1<200000) {
			
			System.out.println("I will lend the money");
		}else {
			System.out.println("I will reject the client");
		}
		
		
		
		
		
	}

}

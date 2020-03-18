package com.syntax.class04;

import java.util.Scanner;

public class ScannerTask3 {

	public static void main(String[] args) {
		/*Task3
		 * Create a Java program that will ask user to input city and 
		 * temperature. Your program should convert Fahrenheit into celcius
		 *  and print 
		 * “The temperature is the city __ is __”
		 */
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the city?");
		String city=input.nextLine();
		
		System.out.println("Enter the temperature");
		int temp=input.nextInt();
		temp=(temp-32)*5/9;
		
		System.out.println("The temperature in the city "+city +" is "+ temp +" celcius");
		
		
		

	}

}

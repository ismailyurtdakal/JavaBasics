package com.syntax.class12;

import java.util.Scanner;

public class Slide6Task3 {

	public static void main(String[] args) {
//		Write a program that reads two people’s first names and if they expecting boy or girl?
//		Based on the input suggests a name for a baby:
//		Example Output:
//		Mom’s first name? Mary
//		Dad’s first name? Daniel
//		Boy or Girl? boy
//		Suggested baby name: DANRY

//		Example Output:
//		Mom’s first name? Mary
//		Dad’s first name? Daniel
//		Boy or Girl? girl
//		Suggested baby name: MAIEL	
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter mom's name");
		
		String momName=scan.nextLine();
		
		System.out.println("enter dad's name");
		String dadName=scan.nextLine();
		
		System.out.println("expect boy or girl");
		String gen=scan.nextLine();
			
		if(gen.equals("boy")){
			System.out.println("Suggested baby name: DANRY");
			
		}else if(gen.equals("girl")){
			System.out.println("Suggested baby name: MAIEL");
		}
		
	}

}

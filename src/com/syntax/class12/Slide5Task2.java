package com.syntax.class12;

import java.util.Scanner;

public class Slide5Task2 {

	public static void main(String[] args) {

//Task2	Create a String and if the String is not empty perform the following: 
//if the String has an odd number of characters and has 3 or more characters, 
//print the character in the middle of the String.

		
Scanner input=new Scanner(System.in);	

System.out.println("Enter a string please");

String s=input.nextLine();

if(!s.isEmpty()) {
	if(s.length()%2==1 && s.length() >=3){
				
	}
	System.out.println(s.charAt(s.length()/2));
}else {
	System.out.println("Even number of characters");
}

	}

}

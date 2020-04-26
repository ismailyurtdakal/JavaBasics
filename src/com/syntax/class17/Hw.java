package com.syntax.class17;

public class Hw {
//1)	Create a method createEmail(). Based on provided 
	// users name, lastName and email type, your method should
//return complete email Address. 
//Example: johnsnow@gmail.com or johnsnow@yahoo.com*
//	
	String userName = "Mert";
	String lastName = "Abdullah";

	String createEmail(String email) {

		if (email.contentEquals("yahoo") && email.contentEquals("gmail")) {

		}

		return email;
	}

	public static void main(String[] args) {
		Hw obj=new Hw();
		String str=obj.createEmail("jahnson@yahoo.com");
		System.out.println(str);
		
		String str2=obj.createEmail("johnson@gmail.com");
		System.out.println(str2);
		
		
	}
	
	
//2)	Write a method to return whether given number is prime or not?
//	

}

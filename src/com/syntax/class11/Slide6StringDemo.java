package com.syntax.class11;

public class Slide6StringDemo {

	public static void main(String[] args) {
		String school = "Syntax ";
		
		String str =new String("heLLO");
		
		String srt1="This is a String 7676,*&^%";
		
//How many characters does String have
		
		System.out.println(school.length());//space is a character too
		
		int size=str.length();
		System.out.println(size);
		
		
		//convert String to lowercase or uppercase

		System.out.println(school.toUpperCase());
		
		//convert to lowercase
		
		str=str.toLowerCase();
		System.out.println(str.toLowerCase());
		
		//Concatenate 2 Strings
		System.out.println("---CONCAT. FUNCTION---");
		String newString=str+school;
		System.out.println(newString);
		
		
		String day="Saturday";
		String date="14";
		
		String newDate=day.concat(date); //We can add 2 String by this way too. IT IS FOR STRINGS ONLYYY
		
		char grade='A';
		String str2="Student";
		
		//str2.concat(grade); concat() is for STRINGS ONLYYY
		
		
		System.out.println("----------isEmpthy-----");
		String str3=" ";
		boolean empty=str3.isEmpty();
		System.out.println(empty);
		
		
		System.out.println("-----------trim()------");
//removes empty/white space at the beginning and at the end of the String		
		String str4="Welcome to Syntax!    ";
		
		str4=str4.trim();
		
		System.out.println(str4);
	}

}

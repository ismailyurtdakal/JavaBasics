package com.syntax.class11;

public class Slide5StringIntro {

	public static void main(String[] args) {
		// combination of characters
/*  String is a class
 *  String str="Hello"; 
 *  str==>variable name/identifier
 *  str is literal
 *  Hello==>value that we assign to the variable str
 *  		
 * int num=10; num is integral literal
 * 
 * String is a class
 * String str=new String ("Hello);
 * 
 * We can do with string:
 * 1.Compare
 * 2.verify is String has this or that 
 * 3.Exact values/another froma String
 * 
 * String manipulations functions/methods
 * length() --> how many char
 * toUpperCase()/toLowerCase()--> converting upp to lower
 * 
 * empty()--> checks if any characters inside the String 
 * 
 * trim() --> cuts spaces before and after the String
 * 
 * equals()/equalsIgnoreCae()--> compare 2 Strings
 * 
 * contains() --> checks if certain sequence if character(s) present in the String
 * 
 * startsWith()/endsWith() --> check if String starts/ends with a particular seq if charcters
 * 
 * concat() --> to attached 1 String to another String
 * 
 * 
 */
	String a="Hello how are you";
	boolean b=a.endsWith("u");
	
	if(b) {
		System.out.println(b);
	}
	


	}

}

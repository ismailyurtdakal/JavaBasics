package com.syntax.class12;

public class Slide10Tasks {

	public static void main(String[] args) {
//Task1	Create a String that will hold a sentence. 
//Write a program to get a new String without any spaces.

String str=" Today is Sunday";

String[] str1= str.split(" ");
for(String a:str1) {
	System.out.print(a);
}		
System.out.println();
//Task2)Create a String that should be combination of letters,numbers and special characters. 
//Find out how many alpha characters are there in the String.

String a="Hello ++World&$ Howare re!!you **today";

a=a.replaceAll("^a-Za-z", "");
System.out.println(a.length());
	}

}

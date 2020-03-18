package com.syntax.class12;

public class Slide4Tasks {

	public static void main(String[] args) {
//Task1 Create a String and print it in reverse order (Sunday-> yadnuS)
		
	String day="Sunday";
		char word;
			for(int i=day.length()-1; i>=0; i-- ) {
			word=day.charAt(i);
			System.out.print(word);
			}

	
	}
}


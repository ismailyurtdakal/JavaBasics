package com.syntax.class13;

public class PalindromeOrNot {

	public static void main(String[] args) {
		String str ="kayak";
		char [] charArray= str.toCharArray();

		String reverse="";
		System.out.println(reverse.isEmpty());
		
		for(int i=charArray.length-1; i>=0; i--) {
		
			reverse+=charArray[i];
		}
			
	
		if(str.contentEquals(reverse)) {
				System.out.println("Yes, it is a palindrome");
			}else {
				System.out.println("No, it is not a palindrome");
			}
		}
	}



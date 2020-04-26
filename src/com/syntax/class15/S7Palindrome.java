package com.syntax.class15;

public class S7Palindrome {
	void word(String a) {
		String rev="";
		for(int i=a.length()-1; i>=0; i--) {
			char b=a.charAt(i);
			rev=rev+b;
		}
		if(a.equalsIgnoreCase(rev)) {
			System.out.println(a+" is a palindrome");
		}else {
			System.out.println(a+" is not a palindrome");	
		}
	}

	public static void main(String[] args) {
		S7Palindrome obj = new S7Palindrome();
		obj.word("level");

	}
}
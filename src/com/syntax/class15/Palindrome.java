package com.syntax.class15;

public class Palindrome {
	void word(String a ) {
        String rev="";
        for (int i=a.length()-1; i>=0; i--) {
        char c=a.charAt(i);
        rev=rev+c;
        
        }
        if (a.equalsIgnoreCase(rev)) {
            System.out.println("It is a palindrome");
        }else 
        {System.out.println("It is not palindrome");
    }
    }
    
    
    public static void main(String[] args) {
    Palindrome q=new Palindrome();
    q.word("mom");
    
    }
}
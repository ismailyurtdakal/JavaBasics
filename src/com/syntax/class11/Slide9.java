package com.syntax.class11;

public class Slide9 {

	public static void main(String[] args) {
//1) Username and Password cannot be  empty, 
//if so→ message=“Username and Password cannot be empty”.
		
		String username="";
		String password="";
		boolean empty=username.isEmpty();
		boolean empty1=password.isEmpty();
		
		if(empty) {
			if(empty1) {
		System.out.println("Username and Password cannot be empty");	
				
			}
		}
//2) Password should be minimum 8 characters,
//if less → message=“Password is too short”.
	String pw="aglhs";
	
	int size= pw.length();
	if(size<8) {
		System.out.println("Password is too short");
	}
//3) Password cannot contain username 
//if so, → message=“Password cannot contain username”.		
	String username1="username";
	
	boolean a=username1.contains("username");
	if(a) {
		System.out.println("Password cannot contain username");
	}
//4)Password should match confirmed password, 
//if not  → message=“Passwords do not match”.
	
	String exp="12345";
	String act="12345";
	
	if(act.equals(exp)) {
		System.out.println("Your username and password has been created");
	}else {
		System.out.println("Passwords do NOT match");
	}
	
	}

}

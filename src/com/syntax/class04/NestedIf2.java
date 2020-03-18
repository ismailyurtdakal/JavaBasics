package com.syntax.class04;

public class NestedIf2 {

	public static void main(String[] args) {
		
//Nested if
		
//if (boolean expression){
//code
//if (boolean(exp){
//code	
//}	
	boolean flag=false;
	boolean classToday=true;	
	
	if(flag) {
		System.out.println("Good morning");
		
		if(classToday) {
			System.out.println("Hello friends");
		}else {
		System.out.println("Hello Family");
	}
	}else {
		
		System.out.println("Bye");
	}
	System.out.println("I am outide of if condition");	
//	}		
//	}
}
}

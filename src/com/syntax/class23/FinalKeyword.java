package com.syntax.class23;

public class FinalKeyword {
	public static String str = "Hello";
	public final String str1="Bye";//Final variable = CONSTANT variable
	//final variable has to be initialized!!!!!!!!!
	
	static final String APPLICATION_URL="syntax.com";
	
	//final variable names are usually capitalized and 
	//used underscore between words 
	
	public static final char GRADE='A';
	
	
	public static void main(String[] args) {
	str="Hi";
	//str1="good bye"; CE: final cannot be changed
	
	//applicationURL="google.com" CE: cannot be changed!!!!!!!!
		
	}
	
	public final void hello(){
		System.out.println(" I am a final method");
		
	}
	
//	class SubClass extends FinalKeyword{
//		//public void hello(){CE: cannot be overriding
//			
//		}
	
	public void hello(String name) {
		System.out.println("Hello "+name);//We can overload 
	}
	
	}

class SubClass extends FinalKeyword{
	
//	public void hello() {CE: cannot override final method
//		
//	}
	
	public void hello(int num) {//not overriding
		System.out.println("Hello from child class");
	}
}


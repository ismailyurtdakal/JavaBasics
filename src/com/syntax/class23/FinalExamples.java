package com.syntax.class23;

public class FinalExamples {

	final  String str="I love Java";//If we have static we can print!!!
	
	final void saySmth(String str) {
		System.out.println(str);
	}
	public static void main(String[] args){
		
		FinalExamples obj=new FinalExamples();
		//obj.str="I DO LOVE JAVA"; CE: final variables cannot be changed!
//	System.out.println(str); 
	
	obj.saySmth("Hello");
	}
	
}

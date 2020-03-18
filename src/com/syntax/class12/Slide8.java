package com.syntax.class12;

public class Slide8 {

	public static void main(String[] args) {
		String me="I am a good tester";

		System.out.println("----replace() function");
		
		String newString=me.replace("a", "c");
		System.out.println(newString);
		
		me=me.replace("good", "great");
		System.out.println(me);
		me=me.replace("awesome","great");
		
		System.out.println(me);//not replace, we don't have Awesome yet
		
		String car="I have a Toyota";
		
		car=car.replace("Toyota","Lexus");
		
		System.out.println(car); 
		
		System.out.println("--------REPLACE ALL-----------");
		
		
		String str="Phone number is 1234567890";
	    System.out.println(str);
		
		str=str.replaceAll("[A-Za-z]", "");
		System.out.println(str);
		
		String str1="Hello12347*&***    !!!!89";
		str1=str1.replaceAll("[0-9]", "A");
		System.out.println(str1);
		
		
		str1=str1.replaceAll("[^A-Za-z]", "");
		
		System.out.println(str1);
		
		String str3= "Hello123^&^&^&^&!";
		str3=str3.replaceAll("[^A-Za-z0-9]","");
		System.out.println(str3);
	
	
	
	}

}

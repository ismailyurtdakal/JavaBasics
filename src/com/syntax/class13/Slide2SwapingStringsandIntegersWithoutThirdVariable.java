package com.syntax.class13;

public class Slide2SwapingStringsandIntegersWithoutThirdVariable {

	public static void main(String[] args) {
//		Swaping integer

		int a =10;
		int b=20;
		a=a+b;//30
		b=a-b;//30-20=10
		a=a-b;
		System.out.println("value of a ="+a);
		System.out.println("value of b ="+b);
		
		
		//swaping string values
		String str1="Dayyyyy";
		String str2="Night";
		
		str1=str1+str2;//DayNight ---> Lenght is now 8 
		str2=str1.substring(0, str1.length()-str2.length());//Day
		str1=str1.substring(str2.length());//Night
		
				
		System.out.println("value of str1 ="+str1);
		System.out.println("value of str2 ="+str2);
	}

}

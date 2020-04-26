package com.syntax.class18;

public class S2Hws {
//	1)Create a method that will accept an array as parameters and will return a sum of all elements from that array. Method should be visibly only within same package and accessible by the creating an instance of the class.
//	2)Create a method that will take a String as a parameter and returns reverse String. Method should be available to all classes within your projects and accessible by class name.
//	3)Create a method that will accept a String as a parameter and return a new String that consist only of vowels. Method should be available inside the class where it was declared and executed by calling it is name.

	//1)
	protected int array(int[] a) {
		int total = 0;
		for (int i = 0; i < a.length; i++) {
			total = total + a[i];
		}
		return total; //array total are local variables. variables in an array or method are local
	}
		public static void main1(String[] args) {
		S2Hws obj = new S2Hws();
		int[] a = { 2, 7, 19, 857 };
		System.out.println("total: " + obj.array(a));
	
	}
	//2	
//		public static void main(String[] args) {
//			char reverse;
//			for ( int a=word.length(); a>0; --a) {
//				reverse=word.charAt(a-1);
//				System.out.print(reverse);	}
//		}
//			public static void main(String[] args) {
//				TASK2 obj= new TASK2();
//				obj.word=“syntax”;
//				method1();
//	}
		
//3
		
		private  String WithVowel(String str) {
			str=str.replaceAll("[a-zA-Z&&[^aeiouAEIOU]]","");
		return str;
		}
		public static void main(String[] args) {
			S2Hws obj=new S2Hws();
		System.out.println(obj.WithVowel("merhaba arkadaslar   "));
		}
		
	
			
			
		}

	
	


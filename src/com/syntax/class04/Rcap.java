package com.syntax.class04;

public class Rcap {
	public static void main(String[] args) {
		//Type Casting:
		//Narrowing--explicitly
		//Widening --> implicitly happens by complier
		//byte--> short-->int-->long-->float-->double
		
		int a=(int)10.99;
		
		System.out.println(a);
		
		//verification
		//selective execution
		
		int temp=70;
		
		if(temp>95) {
			System.out.println("It is super hot");
		}else if(temp<=80) {
			System.out.println("The weather is so nice"); 
							
		}
		
		// if(boolean expression) {
		// }else if (boolean expression)
	}

}

package com.syntax.class13;

public class FibonacciNumbers {

	public static void main(String[] args) {
		/* Write a Java program to print first 10 numbers of Fibonacci series
		 *  
		 */
//0,1,1,2,3,4,8,13,21		
		int a=0;
		int b=1;
		
		for(int i=0; i<10; i++) {
		
			System.out.print(a+ " ");	
			
			int c=a+b;
			 a=b;
			 b=c;
		}
		System.out.println();
	System.out.println("---2nd way from Mr. Mert---");	
		 int[] fib = new int[10];
         fib[0] = 0;
         fib[1] = 1;
         for (int i = 2; i < 10; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
         }
         System.out.println("Here are the first 10 Fibonacci numbers:");
         for (int j = 0; j < 10; j++) {
                System.out.print(fib[j] + " ");
		
	}
}
}
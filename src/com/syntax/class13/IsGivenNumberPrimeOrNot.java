package com.syntax.class13;

public class IsGivenNumberPrimeOrNot {

	public static void main(String[] args) {
		/* Write a java progam to check whether a given number is aprime or not?
		 * 
		 * prime number is a number that is greater than 1
		 * prime number should meet 2 condititions(divisible by one and itself only0
		 * 
		 * 2(1,2),3(1,2,3),5(1,2,3,4,5),7,11,13,17,19
		 */

		int given = 8;
		
		boolean isPrime = true;
		
		if(given>1) {
		
		for( int i=2; i<given; i++) {
			
			if(given%i==0) {
				isPrime=false;
				break;
			}
		}	
			
			
			
		}else {
			isPrime=false;
		}
		
		System.out.println("Given number "+given+" is Prime? "+isPrime  );
	}

}

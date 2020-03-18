package com.syntax.class07;

public class HW1 {

	public static void main(String[] args) {
		//HW1) Print numbers from 1 to 100 in 1 line with space
		System.out.println("HW1) Print numbers from 1 to 100 in 1 line with space");
		for (int i=1; i<=100; i++) {
		System.out.print(i+" ");
		}		
	
		//HW2)Print numbers from 100 to 1
	
		for(int i=100; i>=1; i--) {
		
		System.out.println(i);
		}

		//HW3) Print even numbers from 20 to 1 (2 ways)
		System.out.println("HW3) Print even numbers from 20 to 1 (1st way)");
		for(int i=10; i>=1; i--) {
		System.out.println(2*i);	
		}
		System.out.println("HW3) Print even numbers from 20 to 1 (2nd way)");
		for (int i=20; i>0; i-=2) {
		System.out.println(i);	
		}
		
		//HW4) Print odd numbers between 20 and 50 (2 ways)
		System.out.println("HW4 1st way");
		for(int i=20; i<=48; i++ ) {
			System.out.println(i+1);
		}	
		
		System.out.println("Hw4 2nd way");
		for(int i=10; i<=24; i++) {
		
					
		System.out.println(2*i+1);	
		}
//for (int i=20; i<=50; i++){
//	if(i%2!=0)
//Sysyem.out.println(i);		
//	}		
	}
		
	

	}



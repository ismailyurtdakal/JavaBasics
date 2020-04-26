package com.syntax.class10;

public class Class10Slide2 {

	public static void main(String[] args) {
		// char[] grades1 =new char[6];
		
		char[] grades =new char[6];
		
		grades[0]='A';
		grades[1]='B';
		grades[2]='C';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		System.out.println(grades[1]);

//		char[] grades2= {'A', 'B','C', 'D', 'E', 'F'};

//		System.out.println(grades2[1]);
		
		//getting all elements
//		for(int i=0; i<grades.length; i++) {
//		System.out.println(grades[i]);	
		
//		System.out.println("--------advanced for loop-----");
		
			for(char g:grades) {
			System.out.print(g+" ");
//2 tane loop oldugu icin hata verdi			
		}
		
			
		}

	}

//}

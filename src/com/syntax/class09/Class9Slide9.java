package com.syntax.class09;

public class Class9Slide9 {

	public static void main(String[] args) {
		//4 rows 4 increasing *
		//  *
        //  **
		//  ***
		//  ****
		
		for (int r=1; r<=4; r++) {
			
			for(int c=1; c<=r; c++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

package com.syntax.class010;

public class Class16 {

	public static void main(String[] args) {
		int[][] arr = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
		
		int maxI=0; 
		int maxJ=0;
		for(int i=0; i<arr.length; i++ ){
		for(int j=0; j<arr[i].length; j++){
		  
		  	if(arr[i][j] > arr[maxI][maxJ]) {
		  	  maxI=i;
		  	  maxJ=j;
		  	}
		
		  }

		}
	System.out.println(arr[maxI][maxJ]);
	}
		
		}
	
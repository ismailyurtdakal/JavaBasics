package com.syntax.class10;

public class Study14 {

	public static void main(String[] args) {
		 int sum=0;
		int[][] a = {
			{-5,-2,-3,7},
			{1,-5,-2, 2},
			{1,-2, 3,-4}
		};
	
	for (int i=0; i<a.length; i++){
		  
		for(int j=0; j<a[i].length; j++){
		    	  sum=sum+a[i][j];
		  }
	
		}
	System.out.println(sum);	
		}
	}


package com.syntax.class010;

public class Study13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {
				{-5,-2,-3,7},
				{1,-5,-2,2},
				{1,-2,3,-4}
			};
			 
			for(int i=0; i<a.length; i+=2){
			  
			  int sum = 0;
			  for(int j=0; j<a[i].length; j+=2){
			sum=a[i][j]+i+j;
			  }
			System.out.println(sum);	
			} 
	
		}
	}
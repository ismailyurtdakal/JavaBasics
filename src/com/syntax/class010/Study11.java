package com.syntax.class010;

public class Study11 {

	public static void main(String[] args) {
		int[][] arr = {
				{5,2,3,7},
				{1,5,1,1},
				{8,3,1,2}
			};
	
		for(int i=0; i<arr.length; i++ ){
		int max=arr[i][0];

	  for(int j=0; j<arr[i].length; j++){
	
		  if(arr[i][j]>max){
	    max=arr[i][j];
	    
	  }
 System.out.println(max); 
	}
	

		}
	}
}
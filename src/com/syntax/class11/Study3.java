package com.syntax.class11;

public class Study3 {

	public static void main(String[] args) {
//find the sum of the elements. 
//how many elements are there?
//average of elements		
		
		int[][] nums= {{177,-4,15,35,66}, {33, 42, 144}, {897, 61,-14,100}, {1,2,3,4}};
		
		int sum=0;
		int noElements=0;
		for(int i=0; i<nums.length; i++) {
			for(int j=0; j<nums[i].length; j++) {
				System.out.print(nums[i][j]+" ");
				sum=sum+nums[i][j];
				noElements+=1;
			}
			System.out.println();
		}
		System.out.println("Sum of all elements in this array is "+sum);
		System.out.println("There are "+noElements+" elements in the array");
		System.out.println("The average of the elements entered is "+sum/noElements);

	}

}

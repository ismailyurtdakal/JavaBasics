package com.syntax.class010;

public class Class10Slide7 {

	public static void main(String[] args) {
		// find largest element form an array

		int[] nums = { 200, 30, -1, 900, 56, 787666 };

		int largest = nums[0];//we assume 200 is the largest

		for (int i = 0; i < nums.length; i++) {

			if (nums[i]>largest  ) {
				largest = nums[i];
			}
		}
		System.out.println("Maximum value:" + largest);
	}
}

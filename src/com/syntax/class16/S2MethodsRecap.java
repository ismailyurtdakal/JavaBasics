package com.syntax.class16;

public class S2MethodsRecap {

	// create a method that will accept array of inetegers and
	// return max elements from that array

	int getLargestNumber(int[] array) {

		int largest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;
	}

	// create a method that will accept a String and
	// return each word from a given String

	String[] getWordsFromString(String str) {
		String[] array = str.split(" ");
		return array;
	}

	public static void main(String[] args) {
	
		
		S2MethodsRecap obj=new S2MethodsRecap();
		
		int[] arr= {10,20,38,12};
		System.out.println(obj.getLargestNumber(arr));
		
		String myString="It is a beatuiful world";
		String[] words=obj.getWordsFromString(myString);
		
		for(String i:words) {
			
			System.out.print(i+" ");
		}
		
		
	}
}

package com.syntax.class10;

public class Class10Slide4TASK1 {

	public static void main(String[] args) {
// TASK1 Create an array of animals and store 6 elements into it. 
//		Using 2 different loops print all elements from the array.
		
		String[] animals= {"cat", "dog", "mouse", "bird", "chicken","elephant"}; 

		for (int i=0; i<animals.length; i++) {
			System.out.println(animals[i]);

		}
		System.out.println("--2nd way--");
for (String a:animals) {
	System.out.println(a);
      }
   }
}

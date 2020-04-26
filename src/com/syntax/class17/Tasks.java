package com.syntax.class17;

public class Tasks {
//	1)Create a method that will accept an array as parameters and 
//will return a sum of all elements from that array. 
//Method should be visibly only within same package and accessible  
//by creating an instance of the class.

	int add(int [] a) {
		int total=0;
		 for (int i=0; i<a.length; i++) {
		 
			 total= total+a[i];
	}
		return total;
		
	 }
		public static void main(String[] args) {
			Tasks obj=new Tasks();
			
			int[] y= {10,12,13,15};
			//int arr=obj.add(y);
			//System.out.println("Sum of all array element is: "+arr);
System.out.println(obj.add(y));
			
		}
	}
	
	//	2)Create a method that will take a String as a parameter and returns reverse String. Method should be available to all classes within your projects and accessible by class name.
//	3)Create a method that will accept a String as a parameter and return a new String that consist only of vowels. Method should be available inside the class where it was declared and executed by calling it is name.
//
//	



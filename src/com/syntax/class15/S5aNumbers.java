package com.syntax.class15;

public class S5aNumbers {
//Task1 create a method that will take 2 parameters 
//as numbers and prints which one is larger	
	void isLarger(int a, int b) {
		if (a > b) {
			System.out.println(a+" is larger than "+b);
		} else if(a<b) {
			System.out.println(a+" is smaller than "+b);
		}else {
			System.out.println("Numbers are equal");
		}
	}

}

package com.syntax.class29;

import java.util.Iterator;
import java.util.TreeSet;

public class Task1 {

	public static void main(String[] args) {
//1)Create a Set collection in which you need to add names of the countries.
//In this set we want all objects to be sorted in alphabetical order. 
//Using 2 different ways retrieve all elements from set.


		TreeSet<String> countries=new TreeSet<>(); 
		countries.add("Turkey");
		countries.add("USA");
		countries.add("China");
		countries.add("Germany");
		countries.add("Russia");
		
		System.out.println(countries);
		
		for(String a:countries) {
			System.out.print(a+" ");
		}
		
		System.out.println(" ");
		Iterator<String> it=countries.iterator();
		
		while(it.hasNext()) {
			String b=it.next();
			
			System.out.print(b+" ");
			
		}
	}

}

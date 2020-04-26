package com.syntax.class26_EncapsulationAndArrayList;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		// create an arrayList to store numbers

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(20);
		numbers.add(40);
		
		
		System.out.println("---for loop----");
		for(int i=0; i<numbers.size(); i++) {
			int num=numbers.get(i);//autounboxing
		System.out.println(num);
		numbers.removeAll(numbers);
		
		}
		
		System.out.println("----enhanced-------"); 
		
		for(Integer num:numbers) {
			System.out.println(num);
		}
		
		
	}

}

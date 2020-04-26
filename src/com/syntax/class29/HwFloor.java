package com.syntax.class29;

import java.util.*;

public class HwFloor {

	public static void main(String[] args) {
		Map<Integer, String> floor = new HashMap<>();
		floor.put(1, "Google");
		floor.put(2, "Syntax");
		floor.put(3, "Amazon");
		floor.put(4, "Ebay");
		floor.put(5, "FireFox");
		floor.put(6, "Apple");
		floor.put(7, "Apple");

		System.out.println(floor.size());// number of entries
		System.out.println(floor);

//		//how to get all keys
//		Set<Integer> keys=floor.keySet();
//		System.out.println(floor.keySet());// all keys at once
//		
//		//how to get all keys one by one
//		//1 iterator
//		Iterator<Integer> it=keys.iterator();
//		
//		//or below 
//		//System.out.println("---getting keys using iterator");
//		//Iterator<Integer> it=floor.keySet().iterator();
//		

		System.out.println(floor.entrySet());
		System.out.println(floor.values());// values
		floor.remove(7);

		floor.replace(4, "Wish");

		System.out.println(floor);
		Set<Integer> keys = floor.keySet();

		// getting all keys
		System.out.println("-----------getting keys using iterator---");

		Iterator<Integer> it = keys.iterator();
		while (it.hasNext()) {
			int key = it.next();
			// key is 1 and its values is Google
			System.out.println("Key is " + key + " its values is " + floor.get(key));
		}

		System.out.println("---- getting all keys using for each loop-----");

		// the variable keys have all the keys, WE CANNOT USE MAP variable floor
		// HERE!!!!

		// Set<Integer> keys = floor.keySet();==> keys is coming from this line
		for (int k : keys) { // or we can say for(int key:floor.keySet(){}
			System.out.println("Key from building map " + k + ":" + floor.get(k));
		}

		System.out.println("-------for loop--------");
		for (int i = 1; i < 7; i++) {
			String b = floor.get(i);
			System.out.print(i + ":" + b + " ");
		}

		// getting all values
		Collection<String> values = floor.values();// this method is stored in Collection!
		System.out.println("------------- getting all values using for each loop---------");

		for (String v : values) {
			System.out.println("Value from collection:" + v);
		}

		System.out.println("---getting values using iterator----");

		Iterator<String> it1 = values.iterator();// values are the collection not floor cannot be used.
													// floor.values().iterator can be used
													// floor is Map type. map is not collection

		while (it1.hasNext()) {
			String val = it1.next();// or System.out.println("Map values: "+it1.next());
			System.out.println("Map Values: " + val);// or System.out.println("Map Values: " + it1.next());
		}
	}
}

package com.syntax.class30;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class AllMaps {

	public static void main(String[] args) {
// let's create a grocery map(item, quantity) in which we do not care about the order
		Map<String, Integer> grocery = new HashMap<>();

		grocery.put("milk", 1);
		grocery.put("cucumber", 3);
		grocery.put("banana", 12);
		grocery.put("cheese", 2);
		grocery.put("grapes", 3);

		System.out.println(grocery);

		// create a map of items to buy(item, quatity) in which we want save the order
		Map<String, Integer> household = new LinkedHashMap<>();
		household.put("lysol", 2);
		household.put("sanitizer", 2);
		household.put("paper towel", 3);
		household.put("toilet paper", 10);
		household.put("face mask", 50);
		System.out.println(household);

		// create a map in which we store all previous items in ascending order
		Map<String, Integer> shopping = new TreeMap<>();

//	Map<String, Integer> shopping=new TreeMap<>(grocery);-->instead of line 29 we can do 
		shopping.putAll(grocery);
		// shopping.putAll(household);// or Map<String, Integer> shopping=new
		// TreeMap<>(household)
		System.out.println(shopping);

		// get all keys
		shopping.keySet();

		// having keys using for each loop
		for (String key : shopping.keySet()) {
			System.out.println("Key: " + key);
		}

		// get all keys using iterator
		Iterator<String> it = shopping.keySet().iterator();// shopping.keySet()--> collection of keys. method chaining
		while (it.hasNext()) {
			System.out.println("Key+" + it.next());
		}

		// get all values
		System.out.println(shopping.values());

		// or for each loop
		for (int val : shopping.values()) {
			System.out.println("Value:" + val);
		}

		// get all values using iterator
		Iterator<Integer> it1 = shopping.values().iterator();
		while (it1.hasNext()) {
			System.out.println("Value:" + it1.next());
		}
	}
}
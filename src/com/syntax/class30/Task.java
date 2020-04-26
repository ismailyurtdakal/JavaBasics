package com.syntax.class30;

import java.util.*;

//Create a map of countries with its capital that will store countries in alphabetical order.
//Print all keys and values from a country map using for each loop and iterator.
//Print all values from a country map using for each loop and iterator.
public class Task {
	public static void main(String[] args) {
		Map<String, String> capital = new TreeMap<>();

		capital.put("USA", "Washington DC");
		capital.put("Russia", "Moscow");
		capital.put("Ukraine", "Kiev");
		capital.put("Poland", "Warsaw");

		// all keys
		System.out.println(capital.keySet());

		// all values
		System.out.println(capital.values());

		// all keys using for each loop
		for (String a : capital.keySet()) {
			System.out.println("Keys:" + a);

		}

		// all values using for each loop
		for (String b : capital.values()) {
			System.out.println("Values:" + b);
		}
		// all keys using iterator
		Iterator<String> it1 = capital.keySet().iterator();
		while (it1.hasNext()) {
			System.out.println(it1.next());
		}

		// all values using iterator
		Iterator<String> it2 = capital.values().iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

		System.out.println(capital.entrySet());
	}

}

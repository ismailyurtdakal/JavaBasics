package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task2 {

	public static void main(String[] args) {
//2)Create a Set of cities in which you want to make sure that insertion order
//is maintained. Using Iterator remove any city that starts with “A”;

		LinkedHashSet<String> cities = new LinkedHashSet<>();

		cities.add("New York");
		cities.add("Miami");
		cities.add("Detroit");
		cities.add("Chicago");
		cities.add("Austin");

		System.out.println(cities);

		Iterator<String> it = cities.iterator();
		while (it.hasNext()) {
			if (it.next().startsWith("A")) {
				it.remove();
			}
		}
		System.out.println(cities);
	}
}

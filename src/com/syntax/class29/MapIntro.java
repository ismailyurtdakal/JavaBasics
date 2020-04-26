package com.syntax.class29;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

	public static void main(String[] args) {
		// HashMap is not maintaining the order
		// LinkedHashMap is maintaining order!!

		// K , V
		HashMap<String, String> hmap = new HashMap<>();
		// to store values into Map we use put
		hmap.put("Name", "John");
		hmap.put("Last Name", "Smith");
		hmap.put("Address", "123 Test");
		hmap.put("City", "Warren");
		
		System.out.println(hmap.keySet());
		System.out.println(hmap.values());

		// how to check if map has values?
		boolean isEmpty = hmap.isEmpty();
		System.out.println("Is Map empty? " + isEmpty);

		// how many elements in Map?
		int size = hmap.size();
		System.out.println("Map size is=" + size);

		// can we add more values to map? Yes
		hmap.put("Zip", "12345");

		// can we store duplicate keys? NO, previous will be replaced!!!
		hmap.put("Name", "Jane");
		System.out.println(hmap);

		// how to access the value? use method get and specify the key
		System.out.println(hmap.get("Name"));

		// to remove the value
		hmap.remove("Address");
		System.out.println(hmap);

		// replace values in map
		hmap.replace("Zip", "48093");
		System.out.println(hmap);
		
	

	}
}

package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapRecap {

	public static void main(String[] args) {

		// let's create map of countries with capitals
		Map<String, String> hmap = new HashMap<>();
		hmap.put("USA", "Washington DC");
		hmap.put("Russia", "MOscow");
		hmap.put("France", "Paris");
		hmap.put("Tajikistan", "Dusanbe");
		hmap.put("Italy", null);
		System.out.println(hmap);

		// how to get all ekeys form a map? keySet(),, enrtrySet();
		Set<String> keys = hmap.keySet();// use loop or iterator to iterator over keys
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		Set<Entry<String, String>> entries = hmap.entrySet();
		Iterator<Entry<String, String>> iter = entries.iterator();
		while (iter.hasNext()) {
			String key = iter.next().getKey();
			System.out.println(key);
		}

		// let's get both key and value
		while (iter.hasNext()) {
			Entry<String, String> entry = iter.next();

			String myentry = entry.getKey() + "--" + entry.getValue();

			System.out.println(myentry);
		}

		// how to get only values from a map? values(); entrySet();
		Collection<String> values = hmap.values();
		it = values.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}

		// let's create hashtable of countries with capitals
		Map<String, String> htable = new Hashtable<>();
		htable.put("USA", "Washington DC");
		htable.put("Russia", "MOscow");
		htable.put("France", "Paris");
		htable.put("Tajikistan", "Dusanbe");
		// htable.put("Italy", null);--> we can store null key/values inside hashtable
		System.out.println(htable);

		// first part of the code
		createMap("City", "Chantilly");

		// second part of the code
		createMap("City", "Washington DC");
	}

	public static Map<String, String> createMap(String key, String value) {
		Map map = new HashMap<>();
		map.put(key, value);
		return map;
	}
}

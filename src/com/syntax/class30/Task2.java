package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class Task2 {

	public static void main(String[] args) {
// Create a map of Best Buy store.
//Place item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
//Retrieve all keys and values from a Best Buy map using EntrySet.

		Map<Integer, String> bb = new LinkedHashMap<>();

		bb.put(1000, "TV");
		bb.put(1001, "Laptop");
		bb.put(1002, "Printer");
		bb.put(1003, "Phone");
		Iterator<Entry<Integer, String>> it = bb.entrySet().iterator();
		while (it.hasNext()) {

			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

		System.out.println("----for each loop---");
		Set<Entry<Integer, String>> entry = bb.entrySet();

		for (Entry e : entry) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
}

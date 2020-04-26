package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class MapEntry {

	public static void main(String[] args) {
		// create a map that will store store month and days in a month
		Map<String, Integer> month = new LinkedHashMap<>();
		month.put("January", 31);
		month.put("February", 28);
		month.put("March", 31);
		month.put("April", 30);

		System.out.println(month.size());// number of entries

		// get all entries from a map
		Set<Entry<String, Integer>> entries = month.entrySet();
		System.out.println(month.entrySet());// gives all entries with keys+values
		System.out.println(entries);// line 20 and line 21 gives the same output

		System.out.println("----enhanced loop--- ");
		// loop through all entry objects
		for (Entry<String, Integer> e:entries) {
			// System.out.println(e); //or below
			System.out.println(e.getKey() + "=" + e.getValue());
		}

		// iterate through all entry objects
		// month.entrySet()--> is the collection we have to use with iterator();
		System.out.println("----------Using iterator to go over all entry objects----");
		//Iterator<Entry<String,Integer>> it = month.entrySet().iterator(); or below
		Iterator<Entry<String,Integer>> it=entries.iterator();//this is coming from line 19. Easier way can be used as shown in line 33
		while (it.hasNext()) {
			// System.out.println(it.next()); this one works too
//System.out.println("Key+"+it.next().getKey()+"; value="+it.next().getValue());DOESN'T WORK->OUTPUT=>Key+January value=28 ,Key+March value=30
			
			//to fix it we assign it.next(); to a variable like entry
			Entry<String, Integer> entry = it.next();
			System.out.println("Key " + entry.getKey() + "==" + entry.getValue());
		}
	}

}

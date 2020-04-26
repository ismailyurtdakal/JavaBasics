package com.syntax.class30;

import java.util.*;
import java.util.Map.Entry;

public class EntrySet {

	public static void main(String[] args) {
		Map<String, String> land = new TreeMap<>();
		land.put("Togo", "Lome");
		land.put("Jamaica", "Kingston");
		land.put("Iran", "Tehran");
		land.put("Peru", "Lima");
		land.put("Cuba", "Havana");

		System.out.println(land);

		//1)storing all entry objects into a set
		Set<Entry<String,String>> all=land.entrySet();
		System.out.println(all);
		
		//2)loop through all entries to get a key value and values
		for(Entry<String,String> e:all) {
			String key=e.getKey();
			String value=e.getValue();
			System.out.println(key+":"+value);
		}
		
		System.out.println("----iterator---");
		//3)iterator
				Iterator<Entry<String,String>> it=land.entrySet().iterator(); //we can use all instead of land.entrySet().
		while(it.hasNext()) {
			System.out.println(it.next());
			//or
			//Entry<String, String> e = it.next();
			//System.out.println(e.getKey()+"  :  "+e.getValue());
			
		}
		//storing all entry objects into a set 
				Set<Entry<String,String>> allEntries=land.entrySet();
		System.out.println("---loop through all entries to get a key and value");
		for(Entry<String, String> entr:allEntries) {
			String key=entr.getKey();
			String value=entr.getValue();
			System.out.println(key.toUpperCase()+"---"+value.toLowerCase());
		}
		
		System.out.println("---iterate through all entries to get a key and value");
		Iterator<Entry<String, String>> entryIterator=allEntries.iterator();
		while(entryIterator.hasNext()) {
			Entry<String, String> e=entryIterator.next();
			String key$value = e.getKey()+":::"+e.getValue();
			System.out.println(key$value);
		}
	
			
		for (String key : land.keySet()) {
			System.out.println("Key: " + key);
		}
		for (String val : land.values()) {
			System.out.println("Value: " + val);
		}
		Iterator<String> it1 = land.keySet().iterator();
		while (it1.hasNext()) {
			System.out.println("Key=" + it1.next());
		}
		Iterator<String> iter = land.values().iterator();
		while (iter.hasNext()) {
			System.out.println("Value=" + iter.next());
		}
	}
}
package com.syntax.class31;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;

public class Practice {

	public static void main(String[] args) throws IOException {

		String filePath = "C:\\Users\\Is mAil\\eclipse-workspace\\JavaBasics\\configs\\practice.properties";

		FileInputStream fis = new FileInputStream(filePath);

		Properties prop = new Properties();

		prop.load(fis);

		// get keys
		Set<Object> keys = prop.keySet();
		System.out.println(keys);

		System.out.println();
		// get values
		Collection<Object> values = prop.values();
		System.out.println(values);

		System.out.println();
		// get all entries with entrySet();
		// 1) for enhanced loop
		Set<Entry<Object, Object>> entries = prop.entrySet();
		for (Entry<Object, Object> entry : entries) {
			System.out.println(entry);
		}
		
		System.out.println();
		Iterator<Entry<Object,Object>>it=prop.entrySet().iterator();
		
		while(it.hasNext()) {
			Entry<Object,Object>all=it.next();
			
			System.out.println(all.getKey()+" "+all.getValue());
		}
		
		prop.setProperty("RoomNumbers", "4");
		
		FileOutputStream fos=new FileOutputStream(filePath);
		prop.store(fos, filePath);
		

	}
}
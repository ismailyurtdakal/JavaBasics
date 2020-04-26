package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Words {
	public static void main(String[] args) {
		// Create an arrayList of words. Remove every word that ends with “e”. Use
		// iterator

		ArrayList<String> greetings = new ArrayList<>();
		greetings.add("Hello");
		greetings.add("Merhaba");
		greetings.add("As-salam alaykom");
		greetings.add("Hola");
		greetings.add("Zdravstvuyte");
		
		Iterator<String> greetings2 = greetings.iterator();
		
		while (greetings2.hasNext()) {
			if (greetings2.next().endsWith("e")) {
				greetings2.remove();
			}
		}
		System.out.println(greetings);
		
		for(int i=0; i<greetings.size(); i++) {
			String str=greetings.get(i);
			if(str.endsWith("e")) {
				greetings.remove((greetings.get(i)));
			}
		}
		System.out.println(greetings);
	}
}
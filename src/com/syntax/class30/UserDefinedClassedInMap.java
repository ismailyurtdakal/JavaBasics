package com.syntax.class30;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

abstract class Store {
	String type, name;

	public Store(String type, String name) {
		this.name = name;
		this.type = type;
	}

	public abstract void workingHours();

	public void display() {
		System.out.println("This is store " + name);
	}
}

class Nike extends Store {

	Nike(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name + " works from 10 am to 6 pm");
	}
}

class Costco extends Store {

	Costco(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name + " works from 8 am until 8 pm");
	}
}

class Amazon extends Store {

	Amazon(String type, String name) {
		super(type, name);
	}

	@Override
	public void workingHours() {
		System.out.println(name + " works 24/7");
	}
}

public class UserDefinedClassedInMap {
	public static void main(String[] args) {
//we want to store stores in form 1--> Amazon, 2--> Costco, 3--> Nike

		Map<Integer, Store> storeMap = new LinkedHashMap<>();

		storeMap.put(1, new Amazon("Online", "Amazon"));
		storeMap.put(2, new Costco("wholesale", "Costco"));
		storeMap.put(3, new Nike("retail", "Nike"));
		System.out.println(storeMap);

//to get an acccess to all methods of our Store Objects: .values, keySet(), entrySet()
		// 1. way--> get all Value Objects
		Collection<Store> col = storeMap.values();
		for (Store store : col) {
			store.workingHours();
			store.display();
			System.out.println("-----------------------");
		}

		// 2. way --> get all Entry Objects --> getValue
		Set<Entry<Integer, Store>> storeSet = storeMap.entrySet();
		for (Entry<Integer, Store> entry:storeSet) {
			entry.getValue().workingHours();
			entry.getValue().display();
		}

		// 3. way --> get Keys--> get value of specified key
		Set<Integer> keys = storeMap.keySet();
		for (Integer key : keys) {
			// storeMap.get(key).display();
			// storeMap.get(key).workingHours();

			// OR
			Store obj = storeMap.get(key);
			obj.display();
			obj.workingHours();

		}
	}
}

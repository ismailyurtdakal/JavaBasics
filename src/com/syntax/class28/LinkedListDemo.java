package com.syntax.class28;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> llist = new LinkedList<>();

		llist.add("Mesut");// comes from Collection
		llist.add(0, "Saadet");// comes from List
		llist.add("Esin");
		llist.add("Ismail");

		int size = llist.size();
		System.out.println(llist);
		
		//get all elements one by one 3 different ways
		
		for(int i=0; i<llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		
		for(String a:llist) {
			System.out.println(a);
		}
		
		Iterator<String> it=llist.iterator();
		while(it.hasNext()) {
			String str=it.next();
			System.out.println(str);
		}
//Can we store objects user defined classes?
		
		//LinkedList<Car> cars=new LinkedList<>();
		
	}
}

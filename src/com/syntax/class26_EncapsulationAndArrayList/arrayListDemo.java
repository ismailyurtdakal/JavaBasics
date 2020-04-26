package com.syntax.class26_EncapsulationAndArrayList;

import java.util.ArrayList;

public class arrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
//adding String object into arrayList
		arrayList.add("Ismail");
		arrayList.add("Mesut");
		
		

//access element from arrayList
		String secondElement = arrayList.get(1);
		System.out.println(secondElement);

		// arrayList is dynamic array
		arrayList.add("Esin");
		arrayList.add("Saadet");

		// how to get number of elements inside arrayList?
		int size = arrayList.size();
		System.out.println(size);

		arrayList.add("Resit");
		System.out.println(arrayList.size());

		arrayList.remove("Resit");

		System.out.println(arrayList.size());

		arrayList.add("Mesut");
		System.out.println(arrayList);

		arrayList.set(4, "Rabia");
		System.out.println(arrayList);

		// arraylist is dynamic,

		// how to retreive values from arrayList one by one?

		for (int i = 0; i < arrayList.size(); i++) {
			String element = arrayList.get(i);
			System.out.println(element);
		}
		System.out.println("----------enhanced loop");

		for(String str:arrayList) {
			System.out.println(str);
		}
	}

}

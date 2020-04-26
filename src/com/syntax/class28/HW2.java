package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class HW2 {

	public static void main(String[] args) {
		// 2. create food class that will have 3 undefined methods and it will have 4
		// subclassess
		// create a collection of food and using 3 ways execute methods

		Food[] foodArray = { new Meat(), new Vegan(), new Mixed(), new Allfood() };
		// if the classes Meat, Vegan, Mixed, Allfood are abstract we cannot store them
		// in Array!!!!!!!!!!

		ArrayList<Food> flist = new ArrayList<>();
		flist.add(new Meat());
		flist.add(new Vegan());
		flist.add(new Mixed());
		flist.add(new Allfood());

		// 1. advanced for loop
		System.out.println("--- advanced for loop----");
		for (Food a : foodArray) {
			a.meat();
			a.mixed();
			a.vegetable();
		}
		System.out.println("----for loop-------");
		// 2. for loop

		for (int i = 0; i < flist.size(); i++) {
			flist.get(i).meat();
			flist.get(i).mixed();
			flist.get(i).vegetable();
		}
		System.out.println("-----------iterator ---------");

		// 3. iterator ==> iterator works for only one method!!!
		Iterator<Food> it1 = flist.iterator();
		while (it1.hasNext()) {
			it1.next().meat();
		}
		Iterator<Food> it2 = flist.iterator();
		while (it2.hasNext()) {
			it2.next().mixed();
		}
		Iterator<Food> it3 = flist.iterator();
		while (it2.hasNext()) {
			it2.next().vegetable();
		}
	}
}

package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class Task {
//1)Create an arraylist of cars and retrieve all the values using 3 different ways
//2)Create an arraylist of words.Remove every word that ends with "e". Use iterator
	public static void main(String[] args) {

		ArrayList<String> cars = new ArrayList<>();
		cars.add("Tesla");
		cars.add("Toyota");
		cars.add("Honda");
		cars.add("BMW");

		System.out.println(cars);

		for (String a : cars) {
			System.out.println(a + ", ");
		}
		for (int i = 0; i < cars.size(); i++) {
			System.out.println(cars.get(i) + ",");
		}
		// iterator
		Iterator<String> car = cars.iterator();
		while (car.hasNext()) {
			System.out.println(car.next());
		}

		Iterator<String> car1 = cars.iterator();

		while (car1.hasNext()) {
			if (car1.next().endsWith("e")) {
				car1.remove();
			}
		}
		System.out.println(cars);//???
	}
}
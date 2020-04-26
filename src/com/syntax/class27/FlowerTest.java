package com.syntax.class27;

import java.util.ArrayList;
import java.util.Iterator;

public class FlowerTest {

	public static void main(String[] args) {

		// store flowers into array
		Flower[] flowerArray = { new Rose("Rose"), new Tulip("Tulip"), new Sunflower("Sunflower") };

		// store flowers into arraylist
		ArrayList<Flower> flowers = new ArrayList<>();
		flowers.add(new Rose("Rose"));
		flowers.add(new Tulip("Tulip"));
		flowers.add(new Sunflower("Sunflower"));
		// flowers.add("Rose"); CE: cannot add String object into Arraylist of Flower
		// object

// call available methods using: for loop, advanced for loop, iterator 

		// 1. advanced loop
		for (Flower a:flowers) {
			a.bloom();
			System.out.println("-----advanced for loop--------");
		}
		// 2.for loop
		for (int i = 0; i < flowers.size(); i++) {
			flowers.get(i).bloom();
			System.out.println("----for loop---------");
		}

		//3. iterator
		Iterator<Flower> it = flowers.iterator();
		while (it.hasNext()) {
			it.next().bloom();
		}

	}
}

//3. Create an arrayList of drinks. If any drink has letter “a” or “e” replace it with water. 

//4. Create an arrayList of even numbers from 1 to 50. Using Iterator remove any number that is divisible by 5 from that arrayList.

//5. look over LinkedList and Set Interface

package com.syntax.class28;

import java.util.ArrayList;
import java.util.Iterator;

public class HW4 {

	public static void main(String[] args) {

		ArrayList<Integer> num = new ArrayList<>();

		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 0) {
				num.add(i);
			}
			Iterator<Integer> n = num.iterator();
			while (n.hasNext()) {
				if (n.next() % 5 == 0) {
					n.remove();
				}
			}
		}
		System.out.println(num);
	}
}
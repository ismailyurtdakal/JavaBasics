package com.syntax.class12;

public class Slide11Task3 {

	public static void main(String[] args) {
		// You have a String a=“Is it saturday? Is it raining?
		// Do we have a Java Class today?” How would you find out
		// how many sentences are in that String?
		String str = "Is it saturday? Is it raining? Do we have a Java Class today?";
		String[] arrayStr = str.split(" ");
		int counter=0;
		for(int i = 0; i < arrayStr.length; i++) {
			counter++;
		}
		System.out.println(counter);
	}
}
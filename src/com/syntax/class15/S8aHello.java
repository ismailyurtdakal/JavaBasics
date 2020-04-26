package com.syntax.class15;

//Task4 Create a method that will say Hello in different languages 
//based on the country that will passed when method is executed
public class S8aHello {

	void hello(String country) {
		if (country.equalsIgnoreCase("USA") || country.equalsIgnoreCase("UK")) {
			System.out.println("Hello");
		} else if (country.equalsIgnoreCase("russia")) {
			System.out.println("Привет");//
		} else if (country.equalsIgnoreCase("France")) {
			System.out.println("Bonjour");
		} else if (country.equalsIgnoreCase("Spain") || country.equalsIgnoreCase("Mexico")) {
			System.out.println("Hola");
		} else if (country.equalsIgnoreCase("Belarus")) {
			System.out.println("Прывiтанне");
		} else {
			System.out.println("Please enter different country");
		}

	}
}

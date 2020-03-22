package com.syntax.class15;
//Create a method that will say Hello in different languages 
//based on the country that will passed when method is executed
public class Hello {

	void hello (String lang) {
	    if (lang.equalsIgnoreCase("USA") || lang.equalsIgnoreCase("UK")) {
	        System.out.println("Hello");
	    }else if (lang.equalsIgnoreCase("russia")) {
	        System.out.println("Привет");//
	    }else if (lang.equalsIgnoreCase("France")) {
	        System.out.println("Bonjour");
	    }else if (lang.equalsIgnoreCase("Spain") || lang.equalsIgnoreCase("Mexico")) {
	        System.out.println("Hola");
	    }else if (lang.equalsIgnoreCase("Belarus")) {
	        System.out.println("Прывiтанне");
	    }else {
	        System.out.println("Please enter different country");
	    }
	    
	}
	}



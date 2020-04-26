package com.syntax.class15;

public class Deneme {
//create a method that will say good morning 10 times
	
	void say(String s, int times){
		for(int i=1; i<=times; i++) {
			
			System.out.println(i+" "+s);
		}
	}

//create a method isItRaining will accept boolean value as a parameter 	
	
	
	void isItRaining(boolean isRain ){
		if(isRain) {
			System.out.println("Stdy Java");
		}else {
			System.out.println("NOt raining but study study study Java");
		}
	}
	void num(int a, int b) {
		if(a>b) {
			System.out.println("number "+a+" is bigger than number "+b);
		}else {
			System.out.println("number "+b+" is bigger than number "+a);
		}
	}
}

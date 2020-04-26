package com.syntax.class28;

import java.util.ArrayList;
public class HW3SecondWay {
	

		public static void main(String[] args) {
			
			ArrayList<String> drink=new ArrayList<>();
			drink.add("Coce");
			drink.add("Bilo-Colo");
			drink.add("Kakao");
			drink.add("Seltser");
			drink.add("Apple sok");
			drink.add("Orange juice");
			drink.add("Coconut sok");
			drink.add("Mango juice");
			
			for(String dr:drink) {
				dr=dr.toLowerCase();
				if(dr.contains("a")||dr.contains("e")) {
					dr=dr.replaceAll(dr, "Water");
				}
				System.out.println(drink);
			}
		}
	}
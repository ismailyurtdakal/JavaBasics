package com.syntax.class29;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OtherMaps {

	public static void main(String[] args) {
		// store students id and corresponding name
		Map<Integer, String> lmap=new LinkedHashMap<>();
		lmap.put(1000, "Ismail Yurtdakal");
		lmap.put(1001, "Mesut Yurtdakal");
		lmap.put(1002, "Saadet Yurtdakal");
		lmap.put(1003, "Esin Yurtdakal");
		
		System.out.println(lmap);
		
//store objects in a form of K and V and you want to sort your keys in ascending order
		Map<Integer, String> tmap=new TreeMap<>();
		tmap.put(1000, "Ismail Yurtdakal");
		tmap.put(1001, "Mesut Yurtdakal");
		tmap.put(1002, "Saadet Yurtdakal");
		tmap.put(103, "Esin Yurtdakal");
		
		System.out.println(tmap);//sorting by keys!!!!!!!
		
		//create a map of Country and population and sort countries in Aphabetical order
		
		Map<String, Integer> population=new TreeMap<>();
		
		population.put("USA", 330000000);
		population.put("Kazakhstan", 18000000);
		population.put("Afghanistan", 37000000);
		System.out.println(population);

		//HW how to get all keys and values
		

	}

}

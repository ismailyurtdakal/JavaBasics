package com.syntax.class29;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
	//create a collection that will store only unique objects and
	//we do not care about the order
		
		HashSet<String> breakfast=new HashSet<>();
		
		breakfast.add("eggs");
		breakfast.add("bread");
		breakfast.add("tea");
		breakfast.add("cream cheese");
		breakfast.add("eggs");
		breakfast.add("coffee");
		
		int size=breakfast.size();
		System.out.println(size);//not 6, no duplicates in HashSet
		
		//order is not maintained
		System.out.println(breakfast);
		
		//we need to retrieve an element
		//breakfast.get(); this method is not available in HashSet
		
		//we can retrieve all elements!
		Iterator<String> myIterator=breakfast.iterator();
		
		while(myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}
		//we cannot use for loop because breakfast.get(i) is not available
	
		System.out.println("-------------------");
	
		//advanced/enhanced for loop/for each loop
				
		for(String item:breakfast) {
			System.out.println(item);
		}

	}

}

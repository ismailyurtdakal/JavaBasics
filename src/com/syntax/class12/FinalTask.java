package com.syntax.class12;

public class FinalTask {

	public static void main(String[] args) {
		// You have a String a"Is it Saturday? Is it raining? Do we have a Java Class today?"
		//How would you find out how many sentences are there in that String a?
		char characters[]= {',', '.',  ',',  '?'};
		String a="Is it Saturday? Is it raining? Do we have a Java Class today?";
String [] array=a.split("\\?");

System.out.println(array.length);

for(int i=0; i<array.length; i++) {
	System.out.println(array[i]);
}
	}

}

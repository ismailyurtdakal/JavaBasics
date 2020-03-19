package com.syntax.class13;

public class AlphaCharactersInStringsNoOfWords {

	public static void main(String[] args) {
		/*How  many aplha charcters are present in a String?
		 *  Find number of in String
		 *  
		 */
		
	String str="Hih9898jhjh%%^%^    oio";
	str=str.replaceAll("[^A-Za-z]", "");
	int number =str.length();
	
	System.out.println("Number of alpha characters = "+number);
	
	String str2="Today is Wednesday";
	
	String[] array=str2.split(" ");
	
	int words=array.length;
	System.out.println("Total words in Sring :"+str2+" = "+words);

	}

}

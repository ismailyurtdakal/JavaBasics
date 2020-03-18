package com.syntax.class11;

public class Slide7 {

	public static void main(String[] args) {
		// String Validation
		String str1="Welcome Syntax Students";
		
		String str2="Welcome syntax students";
		//compare 3 Strings
		System.out.println("----equals() equalsIgnoreCase() Function--");

		System.out.println(str1.equalsIgnoreCase(str2));
		
		String expected="Home - Syntax Technologies";  //coming from user stories
		String actual="Home - Syntax Technologies ";
		
		if(actual.equals(expected)) {
			System.out.println("Test case pass. Titles are matched");
		}else {
			System.out.println("Test case fails. Titles are NOT matched");
		}
		
		System.out.println("-----FIRST TRIM AND THEN COMPARE---");
		if(actual.trim().contentEquals(expected)) {
			System.out.println("Test case pass. Titles are matched");
		}else {
			System.out.println("Test case fails. Titles are NOT matched");	
		}
		
		String browser="CHROME";
		if(browser.trim().equalsIgnoreCase("chrome")) {
			
			System.out.println("Test execured on cherme browser");
		}
		//OR
		if(browser.toLowerCase().equals("chrome")) {
            System.out.println("Test executed on chrome browser");
	}
	}
}

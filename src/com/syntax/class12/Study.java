package com.syntax.class12;

import java.util.Scanner;

public class Study {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
		  System.out.println("Enter any programming language");
		   String language = sc.nextLine(); 

		if(language.equals("Java")){
		  System.out.println("Java is a programming language");
		}else if (language.equals("C")){
		  System.out.println("C is a procedural programming language");
		}else if (language.equals("C++")){
		  System.out.println("C++ is a middle-level programming language");
		
		}else {
System.out.println("Doesn't match any programming language");
		} 
		  
			  
//	}}
//if(browser.equalsIgnoreCase("ChRoME")){
//    System.out.println("Proceed with Chrome browser"); 
//   }else if(browser.equalsIgnoreCase("FireFOX")){
//      System.out.println("Proceed with Firefox browser");  
//   }else if(browser.equalsIgnoreCase("IE")){
//     System.out.println("Proceed with IE browser");  
//   }else{
//     System.out.println("Invalid browser");
//   }
//   
//   
   
 }
}
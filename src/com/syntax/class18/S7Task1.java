package com.syntax.class18;

public class S7Task1 {

//Task1) Write a program that will have a constructor: 
//one with parameters and second without any parameters. 
//Create a separate Test class where you will execute both of the constructors.
	S7Task1(){
		System.out.println("Non arguments");
	}
	S7Task1(String a, int b){
		System.out.println("with parameters");	
	}
	
	


public static void main(String[] args) {
	S7Task1 obj=new S7Task1();
	
	S7Task1 obj1=new S7Task1("Hello", 5);

}

	}



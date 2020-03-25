package com.syntax.class16;

public class S6Shelter {

	public static void main(String[] args) {
//access instance variabes of different class
		S5Dog puppy=new S5Dog();  //From S5Dog
		
		puppy.name="Charly";
		
		//access static variables of diffrent class
		
		System.out.println(S5Dog.breed);
		 
		
	}

}

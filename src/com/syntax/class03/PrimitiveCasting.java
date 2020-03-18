package com.syntax.class03;
//widening happens implicitly
public abstract class PrimitiveCasting {
	
public static void main(String[] args) {
	
	double d=10;
	
	System.out.println(d);//10
	
	//int i=10.99;--> compile time error saying: type mismatch, cannot convert double to int
	
	int i=(int)10.99;
    System.out.println(i);	

    //byte -128 to 127
     
    byte b=(byte)1284;
    System.out.println(b);
  	
	//Casting in Java is a conversion of one type into another type
	//types of casting
	
	// 1) widening (implicit casting, automatically)
	// byte-> short-> int-> long -> float -> double
	

	// 2) narrowing (explicit casting, manually)
	//double--> float --> long --> int --> short --> byte
	
}	
}


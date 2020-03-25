package com.syntax.class16;

public class S4InstanceVariables {

	
	String name="John"; //instance varibale
	
	public static void main(String[] args) {
		
		String name="Yunus";
		
		System.out.println(name);
		
		S4InstanceVariables obj= new S4InstanceVariables ();
		
		System.out.println(obj.name);
		
		obj.name="Ali";
		System.out.println(name); 
		System.out.println(obj.name);
		
		//change value of local variable
		
		name="Farid";
		System.out.println(name); 
		
	}
	
}

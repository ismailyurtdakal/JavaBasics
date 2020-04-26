package com.syntax.class22;

public class Recap2 {
	public void hello() {
		System.out.println("Hello");
	}

	public void hello(String name) {// --->this method is overloaded
		System.out.println("hello " + name);
	}
	
	public void hello(int num) {//overloading
		
	}
	
	public void hello1(int num) {//NOT OVERLOADING, 
//because they are different methods!!!!
		
	}

//	CE:below.why? overloading is not possible by changing modifier
//	private void hello(String str){
//		      System.out.println(str);

	// CE:overloading is NOT possible by changing return type
//	public String hello(String name) {
//		return name;
//	}

}

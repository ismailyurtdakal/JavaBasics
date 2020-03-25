package com.syntax.class17;

public class StaticKeywordTest {

	public static void main(String[] args) {
		//access static members of another class
		
		StaticKeyword.brand="Android";
		StaticKeyword.touchScreen=true;
		StaticKeyword.displayGenInfo();

		//access instance members of another class
		StaticKeyword obj1=new StaticKeyword();
		obj1.color="red";
		obj1.memory=128;
		obj1.displaySpecificitations();
		
	}

}

package com.syntax.class16;

public class S2Recap {// ====> class curly brace

	int sum(int a, int b) {// ----> parameters
		return a + b;
	}

	void sum1(int a, int b) {

		System.out.println(a + b);
	}

	boolean isEqual(int a, int b) {
		if (a == b) {

		}
		return false;
	}

	public static void main(String[] args) {

		S2Recap obj = new S2Recap();
		int sum = obj.sum(10, 12);// --> arguments (10 and 12 are arguments)
		// after you add 2 numbers now divide sum by 10.

		int result = sum / 10;

		// int sum1=obj.sum1(1,2);//:CE

	}
}// ======> class close curly brace

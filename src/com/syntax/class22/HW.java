package com.syntax.class22;

public class HW {
//Create 1 cass in which create methods that will calculate the area(volume) of
//Rectangle
//Square
//Box
//Use separate class to test your code	

	public int areaR(int a, int b) {
		int areaR = a * b;
		System.out.println("Area of Rectangle is equal to " + areaR);
		return areaR;
	}

	public int areaS(int a) {
		int areaS = a * a;
		System.out.println("Area of Square is eequal to " + areaS);
		return areaS;
	}

	public int areaB(int a, int b, int c) {
		int areaB = a * b * c;
		System.out.println("Area of Box is equal to " + areaB);
		return areaB;
	}
}

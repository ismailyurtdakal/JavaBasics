package com.syntax.class22;

public class HWTest {

	public static void main(String[] args) {
		HW obj = new HW();
		System.out.println(obj.areaS(4));
		System.out.println(obj.areaR(12, 14));
		System.out.println(obj.areaB(4, 55, 3));

		String str = "Hello friends";

		String s = str.substring(6);//friends
		String a = (String) str.subSequence(0, 5);//Hello
		System.out.println(s);
		System.out.println(a);

	}
}
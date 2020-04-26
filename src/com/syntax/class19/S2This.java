package com.syntax.class19;

public class S2This {
	int a;// 10
	int b;// 20

	public S2This() {
		System.out.println("Non argument constructor");
	}

	public S2This(int a, int b) {
		this.a = a;// 10
		this.b = b;// 20
	}

	public void sum(int a, int b) {
		System.out.println("Sum of local variables " + (a + b));
		System.out.println("Sum of instance variables " + (this.a + this.b));
	}

	public static void main(String[] args) {
		S2This obj = new S2This(10, 20);
		obj.sum(100, 200);

		System.out.println("------------------------------");
		S2This obj2 = new S2This();
		obj2.sum(20, 40);
	}
}

package com.syntax.class22;

public class CreditCardTest {

	public static void main(String[] args) {
		CreditCard obj = new CreditCard(700);
		obj.calc(3000);
		System.out.println(obj.calc(3000));

		Visa obj2 = new Visa(700);
		obj2.calc(2000);
		System.out.println(obj2.calc(5000));

		AX obj3 = new AX(700);
		obj3.calc(700);

		System.out.println(obj3.calc(3000));

	}

}

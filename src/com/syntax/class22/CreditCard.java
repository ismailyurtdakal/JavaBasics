package com.syntax.class22;

public class CreditCard {
//	Create a class CreditCard and define variable balance and interest. 
//	Create an instance method that will calculate interest based on the given balance. 
//	Create 2 subclasses: Visa and AX. In AX class override method calculate interest. 
//	Call the method by creating an object of each of the three classes.

	double balance, interest;

	CreditCard(double balance) {
		this.balance = balance;
	}

	double calc(double balance) { //if it was void calc(){

		if (balance > 500) {
			interest = balance * 0.2;

		} else {
			interest = 0;
		}
		return interest;  //}then we will print System.out.println(interest);
	}
}

class Visa extends CreditCard {
	Visa(double balance) {
		super(balance);
	}

	double calc(double balance) {
		this.balance = balance;
		if (balance > 500) {
			interest = balance * 0.3;

		} else {
			interest = 0;
		}
		return interest;
	}
}

class AX extends CreditCard {
	AX(double balance) {

		super(balance);
	}

	double calc(double balance) {
		this.balance = balance;
		if (balance > 500) {
			interest = balance * 0.4;

		} else {
			interest = 0;
		}
		return interest;
	}
}

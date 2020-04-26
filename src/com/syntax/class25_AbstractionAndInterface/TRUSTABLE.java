package com.syntax.class25_AbstractionAndInterface;

public interface TRUSTABLE {
	// by default compiler will make method to be public and abstract
	void trust();
}

interface Bank extends TRUSTABLE {
//by default compiler will make method to be public and abstact
//Interface implements another interface==> no need to override the abstract method trust(); here!!!	
	void deposit();
	void withdraw();
}

class FINANCE {
	public void financing() {
		System.out.println("Dealing with financing");
	}
}

class PNC extends FINANCE implements Bank {

	@Override
	public void deposit() {
	}

	@Override
	public void withdraw() {
	}

	public void trust() {
	}
}

class BOA extends FINANCE implements Bank, CreditUnion {

	@Override
	public void deposit() {
		System.out.println("You can deposit at BOA");
	}

	@Override
	public void withdraw() {
		System.out.println("You can withdraw your money at BOA");
	}

	@Override
	public void trust() {
		System.out.println("BOA is trustable");
	}

	@Override
	public void giveCredit() {
		System.out.println("BOA gives credit");
	}
}

interface CreditUnion {
	void giveCredit();
}
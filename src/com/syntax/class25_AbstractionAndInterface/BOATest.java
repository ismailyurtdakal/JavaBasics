package com.syntax.class25_AbstractionAndInterface;

public class BOATest {

	public static void main(String[] args) {
		BOA bank=new BOA();

		bank.trust();
		bank.deposit();
		bank.financing();
		bank.giveCredit();
		bank.withdraw();
		
		Bank bank1=new BOA();
		bank1.deposit();
		bank1.trust();
		bank1.withdraw();
		
		TRUSTABLE t=new BOA();
		t.trust();
	}

}

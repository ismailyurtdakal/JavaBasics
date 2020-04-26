package com.syntax.class22;

public class BankTest {
	public static void main(String[] args) {

		Bank bank = new Bank(700);
		double fee = bank.chargeFee();
		System.out.println("All Banks charge " + fee);

		BAO bao = new BAO(700);
		fee = bao.chargeFee();
		System.out.println("BOA charges "+fee);

		PNC pnc = new PNC(700);
		fee = pnc.chargeFee();
		System.out.println("PNC charges " + fee);

		TD td = new TD(700);
		fee = td.chargeFee();
		System.out.println("TD charges " + fee);

	}
}
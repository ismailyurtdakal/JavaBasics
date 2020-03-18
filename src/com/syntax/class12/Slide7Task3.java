package com.syntax.class12;

import java.util.Scanner;

public class Slide7Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter mom's name :");
		String mom = input.nextLine();
		System.out.println("Enter dad's name:");
		String dad = input.nextLine();
		System.out.println("Expecting girl or boy:");
		String gender = input.nextLine();
		if (gender.equals("boy")) {
			String output = dad.substring(0, 3) + mom.charAt(mom.length() - 2)
					+ mom.charAt(mom.length() - 1);
			System.out.println(output.toUpperCase());
		}
		if (gender.equals("girl")) {
			String output = mom.substring(0, 3) + dad.charAt(dad.length() - 2)
					+ dad.charAt(dad.length() - 1);
			System.out.println(output.toUpperCase());
		}
	}
}
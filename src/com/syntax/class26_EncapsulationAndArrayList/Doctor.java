package com.syntax.class26_EncapsulationAndArrayList;

public class Doctor {
	private long licenseID;
	private long phoneNumber;
	private String email;

	public void setEmail(String email) {
		if (!email.isEmpty()) {
			this.email = email;
			if (email.contains("gmail")) {

			} else {
				System.out.println("Email must be gmail type");
			}
		} else {
			System.out.println("Email cannot be empty");
		}
	}

	public String getEmail() {
		return email;

	}
}

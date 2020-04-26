package com.syntax.class26_EncapsulationAndArrayList;

public class DoctorTest {

	public static void main(String[] args) {
		Doctor doc = new Doctor();
		doc.setEmail("doctor@gmail.com");
		System.out.println(doc.getEmail());
		
		doc.setEmail("doctor@yahoo.com");
		System.out.println(doc.getEmail());
	}

}

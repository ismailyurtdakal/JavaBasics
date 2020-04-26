package com.syntax.class26_EncapsulationAndArrayList;

public class Recap1 {

	public static void main(String[] args) {

		int num = 10;
		Doctor doctor = new Doctor();
		int [] mumbers= {10,20,30,40};
		Doctor[] doctors= {new Doctor(), new Doctor(), new Doctor()};
		String[] names= new String[2];
		names[0]="Mesut";
		names[1]="saadet";
		
		System.out.println("-----------");
//during runtime, Java will give us an exceptions because arrays are 
//		fixed in size
	//		names[2]="Esin";
		
	}
}
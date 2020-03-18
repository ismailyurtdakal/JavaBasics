package com.syntax.class09;

public class Class9Task2 {

	public static void main(String[] args) {
		// Print the following pattern
		
		//*
		//**
		//***
		//****
		//*****
		//****
		//***
		//**
		//*

		for(int r=1; r<=4; r++) {
			
		for(int c=1; c<=r; c++) {
			System.out.print("* ");
		}	
		System.out.println();
		}
		
		for( int a=5; a>=1; a--) {
			for(int b=1; b<=a; b++) {
			System.out.print("* ");	
			}
			System.out.println();
		}
	}

}

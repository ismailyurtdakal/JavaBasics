package com.syntax.class09;

public class ArraysIntro {

	public static void main(String[] args) {
		// Collection of similar data
		//variables that can hold multiple data
		
		int num=10;//indexes= 0,1,2,3,4..
		
		int num1;
		num1=10;
	//declare an array and initialize it
		int[] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
	//access elements form an array
		System.out.println(array[1]);
		
		
	//2 way
	//from above example ->String[] carArray= new String[3];
	String[] carArray; //preferred way (way1)
	String carArray1[]; //this can be used too (way2)
	
	carArray=new String[3];
	carArray[0]="BMW";
	carArray[1]="Honda";
	carArray[2]="Toyota";
	//I am driving Totoya
	
	System.out.println("I am driving "+carArray[2]);
	
	int [] numbers=new int[3];
	
	numbers[0]=100;
	numbers[1]=200;
	numbers[2]=300;
	//change value of number[1]
	numbers[1]=2000;
	
	System.out.println(numbers[1]+numbers[0]);
	
			

	}

}

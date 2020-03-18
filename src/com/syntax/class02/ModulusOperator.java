package com.syntax.class02;

public class ModulusOperator {
	
public static void main(String[] args) {
	
	float f=12.50f;
	float f1=2.7f;
	
	double d=12.50;
	double d1=2.7;
	
	float result=f/f1; //4.6296296
	//float can hold 5-7 decimals
	double result4=d/d1;//4.62962962962963
	//double can hold 14-15 decimals
	
	System.out.println(result);
	System.out.println(result4);
	
	//issue with dividing integers
	int i=12;
	int y=7;
	
	int result1=i/y;
	float result2=i/y;
	double result3=i/y;
	System.out.println(result1);
	
	System.out.println(result2);
	System.out.println(result3);
	
	//modulus
	int v=16;
	int w1=7;
	
	int mod=v%w1;
	
	System.out.println(mod);
	
	//I would like to divide 12/7
	//int num1=12.5; not possible to store decimals in integers
	
	double num2=12; //we can store into double
	double num3=7;
	
	System.out.println(num2/num3);
	
	
	   
		int w=5;
		int h=8;
		int p=2*w*h;
		int a=w*h;

		System.out.println("The perimeter of a rectangle with width "+w+" and height"+h+ 
		"is equal to "+p+" and the area equals to "+a );
	
	
	
	
	
	
	
	
	
	
	
}	

}

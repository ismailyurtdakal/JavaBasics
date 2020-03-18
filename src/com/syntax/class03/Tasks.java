package com.syntax.class03;

public class Tasks {

	public static void main(String[] args) {
		double a=100.2;
		double b=20.2;
/*task1
 * Create a Java program and name it Double Comparison. Declare 2 double values and if value of first variable is higher then the second, 
 * print “Double value __ is larger than __ .” Otherwise print...	
 */
if (a>b) {
	System.out.println("Double value "+ a+" is "+"larger than "+b);
}else {
	
	System.out.println("Double value "+ a+" is "+"smaler than "+b) ;
}
	
	/*task2
	 * /Create a Java program and name it Temperature Check. Create variable to store temperature. Your program should check if temperature is below 32 
	 * then it should print “Water will freeze with temperature __“, otherwise “Water will NOT freeze with temperature __“.
	 */
//TemperatureCheck
	
	int t=20;
	int fT=32;
	if(t<fT) {
		System.out.println("Water will freeze with temperature "+t);
	}else {
		System.out.println("Water wil NOT freeze with temperature "+t);
	}
	}

}



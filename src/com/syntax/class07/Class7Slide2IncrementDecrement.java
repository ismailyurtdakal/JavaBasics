package com.syntax.class07;

public class Class7Slide2IncrementDecrement {

	public static void main(String[] args) {
		int x = 10;
		x = x + 1;// or x+=1; or x++; ---> (this is another way to add +1)
		x++;
		System.out.println(x);

		int y = 90;
		y -= 1; // y=y1-;
		y--; // another way to substract -1 from a VARIABLE

		System.out.println(y);

		// 1++; compiler will give error
		// 2--;

//Increment & decrement operators used with variables ++ or -- and 
//		this operators will be used with LOOP statements
//LOOPs is JAVA- execute block of code multiple times

// LOOPS : while do while for, 
//enhanced for loops/advanced for loops/for each loop		

		int time = 10;
		if (time < 12) {

			System.out.println("Good morning");
		}
		
		System.out.println("----------WHILE LOOP------------");
//      while (time < 12) {
//	    System.out.println("Good morning");//CODE WILL EXECUTE INFINITELY
//		}

		while (time<=12) {
	System.out.println("Good morning");
	time++; //We need a condition to stop the LOOP(Condition true 3 times, 10,11,12
//MY NOTES: in LOOP 1.Initialize the variable  2. up to where? 3. condition
	
//	while(test variable) {
//		code;
//		increment or decrement;
		}
	}
}

package com.syntax.class09;

public class Class9Slide1 {

	public static void main(String[] args) {
// 4 loops: while, do while, for, and advanced for
//while or do while when we don't know number of iterations
//for or advanced for when we know number of iteration ahead of time	
		
//break to stop the loop;
//continue to skip the current iteration (to move to next iteration)
		
//NESTED LOOP - loop inside the loop
		
for (int i=1; i<=3; i++) {
	
System.out.println("I am outer loop");	

for (int j=1; j<=3; j++) {

System.out.println("I am inner loop");
}
}		
		
	}

}

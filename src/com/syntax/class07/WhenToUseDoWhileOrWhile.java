package com.syntax.class07;

public class WhenToUseDoWhileOrWhile {

	public static void main(String[] args) {
// when we DO NOT know how many times we have to repeat block of code -->while loop
// when we know how many times we have to repeat block of code -->for loop 
		
// while checks condition first and then executes the block of code.	
//do while first execute code and then tests the condition.		
//do while execute at least one of codes		
		
//int a=1 --declare code
//
//while(a<4) { -->test condition
//	
//	code;
//code;
//code;
//code;		
//a++;--> increment
		
//for loop		

//Good morning 5 times		
		
for (int c=1; c<6; c++) {
System.out.println("Good morning");	
}		
//print numbers from 1 to 10

for(int i=1; i<=10; i++) {
	System.out.println(i);
}

//print numbers from 10 to 1
for (int i=10; i<=1; i--) {
System.out.println(i);	
}
//what will be the output?
for (int i=0; i<=50; i+=5) {
	System.out.println(i);
}

System.out.println("-----------Final ExAMPLE--------");
//What is the output?
int sum=0;
for(int i=1; i<5; i++) {
	sum=sum+i;
}
System.out.println(sum);
}
		
	}



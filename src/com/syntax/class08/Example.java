package com.syntax.class08;

public class Example {

	public static void main(String[] args) {
//for (int i=20; i<=50; i++){
	//	if(i%2!=0)
//System.out.println(i);		
//		}


//What is output?
int total=2;
for(int k=1; k<4; k++) {
total=total*k;	
System.out.println(total);

}
System.out.println("Final total "+total);	
//write a program to calculate sum of odds and sum of even numbers
//1 to 99
 
int sumOdd=0;
int sumEven=0;
for(int i=0; i<=49; i++) {
sumOdd=sumOdd+2*i;
sumEven=sumEven+2*i+1;
	System.out.println("Sum of Odd numbers is "+sumEven);
	
	System.out.println("Sum of Even numbers is "+sumOdd);

//2nd way
// int evensSum=0;
//int oddsSum=0;
// for (int i=1; i<=99; i++){
//if(i%2==0{
//evensSum=evensSum+i;
//}else {
//}oddsSum=oddsSum+i
//	System.out.println("(Sum of Evens "+evensSum);
//System.out.println("(Sum of Odds "+evensOdd);	
//}	
}
	}

}

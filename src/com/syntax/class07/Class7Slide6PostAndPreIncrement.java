package com.syntax.class07;

public class Class7Slide6PostAndPreIncrement {

	public static void main(String[] args) {
		//i+=2 means i=i+2
		
		// ++, --
		//preincrement ++y, postincrement y++
		int y=10;
		y=y++;//postincrement = first use the variable then increment
		System.out.println(y);
		
		int x=10;
		x=++x;//first increment and then use it and assign it
		System.out.println(x);
		
		System.out.println("------- next example ++num-----------");	
		int  num=1;
		while(num<5) {
		System.out.println(++num);	
		}
		System.out.println("------- next example num++-----------");
	int num1=1;
	while(num1<5) {
		System.out.println(num1++);
	}
	}

}

package com.syntax.class07;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {

//write a program to find	the value of one number raised to the power of another	
		
		Scanner scan = new Scanner(System.in);
        
        System.out.println("please enter two number");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int i;
        int result=1;
        
        for(i=1;i<=num2;i++) {
            result=result*num1;
            
        }
        
        System.out.println(result);
        
    }

}


package com.syntax.class03;
public class NewTask {
	public static void main(String[] args) {	//task1
/* Create a Java program and declare int variable that will hold a month. Based on the value of the variable your program should print the name of the month.
 * 
 */
	int	month=9;
	
	int January=1;
    int February=2;
    int March=3;
    int April=4;
    int May=5;
    int June=6;
    int July=7;
    int August=8;
    int September=9;
    int October=10;
    int November=11;
    int December=12;
    
    if (month==1) {
    	System.out.println("January");
      }else if(month==2) {
    	 System.out.println("February"); 
      }else if(month==3) {
    	  System.out.println("March");
      }else if (month==4){
    System.out.println("April");
	} else if(month==5) {
		System.out.println("May");		
	}else if(month==6) {
		System.out.println("June");		
	}else if(month==7) {
		System.out.println("July");
	}else if (month==8) {
		System.out.println("August");
	}else if(month==9) {
		System.out.println("September");		
	}else if(month==10) {
		System.out.println("October");
	}else if(month==11) {
		System.out.println("November");
	}else if(month==12) {
		System.out.println("December");
	}else if(month>=13) {
		System.out.println("Not a valid month");
	}else if(month<=0) {
		System.out.println("Not a valid month");
	}

//task2    
/* Write a program to check whether number is positive or negative.
 * 
 */
int i=12220;
    
    if(i>0) {
    	System.out.println("This is a positive number");
    }else if (i<0) {
    	System.out.println("This is a negative number");
    }else if(i==0) {
    	System.out.println("This number is neither positive nor negative");
    	
    	
    }
  
    //task3
    
    /*Interview Question
Write a Java Program to check whether number is Even or Odd.
     * 
     */
    int a=-121;
        
    if(a%2==0) {
    System.out.println("This is an Even number");	
    }else {
    	System.out.println("This is an Odd number");
    }
    
    
    
}
}


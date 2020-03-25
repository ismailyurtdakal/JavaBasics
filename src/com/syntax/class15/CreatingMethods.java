package com.syntax.class15;

public class CreatingMethods {
//we want to create a method that will accept marks(90,80) 
//based on the marks it will return grade(A,B,C)
//If grade is more than 90-->A, 80>--B, 80< and >70 --C
	
	String coursegrade (int a) {
		String grade;
	
		if(a>90 ) {
			grade= "A";
			
		}else if (a<=90 && a>80) {
			grade= "B";
		}else if(a<=80 &&a>70){
			grade= "C";
			
		}else if(a>60) {
			grade= "D";
		}else {
			grade= "F";
		}
		return grade;
	}
public static void main(String[] args) {
	CreatingMethods obj=new CreatingMethods();
	String a=obj.coursegrade(8);
	
	System.out.println("Your grade is "+ a);

	//if grade is A or B--> good jo, otherwise, studey more 
	
	if(a =="A" || a =="B" ){
	
	System.out.println("Good job");
}	else {
	System.out.println("Study more");
}
	}
}

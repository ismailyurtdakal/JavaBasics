package com.syntax.class03;

public class CompareNumbers {

	public static void main(String[] args) {
		double numberOne=10;
		double numberTwo=10;
		
		if(numberOne>numberTwo) {
			System.out.println("Number one is larger than number  two");
		}else if(numberOne<numberTwo) {
			System.out.println("Number one is smaller than number two");
		}else {
			System.out.println("Numbers are equal");
			System.out.println("_________________________");
			
			//declare variable for a day and then based on the value we will pout
			
			int day=6;
			if(day==1) {//false
				System.out.println("It is Monday, no class today");
			}else if(day==2){//false
				System.out.println("It is Tuesday, we have SDLC Class");
			}else if(day==3) {//false
				System.out.println("It is Wednesday, we have SDLC Class");
			}else if(day==4) {//false
				System.out.println("It is Thursday, we have Review Class");
			}else if(day==5) {//false
				System.out.println("It is Friday, no class");
			}else if(day==6) {//true
				System.out.println("It is Saturday, we have Java Class");
			}else if(day==7) {//false
				System.out.println("It is Sunday, we have Java Class");
			}else {
				System.out.println("Invalid weekday");
			}
					
					
		}

	}

}

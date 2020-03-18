package com.syntax.class04;

public class NestedIfExample1 {

	public static void main(String[] args) {
		//declare date and a day
		//if day is Friday-->if date is 13-->watch a scary movie
		//                 --> if date is not 13 --> watch a comedy
		
		
		
		boolean isFriday=true;
		int date=13;
		
		if(isFriday) {
		System.out.print("Today is Friday, I am going to watch ");	
		
		if (date==14) {
			
			System.out.println("a scary movie");
		}else {
			System.out.println("a comedy movie");
		}
			
	
	}else {
			
			System.out.println("Today is not Friday, I am staying home");
		}
		
	}

}

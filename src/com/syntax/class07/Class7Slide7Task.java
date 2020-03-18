package com.syntax.class07;

public class Class7Slide7Task {

	public static void main(String[] args) {
//		Create a boolean variable workDay and assign true create int variable day and 
//		assign it to 1
//
//		As long as it is workDay print “I need a day off” and increase day.
//		Once day is 6 print “I do not need a day off any more”

//first way		
boolean workDay=true;
int day=1;

while(workDay && day<=5){
		System.out.println("This is  workday and I need a day off");
		day++;
}
	System.out.println("I do not need a day off anymore");
	
}


}

//while(workDay){
//System.out.println("This is  workday and I need a day off");
//if(day<6){
//

//}else{
//System.out.println("This is NOT  workday and I dont need a day off");
//}
//workDay=false;
//}
//}
//}
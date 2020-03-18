package com.syntax.class06;

public class Class6Slide1Recap {

	public static void main(String[] args) {
		/* Logical Operators
		 * Why?
		 * To test 2 or more conditions
		 * AND && --> both conditions must be true
		 * OR || --> at least 1 conditions must be true
		 * NOT ! --> reverse the condition
		 *  
		 */

		/* Example
		 * If hour is between 1-11 --> morning
		 * if hour between 12-15 --> afternoon
		 * If hour is between 16-20 --> evening
		 * if hour is between 21-24 --> night
		 */
		
		
		// int 
		int hour =25;
        String timeOfDay;
        
        if(hour>=1 && hour <=11) {
            timeOfDay="Morning";
        }else if(hour >=12 && hour <=15) {
            timeOfDay="Afternoon";
        }else if (hour >=16 && hour <=20) {
            timeOfDay="Evening";
        }else if (hour >=21 && hour <=24) {
            timeOfDay="Night";
        }else {
            timeOfDay="Unknown";
        }
        //if time of the day is not unknown --> only then I want to see the message
        if(!timeOfDay.equals("Unknown")) {
            System.out.println("Right now is "+timeOfDay);
        }
	}
}




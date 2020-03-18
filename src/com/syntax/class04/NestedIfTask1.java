package com.syntax.class04;
/*Write a program to store a boolean value of whether user has diploma or not. 
 * If user has a diploma, you should say congratulations, otherwise program should suggest to get a degree. 
 * Then if user has a degree program should check a gpa score. If gpa score is higher or equals to 3.5 → output should say 
 * “You are eligible for scholarship”, otherwise → “You should have studied harder”
 * 
 */
public class NestedIfTask1 {

	public static void main(String[] args) {
		boolean diploma=true;
		double gpa=3.4;
		
		if (diploma) {
			System.out.println("Congratulations. You have earned a college diploma");
		if(gpa>=3.5) {
			System.out.println("Your gpa is 3.5 or above. You are eligible for scholarship");
		} else {
			System.out.println("Your gpa is below 3.5. You should have studied harder");
		}
			
		}else {
			
			System.out.println("We suggest you to get a degrree");
		}
		
		
	}

}

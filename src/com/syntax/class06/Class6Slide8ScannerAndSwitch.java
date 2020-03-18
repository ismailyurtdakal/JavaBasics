package com.syntax.class06;

import java.util.Scanner;

public class Class6Slide8ScannerAndSwitch {

	public static void main(String[] args) {
	/*Ask a user a gender:M or F
	 * based on the gender will provide description
	 * 
	 */
		
		Scanner scan;
		char gender;
		String genderType;
		
		scan=new Scanner(System.in);
		System.out.println("Please enter your gender: M or F");
		
		gender=scan.next().charAt(0);
		
		switch (gender) {
		case 'M':
		genderType="Male";
		break;
		
		case 'F':
		genderType="Female";
		break;
		default:
			genderType="Unknown";
			
		}
		System.out.println("Your gender is " + genderType);
		
	}

}


/*Limitations 
*1. no relations (>, >=, <, <=) or logical operators (&&, ||, !) can be used
*2.switch case works only with byte, short, char, int and String
*3. In switch, we cannot have duplicate cases
*in Switch case, we MUST use break;
* 
*/
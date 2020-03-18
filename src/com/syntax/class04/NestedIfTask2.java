package com.syntax.class04;
/* Create a Java program and store values of mortgage rate and mortgage price. First, program should check if rate is 
 * higher than 4.5 user will not buy a house, otherwise user will consider buying. Once user decides to buy a house, 
 * if price of the house is larger than 200000 than user will take a loan, otherwise user will pay cash.
 * 
 */
public class NestedIfTask2 {

	public static void main(String[] args) {
		
		double rate=4.4;
		int price=200000;
		
		if(rate>4.5) {
			System.out.println("I will not buy this house");
		}
		
		else {
			System.out.print("I will consider buying this house");
		}
		if(price>=200000) {
			System.out.println(" and I will take a loan");
			
		}else  {
			System.out.println(" and I will pay cash");
		}
	}

}

/*Mr. Mert's answer
 *package com.syntac.class04;
public class Task2 {
	public static void main(String[] args) {
		double rate=3.5;
		double price= 210000.50;
		if (rate>4.5){
			System.out.println("Do not buy this house");
		}else {
			System.out.println("You can consider buying");
			if (price>200000) {
				System.out.println("Take loan");
			}else {
				System.out.println("Pay cash");
			}
		}
	}
} 
 *
 */

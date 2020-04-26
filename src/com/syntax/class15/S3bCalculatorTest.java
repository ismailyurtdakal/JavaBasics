package com.syntax.class15;

public class S3bCalculatorTest {

	public static void main(String[] args) {

		S3aCalculator calc = new S3aCalculator();
         calc.add(100,200);
         calc.sub(1000,300);
  //calc.add(200); CE       
  //calc.add(100.99, 200.1); CE      
	
	calc.mult(20, 5);
	
	calc.div(500, 10);
	}

}

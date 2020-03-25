package com.syntax.class16;

public class S3LocalVariables {

	void nameInside() {

		String name = "John"; // local variable that is visible only within method it was declared
	}

	public static void main(String[] args) {
//		System.out.println(name);CE: name won't be visible to another method
//since it scope only withInside method

		S3LocalVariables obj= new S3LocalVariables();
		obj.nameInside();
		
		
		boolean flag =true;
		
		if(flag) {
			String answer="Yes";
		}
//		System.out.println(answer);CE: scope of variable is not visible outside of the if condition
	
		for(int i=1; i<=5; i++) {
			System.out.print(i+" ");
		}
		
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		
	}
}
}
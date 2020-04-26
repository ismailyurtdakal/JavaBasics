package com.syntax.class21;

public class ProgrammingLanguage {
    
	String name;
	String variable;
	
	
// we  have to create parent class constructor to iniliaze parent class variables,
//	otherwise it has to be done in all child classes	
	public ProgrammingLanguage(String name, String variable) {
		this.name=name; 
		this.variable=variable;
	}
}
//----------------JAVA CHILD CLASS----------------
class Java extends ProgrammingLanguage {

	String constructor;
	
	Java(String name,String variable, String constructor){
		//super();CE
		super(name, variable);
		this.constructor=constructor;
		
	}

	public void details() {
		System.out.println("Programming language " + name + " can have variables"+ variable+
				
				" and constructor "+ constructor);
	}
}
////----------------------ANOTHER CHILD CLASS JAVASCRIPT------------------ 
//class JavaScript extends ProgrammingLanguage{
//
//	public JavaScript(String name, String variable) {
//		super(name, variable);
//	
//	}
//
//	public void details() {
//		System.out.println(name+" can have variables "+variable);
//	}
//	
//}
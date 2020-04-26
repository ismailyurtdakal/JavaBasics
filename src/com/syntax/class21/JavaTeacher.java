package com.syntax.class21;

public class JavaTeacher extends Teacher {
//compiler will create a default constructor JavaTeacher(); and 
//call inside to parent class default constructor by super(); 
	String certifications;
	
	JavaTeacher(String name, String lastName, String certifications){
		super(name, lastName);
		this.certifications=certifications;
	}
	
}

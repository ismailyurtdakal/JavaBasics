package com.syntax.class29;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Task3 {

	public static void main(String[] args) {
//3)Create a Set collection that will hold Objects of Student Type.
//In this set we do not care about the insertion order. 
//Each student object should have name and studentID. 
//		Display name of each student.		

Student st1=new Student("Mesut", 11111);
Student st2=new Student("Saadet", 2222);
Student st3=new Student("Esin", 3333);

		LinkedHashSet<Student> st=new LinkedHashSet<>();
		
		st.add(st1);
		st.add(st2);
		st.add(st3);
		
		Iterator<Student> it=st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().name);
		}
	}
}

class Student{
	String name;
	int id;
	Student(String name, int id){
		this.name=name;
		this.id=id;
	}
}

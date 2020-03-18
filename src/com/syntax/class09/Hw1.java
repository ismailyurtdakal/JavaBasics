package com.syntax.class09;

public class Hw1 {

	public static void main(String[] args) {
//Q1 Create an array of chars and store grades into it: A,B,C,D,E,F. 
//Then print a grade B (use 2 different ways of creating an array).
char[] grades1 =new char[6];
		
grades1[0]='A';
grades1[1]='B';
grades1[2]='C';
grades1[3]='D';
grades1[4]='E';
grades1[5]='F';
System.out.println(grades1[1]);

char[] grades2= {'A', 'B','C', 'D', 'E', 'F'};

System.out.println(grades2[1]);

//Q2 Create an array of names and store all names of your group.
//Then print your name from that array. (use 2 different ways of creating an array).
String names[] = new String[6];
names[0]="Abdullah";
names[1]="Mehmet";
names[2]="Hassna";
names[3]="Aaron";
names[4]="Gulen";
names[5]="Ismail";

System.out.println(names[0]+", "+names[1]+", "+names[2]+", "+names[3]+", "+names[4]+", "+names[5]);

String[] names1= {"Abdullah", "Mehmet", "Hassna", "Aaron", "Gulen"};
System.out.println(names1[2]);

//Q3 Create an array of words: Java, Saturday, day, coding, is. 
//Print the following sentence using elements of array: “Saturday is Java coding day”.

String[] words= {"Java", "Saturday", "day", "coding", "is"};
System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]);
	}

}

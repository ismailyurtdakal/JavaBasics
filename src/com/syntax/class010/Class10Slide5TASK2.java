package com.syntax.class010;

public class Class10Slide5TASK2 {

	public static void main(String[] args) {
// TASK2 Create an array on integers and 
//		calculate the sum of all integer elements in an array.
		
		int[] num= {2,41,15,6,79,199};
		
		int sum=0;
		
		for(int i:num) {
	       sum+=i;
	}
		System.out.println("The sum of the entered numbers is "+sum);
	}
}

//int[] num=new int[5];
//num[0]=0;
//num[1]=1;
//num[2]=2;
//num[3]=3;
//num[4]=4;
//int sum1=0;

////1 way	
//for (int i=0; i<5; i++) {
//	 sum1=sum1+num[i];or sum1+=num[i]
//}System.out.println(sum);

//System.out.println("---------------------");	
////2 way
//int sum2=0;
//for(int number:num) {
//sum2=sum2+number;	
//}System.out.println(sum2);


package com.syntax.class010;

public class Class10Slide9 {

	public static void main(String[] args) {
		// 
		
		String[][] month= {
				             {"January", "February", "December"}, 
				             {"March","April", "May"},
				             {"September","October","November"}
		                  };
		
	for(int i=0; i<month.length; i++) { //iterates rows
	for (int j=0; j<month[i].length; j++) {//iterates columns
			
			System.out.print(month[i][j]+" ");
		}
		
		System.out.println();
	}
//		System.out.println(month[1][1]);
//	int rows=month.length; //how many arrays 
//	int firstArray=month[0].length;
	
//	System.out.println(month[2].length);
	}

	}


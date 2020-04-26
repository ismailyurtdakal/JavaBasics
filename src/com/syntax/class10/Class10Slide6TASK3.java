package com.syntax.class10;

public class Class10Slide6TASK3 {

	public static void main(String[] args) {
// TASK 3 Create an array of countries.
//While retrieving all values from an array print capital for each country. 
//		(use 2 different loops).
		
		String [] countries ={"USA", "Poland", "Ukraine", "Turkey", "Spain"};
		
		for (String i:countries){
			if (i.equals("USA")){
				System.out.println("The capital of "+ i+ " is Washington DC");
			}else if (i.equals("Poland")){
				System.out.println("The capital of "+ i+ " is Warsaw");
			}else  if (i.equals("Ukraine")){
				System.out.println("The capital of "+ i+ " is Kiev");
			}else  if (i.equals("Turkey")){
				System.out.println("The capital of "+ i+ " is Ankara");
			}else if (i.equals("Spain")){
				System.out.println("The capital of "+ i+ " is Madrid");
			}
			System.out.println("--------2nd method----");
			for(int y=0; y<countries.length;y++){
				if (countries[y].equals("USA")){
					System.out.println("The capital of "+ countries[y]+ " is Washington DC");
				}else if (countries[y].equals("Poland")){
					System.out.println("The capital of "+ countries[y]+ " is Warsaw");
				}else  if (countries[y].equals("Ukraine")){
					System.out.println("The capital of "+ countries[y]+ " is Kiev");
				}else  if (countries[y].equals("Turkey")){
					System.out.println("The capital of "+ countries[y]+ " is Ankara");
				}else if (countries[y].equals("Spain")){
					System.out.println("The capital of "+ countries[y]+ " is Madrid");
				}
			}
System.out.println("----2nd way----");			
			
String[] countries1 = { "USA", "Poland", "Ukraine", "Turkey", "Spain" };
for (int y = 0; y < countries1.length; y++) {
            switch(countries1[y]) {
            
            case "USA":
                System.out.println("The capital is Washington DC");
                break;
            case "Poland":
                System.out.println("The capital is Warsaw");
                break;
            case "Ukraine":
                System.out.println("The capital is Kiev");
                break;
            case "Turkey":
                System.out.println("The capital is Ankara");
                break;
            case "Spain":
                System.out.println("The capital is Madrid");
                break;
            }
            
        }		
	
		}
	}
}


//System.out.println("====Task-1===============");
//String[] animalNames= {"Tiger","Lion", "Elephant", "Jaguar"};
//System.out.println("==1st for loops===========");
//for (String name: animalNames) {
//	System.out.println(name+" ");
//}
//System.out.println("====2nd for loops============");
//for(int row=0;row<animalNames.length;row++) {
//	System.out.print(animalNames[row]+", ");
//}
//System.out.println();
//System.out.println("======Task-2===================");
////Create an array on integers and 
////calculate the sum of all integer elements in an array.
//int[] num= {10, 20, 30, 40, 50, 60,70};
//int sum=0;
//for(int i:num) {
//	sum+=i;
//}
//System.out.println(sum);
//System.out.println("======Task-3===================");
////Create an array of countries. 
////While retrieving all values from an array print capital for each country. 
////(use 2 different loops).
//String[] countries= {"Bangladesh", "USA", "India", "Pakistan"};
//String capital = null;
//System.out.println("===1st Loop=====================");
//for(String name: countries) {
//	if(name.equals("Bangladesh")) {
//		capital="Dhaka";
//	}else if(name.equals("USA")) {
//		capital="Washington DC";
//	}else if(name.equals("India")) {
//		capital="New Delhi";
//	}else if(name.equals("Pakistan")) {
//		capital="Islamabad";
//	}else {
//		capital="unknown";
//	}
//	System.out.println("The capital of "+name+" is "+capital+" ." );
//}
//System.out.println("===2nd Loop=====================");
//for(int i=0;i<countries.length;i++) {
//	if(countries[i].equals("Bangladesh")) {
//		capital="Dhaka";
//	}else if(countries[i].equals("USA")) {
//		capital="Washington DC";
//	}else if(countries[i].equals("India")) {
//		capital="New Delhi";
//	}else if(countries[i].equals("Pakistan")) {
//		countries[i]="Islamabad";
//	}else {
//		capital="unknown";
//	}
//	System.out.println("The capital of "+countries[i]+" is "+capital+" ." );
//}
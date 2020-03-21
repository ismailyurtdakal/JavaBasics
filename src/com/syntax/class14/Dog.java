package com.syntax.class14;

public class Dog {
    
    String breed;
    String color;
    String name;
    int age;
    
    public static void main(String[] args) {
        
        Dog dog1=new Dog();
        
        dog1.breed="Afador";
        dog1.color="Black";
        dog1.name="Lucy";
        dog1.age=1;
        
        dog1.bark();
        dog1.eat();
        dog1.run();
        
        
        Dog dog2=new Dog();
        
        dog2.breed="Akbash";
        dog2.color="White";
        dog2.name="Boss";
        dog2.age=3;
        
        dog2.bark();
        dog2.eat();
        dog2.run();
        
        // print I have a white akbash named boss
        
        System.out.println("I have a "+dog2.color+" dog "+"named "+dog2.name);
        
 
		
	}
	void eat() {
    	System.out.println(name+" can eat");
    } 
    void bark(){
    	System.out.println(name+" can bark");
    	
    }
    void run(){
    	System.out.println(name+ " can run");
}
}
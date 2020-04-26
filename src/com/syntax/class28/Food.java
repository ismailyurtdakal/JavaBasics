package com.syntax.class28;

public abstract class Food {

	abstract void meat();

	abstract void vegetable();

	abstract void mixed();
}

class Meat extends Food {

	@Override
	void meat() {
		System.out.println("meat food from Meat class");
	}

	@Override
	void vegetable() {
		System.out.println("vegetables food from Meat class");
	}

	@Override
	void mixed() {
		System.out.println("mixed food from Meat class");
	}
}

class Vegan extends Food {
	
	@Override
	void vegetable() {
		System.out.println("vegetable food from Vegan");
	}

	@Override
	void meat() {
		System.out.println("meat food from Vegan class");
		
	}

	@Override
	void mixed() {
		System.out.println("mixed food from Vegan class");
		
	}
}

class Mixed extends Food {
	
	@Override
	void mixed() {
		System.out.println("mixed food from Mixed class");
	}

	@Override
	void meat() {
		System.out.println("meat food from Mixed class");
		
	}

	@Override
	void vegetable() {
		System.out.println("vegetable food from Mixed class");
		
	}
}

class Allfood extends Food{
	
	@Override
	void meat() {
		System.out.println("meat food from Allfood class"); 
	}

	@Override
	void vegetable() {
		System.out.println("vegetable food from Allfood class");
	}

	@Override
	void mixed() {
		System.out.println("mixed food from Allfood class ");
	}
}
package com.syntax.class18;

public class S10USA {

	static // create variables to hold state and capital of the state
	String state;
	String stateCapital;

	// create a method to display state and stateCapital
	public void display() {
		System.out.println(state + " and it's capital is " + stateCapital);
	}

	// create a constructor that will initialize instance variables
	public S10USA(String state, String stateCapital) {
		this.state = state;
		this.stateCapital = stateCapital;

	}

	public static void main(String[] args) {
		S10USA usa = new S10USA("Michigan", "Lansing");

		usa.display();
	}
}

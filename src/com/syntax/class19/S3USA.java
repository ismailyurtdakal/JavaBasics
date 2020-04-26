package com.syntax.class19;

public class S3USA {
	String state, stateCapital;

	public S3USA(String state, String stateCapital) {

		this.state = state;
		this.stateCapital = stateCapital;
	}

	public void displayState() {
		System.out.println(state);
	}

	public void displayStateCapital() {
		System.out.println(stateCapital);
	}

	// can I call a method inside another method? --> YES
	public void displayInfo() {
		// this.displayState();
		displayState();// by default constructor add this keyword to a method
		displayStateCapital();
	}

	public static void main(String[] args) {
		S3USA state1 = new S3USA("Texas", "Austin");
		state1.displayInfo();
	}

}

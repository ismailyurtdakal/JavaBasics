package com.syntax.class24;

public class PhoneTest {

	public static void main(String[] args) {

		//Phone obj=new Phone();CE: abstract parent's objects cannot be created
		
		iPhone obj1=new iPhone();
			
		obj1.call();
		obj1.playMusic();
		obj1.takePicture();
		obj1.text();
		
		Samsung obj2=new Samsung();		
		obj2.call();
		obj2.playMusic();
		obj2.takePicture();
		obj2.text();
	}

}

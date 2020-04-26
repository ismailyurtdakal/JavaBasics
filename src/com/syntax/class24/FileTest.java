package com.syntax.class24;

public class FileTest {

	public static void main(String[] args) {
		JavaFile j=new JavaFile();
		WordFile w=new WordFile();
		PDFFile p=new PDFFile();
		
		j.close();
		j.edit();
		j.open();
		
		w.close();
		w.edit();
		w.open();
		
		p.close();
		p.edit();
		p.open();

	}

}

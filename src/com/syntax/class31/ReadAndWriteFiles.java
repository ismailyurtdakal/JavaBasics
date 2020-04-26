package com.syntax.class31;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.util.Properties;

public class ReadAndWriteFiles {

	public static void main(String[] args) throws IOException {
	
		String filePath="C:\\Users\\Is mAil\\eclipse-workspace\\JavaBasics\\configs\\configuration.properties";
         
		String userDirectory=System.getProperty("user.dir");
		System.out.println(userDirectory);
		
		String filePath1=System.getProperty("user.dir")+"\\configs\\configuration.properties";
				
		FileInputStream fis=new FileInputStream(filePath1);
		
		Properties prop=new Properties();
		
		prop.load(fis);
		
		String browser=prop.getProperty("browser");
		String url=prop.getProperty("url");
		
		
		System.out.println(browser);
		System.out.println(url);
		
		
	//	prop.setProperty("browser", "https://www.firefox.com");
		
//		Writer fos=new FileInputStream(path);
//		prop.store(fos, "add this");

		//hw
		//browser=chrome
		//url=https://facebook.com
		//username=
		//password=
		
		//use values from properties file to write selenium code
		//in selenium project, create 
		
	}
}

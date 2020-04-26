package com.syntax.class25_AbstractionAndInterface;

public class Test {

	public static void main(String[] args) {
		WebDriver chrm = new ChromeDriver();
		WebDriver fire = new FireFoxDriver();

		chrm.closeBrowser();
		chrm.findElement();
		chrm.openBrowser();
		chrm.findElement();
		chrm.maximizeWindow();

		fire.closeBrowser();
		fire.findElement();
		fire.openBrowser();
		fire.findElement();
		fire.maximizeWindow();

	}

}

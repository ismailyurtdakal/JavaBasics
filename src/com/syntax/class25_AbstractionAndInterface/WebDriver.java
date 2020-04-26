package com.syntax.class25_AbstractionAndInterface;

/* Task Create a WebDriver Interface that will have the following unimplemented 
 * behaviour: openBrowser(), closeBrowser(), maximizeWindow(), findElement(). 
 * Create 2 classes that implements WebDriver interface: 
 * ChromeDriver and FirefoxDriver.
 */
interface TakesScreenshot{
	String fileExtenson=".png";//public tatic final
	void takePicture();
	
	static void takeSelfie() {
		System.out.println("I can take a selfie");
	}
	
	default void takePanoPic() {
		System.out.println();
	}
}
public interface WebDriver {
	void openBrowser();
	void closeBrowser();
	void maximizeWindow();
	void findElement();
}

class ChromeDriver implements WebDriver, TakesScreenshot {

	@Override
	public void openBrowser() {
		System.out.println("Chrome opens browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Chrome closes browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Chrome maximizes Window");
	}

	@Override
	public void findElement() {
		System.out.println("Chrome finds elements");
	}

	@Override
	public void takePicture() {
		System.out.println("In chrome, we can take pictures");		
	}
}

class FireFoxDriver implements WebDriver {

	@Override
	public void openBrowser() {
		System.out.println("Firefox opens browser");
	}

	@Override
	public void closeBrowser() {
		System.out.println("Firefox closes browser");
	}

	@Override
	public void maximizeWindow() {
		System.out.println("Firefox maximizes windows");
	}

	@Override
	public void findElement() {
		System.out.println("Firefox finds elements");
	}
}
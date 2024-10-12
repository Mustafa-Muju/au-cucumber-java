package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	public static WebDriver driver = null;
	
	public static void invokeBrowser() {
		driver = new ChromeDriver();
		driver.get("http://yopmail.com/en");
		System.out.println("Browser is invoked");
	}

}

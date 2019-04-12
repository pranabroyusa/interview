package interview.questions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OpenBrowser {
	
	static WebDriver driver;
	public static void main(String []args)
	
	{
		selectbrowser();
	}
	
	
	
	public static void selectbrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pranab Roy\\Desktop\\Drivers\\chromedriver.exe");
	    driver=new ChromeDriver();
	    driver.get("https://www.macys.com/");
	}

}

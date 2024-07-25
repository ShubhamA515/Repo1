package driverconfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
static  WebDriver driver;
	
	public WebDriver initBrowser(String browsername)
	{
		if(browsername.equalsIgnoreCase("Chrome"))
		{
			 driver = new ChromeDriver();
			
		}
		
		else if (browsername.equals("Firefox"))
		{
			 driver = new FirefoxDriver();
		}
//		else
//		{
//			driver=new EdgeDriver();
//		}
//		
		return driver; 
		
		
	}
		
	public static WebDriver getDriver()
	{
		return driver;
	}
	

}

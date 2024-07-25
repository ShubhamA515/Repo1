package tp31524_2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class driverFactorytp 
{

static	WebDriver driver;	
	
	public WebDriver initBrowser(String browsername)
{
	if(browsername.equalsIgnoreCase("Chrome"))
	{
		 driver=new ChromeDriver();
	}
	
	else if (browsername.equalsIgnoreCase("firefox")) 
	{
		driver=new FirefoxDriver();
	}
	return driver;
}
	
	public static WebDriver getBrowser()
	{
		return driver;
	}
}

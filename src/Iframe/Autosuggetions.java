package Iframe;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autosuggetions 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.google.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	
	driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Shubham");
	
	String expected="shubham karoti kalyanam shlok";
	
	List<WebElement> allOptions = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
	Thread.sleep(1000);
	for(WebElement s1:allOptions)
	{
	String actual = s1.getText();
	
		if(actual.equals(expected))
		{
			s1.click();
			Thread.sleep(1000);
			break;
		}
	}
}
}

package Property_Nayana;
//package PH_Project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Simple_Example 
{

	
	public static void main(String[] args) throws InterruptedException 
	{
	WebDriver driver=new FirefoxDriver();
	
	driver.get("http://propertyhelper.dapssoftware.com/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("owner@gmail.com");
	
	Thread.sleep(1000);
	
	driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9876543210");
	
	Thread.sleep(1000);

	driver.findElement(By.xpath("//button[@class='LoginButton']")).click();
	
	Thread.sleep(1000);

	driver.findElement(By.xpath("(//a[@href=\"#\"])[1]")).click();
	
	driver.findElement(By.xpath("//a[@href='http://propertyhelper.dapssoftware.com/superadmin/company']")).click();

	//driver.findElement(By.xpath("              "));
	
	driver.close();
	
	//WebElement option=driver.findElement(By.xpath(""));
	
	//Actions act=new Actions(driver);
	
	//act.click();
}
}

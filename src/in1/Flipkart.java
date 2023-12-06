package in1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

public class Flipkart 
{

	public static void main(String[] args) 
	{
	WebDriver driver=new EdgeDriver();
	
	driver.get("https://www.flipkart.com/");
	
	
	driver.findElement(By.xpath("//span[@class=\"_30XB9F\"]")).click();

	driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("mobile");
	
	driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
	
	String Actual = driver.findElement(By.xpath("(//span[@class='_1XjE3T'])[1]")).getText();
	
	String expected= "Home & Furniture";
	
	Assert.assertEquals(Actual, expected);
	}
}

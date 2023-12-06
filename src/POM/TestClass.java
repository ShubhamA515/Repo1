package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class TestClass 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("");
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("")).click();
	
	driver.findElement(By.xpath("")).sendKeys(args);

	driver.findElement(By.xpath("")).sendKeys(args);
	
	String actual = driver.findElement(By.xpath("")).getText();
	
	String expected="";
	SoftAssert soft=new SoftAssert();
	
	soft.assertEquals(actual, expected);
	
	String a="aef";
	String b="aeaesd";
	
	soft.assertAll();
	
	
}
}

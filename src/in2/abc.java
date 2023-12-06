package in2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class abc 
{
	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		 boolean n = driver.findElement(By.id("nav-logo")).isDisplayed();
		
		System.out.println("1:"+n);
		
String c = driver.findElement(By.linkText("Toys Under $30")).getText();
		
		System.out.println(c);
		
String d = driver.findElement(By.linkText("Toys Under $30")).getText();
		
		System.out.println(d);
		
String e = driver.findElement(By.linkText("Toys Under $30")).getText();
		
		System.out.println(e);
	}


}

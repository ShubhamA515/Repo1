package Iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class s1 
{
public static void main(String[] args) {
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	//main page  
	
	driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/");
	
	
	driver.findElement(By.xpath("(//li[@class='resp-tab-item'])[2]")).click();
	
	driver.switchTo().frame("globalSqa");
	driver.findElement(By.xpath("//span[@id='current_filter']")).click();
	
	String mail = driver.findElement(By.xpath("(//div[@class='icon_mail'])[1]")).getText();	

	System.out.println(mail);
	
	//without switching to iframe, if we tried to handle the element in the frame, we will get a "No Such Element Exception".
	//So, first swith the focus of compiler to the iframe using name/id/xpath/frameindex.
	//then handle the frame element
	
	
	
	//For handling the element from main page, again shift the focus of the 
		//compiler to the main page using  default content or parent frame
	driver.switchTo().parentFrame();
	//or
	driver.switchTo().defaultContent();
	
	 
	
	String sas = driver.findElement(By.xpath("//li[@id='menu-item-6898'][1]")).getText();
	driver.findElement(By.xpath("//li[@id='menu-item-1513'][1]")).click();
	System.out.println(sas);
}
}

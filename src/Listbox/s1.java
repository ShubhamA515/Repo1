package Listbox;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
//import java.util.logging.FileHandler;
//import java.util.logging.FileHandler;
//import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class s1 
{
public static void main(String[] args) throws IOException 
{

WebDriver driver=new ChromeDriver();

driver.get("https://www.facebook.com");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

 WebElement month = driver.findElement(By.xpath("//select[@id='month']"));

Select s=new Select(month);

	//s.selectByIndex(3);
	s.selectByValue("10");
	//s.selectByVisibleText("Dec");
	
	File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest=new File("E:\\asas.jpg");
	
	FileHandler.copy(src, dest);
	
	System.out.println(src);
	System.out.println(dest);
		

	
	 
	

	
}
}
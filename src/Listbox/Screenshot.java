package Listbox;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
public static void main(String[] args) throws IOException 
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File dest=new File("E:\\asas.jpg");
	
	FileHandler.copy(src, dest);
	
	System.out.println(src);
	System.out.println(dest);
}
}

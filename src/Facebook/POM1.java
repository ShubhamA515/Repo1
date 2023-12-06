package Facebook;

import java.io.File;
//import java.util.logging.FileHandler;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;

public class POM1 
{
public static void main(String[] args) throws IOException 
{
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	File destination=new File("C:\\Users\\HP\\Desktop\\Screenshot\\TCID"+".jpg");
	
	FileHandler.copy(source, destination);
}
	



}

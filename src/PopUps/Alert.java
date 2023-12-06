package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert 
{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@name='alert']")).click();
	Thread.sleep(2000);
	String alt = driver.switchTo().alert().getText();
	System.out.println(alt);
	Thread.sleep(2000);
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
}
}

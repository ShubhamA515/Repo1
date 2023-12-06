package Listbox;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ChildWindow 
{
public static void main(String[] args) {
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://phptravels.com/demo");
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	WebElement company = driver.findElement(By.xpath("(//span[@class=\"dropbtn\"])[3]"));
	
	Actions act=new Actions(driver);
	act.click(company).perform();
	
	driver.findElement(By.xpath("(//a[@class='arrow waves-effect'])[13]")).click();
	
	driver.findElement(By.xpath(""));
	
	String allids = driver.getWindowHandle();
	
	ArrayList<String> al=new ArrayList<>();
	
	String childwindowid = al.get(0);
	
	driver.switchTo().window(childwindowid);
	
	
	
	
	
	
	
	
	
	
	
}
}

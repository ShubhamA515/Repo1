package in1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class sample 
{
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		WebElement month = driver.findElement(By.xpath(""));
		
		Actions act=new Actions(driver);
		
		act.click(month).perform();
		
		act.sendKeys(Keys.END);
		
		
		
	}
}

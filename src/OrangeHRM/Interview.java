package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Interview 
{
	public static void main (String [] args)
	{

	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");

	WebElement js=driver.findElement(By.xpath("(//ul[@class='uiList pageFooterLinkList _509- _4ki _703 _6-i'])/li[6]"));

	((JavascriptExecutor)driver).executeScript("[Arguments]", js) ;
	
	Actions act=new Actions(driver);
	act.click(js);



	}
}

package POM_Classes;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM3 
{
	WebDriver driver;
@FindBy (xpath = "//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']") private WebElement BuyNow;


public POM3(WebDriver driver)
{
	PageFactory.initElements(driver, this);



}


public void clickBuyNow()
{
//	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']")).click();
//
//	Set<String> allids = driver.getWindowHandles();
//
//	ArrayList<String> al=new ArrayList<>(allids);
//
//	String childwindowid = al.get(1);
//
//	driver.switchTo().window(childwindowid);
	BuyNow.click();
}


}

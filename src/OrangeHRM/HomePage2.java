package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage2 
{
	@FindBy (xpath="(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]") private WebElement PIM;

	public HomePage2(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void Click_PIM(WebDriver driver) throws InterruptedException
	{
		Actions act=new Actions(driver);
		
		act.moveToElement(PIM).perform();
		Thread.sleep(2000);
		act.click().perform();
		
	}
}

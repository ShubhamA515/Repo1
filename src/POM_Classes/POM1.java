package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1 
{
@FindBy (xpath = "//button[@class='_2KpZ6l _2doB4z']") private WebElement close;
	@FindBy (xpath = "//input[@class='_3704LK']") private WebElement searchbox;
@FindBy (xpath = "//button[@class='L0Z3Pu']") private WebElement searchbutton;




public POM1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
public void clickclose()
{
	close.click();
}

public void EnterSearch()
{
	searchbox.sendKeys("Redmi note 10");
}

public void ClickSearch()
{
	searchbutton.click();;
}





}

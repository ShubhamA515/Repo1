package POM_Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2 
{
@FindBy (xpath = "(//span[@class='_2_R_DZ'])[1]") private WebElement rating;
@FindBy (xpath = "(//li[@class='rgWa7D'])[4]") private WebElement xyz;
@FindBy (xpath = "(//div[@class='_4rR01T'])[1]") private WebElement mobile;
@FindBy (xpath = "//button[@class='_2KpZ6l _2U9uOA ihZ75k _3AWRsL']") private WebElement BuyNow;


public POM2(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}


public String printxyz()
{
	String xyzs=xyz.getText();
	return xyzs;
	
}



public String Ratings()
{
	String ratings = rating.getText();
	return ratings;
	
}


public void clickmobile()
{
	mobile.click();
	
}

public void Clickbuynow()
{
	mobile.click();
	
}



}

package in2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM_Amazon 
{
@FindBy (xpath="(//input[@class='nav-input nav-progressive-attribute'])[1]") private WebElement abc;

public POM_Amazon(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public String Usage()
{
String	text=abc.getText();
return text;
}
	
}

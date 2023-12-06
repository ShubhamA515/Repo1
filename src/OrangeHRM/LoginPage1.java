package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage1 
{
@FindBy (xpath="//input[@name='username']") private WebElement username;

@FindBy (xpath="//input[@name='password']") private WebElement password;

@FindBy (xpath="//button[@type='submit']") private WebElement submit;



public LoginPage1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void Input_Username(String USername)
{
	username.sendKeys(USername);
}

public void Input_Password(String pwd)
{
	password.sendKeys(pwd);
}

public void Click_Submit()
{
	submit.click();
}


}

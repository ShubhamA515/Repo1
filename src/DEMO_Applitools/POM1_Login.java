package DEMO_Applitools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM1_Login 
{

@FindBy (xpath = "//input[@id='username']") private WebElement username;

@FindBy (xpath = "//input[@id='password']") private WebElement password;

@FindBy (xpath = "//a[@class='btn btn-primary']") private WebElement SignUp;

public POM1_Login(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void Input_username()
{
	username.sendKeys("Admin");
}

public void Input_password()
{
	password.sendKeys("1234");
}

public void Click_SignUp()
{
	SignUp.click();;
}




}

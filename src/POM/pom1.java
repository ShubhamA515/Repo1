package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pom1 
{
@FindBy (xpath = "//a[@id='login_Layer']") private WebElement LoginButton;

@FindBy (xpath = "//input[@id='usernameField']") private WebElement username;

@FindBy (xpath = "//input[@id='passwordField']") private WebElement password;

@FindBy (xpath = "//button[@class='waves-effect waves-light btn-large btn-block btn-bold blue-btn textTransform']") private WebElement Submit;


public pom1(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void click_login()
{
	LoginButton.click();
}

public void input_username()
{
	username.sendKeys("shubham.agr6672@gmail.com");
}

public void input_password()
{
	password.sendKeys("Shubham@6672");
}

public void Click_submit()
{
	Submit.click();
}

}

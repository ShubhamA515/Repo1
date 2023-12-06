package DEMO_Applitools;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2_Homepage 
{
	@FindBy (xpath = "//div[@class='logged-user-name']") private WebElement usersname;

	//@FindBy (xpath = "//input[@id='password']") private WebElement password;

	//@FindBy (xpath = "//a[@class='btn btn-primary']") private WebElement SignUp;

	 public POM2_Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public String verify_usersname()
	{
		String actname = usersname.getText();
		return actname;
		
	}

//	public void Input_password()
//	{
//		password.sendKeys("1234");
//	}
//
//	public void Click_SignUp()
//	{
//		SignUp.click();;
//	}
}

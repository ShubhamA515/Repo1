package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Enter_EmployeeInfo4 
{
	@FindBy (xpath="//input[@name='firstName']") private WebElement FirstName;

	@FindBy (xpath="//input[@name='middleName']") private WebElement MiddleName;

	@FindBy (xpath="//input[@name='lastName']") private WebElement LastName;

	@FindBy (xpath="//button[@type='submit']") private WebElement Save;

	@FindBy (xpath="(//a[@class='oxd-topbar-body-nav-tab-item'])[1]") private WebElement EmployeeList;

	
	
	public Enter_EmployeeInfo4(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void Input_FirstName(String FN)
	{
		FirstName.sendKeys(FN);
	}
	
	public void Input_MiddleName(String MN)
	{
		MiddleName.sendKeys(MN);
	}
	
	public void Input_LastName(String LN)
	{
		LastName.sendKeys(LN);
	}
	
	public void Click_Save()
	{
		Save.click();
	}
	
	public void Click_Employee_ListPage()
	{
		EmployeeList.click();
	}
	
	
}

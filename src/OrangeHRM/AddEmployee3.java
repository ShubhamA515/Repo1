package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployee3 
{
	@FindBy (xpath="(//a[@class='oxd-topbar-body-nav-tab-item'])[2]") private WebElement Add_Employee;

	public AddEmployee3(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void Click_AddEmployee()
	{
		Add_Employee.click();
	}
	
}

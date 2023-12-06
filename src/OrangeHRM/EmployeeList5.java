package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EmployeeList5 
{
@FindBy (xpath = "(//a[@class='oxd-topbar-body-nav-tab-item'])[1]") private WebElement EmpList;

@FindBy (xpath = "(((//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable'])[8])/div)[3]") private WebElement user2_name; 

@FindBy (xpath = "(((//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable'])[8])/div)[4]") private WebElement user2_surname; 

@FindBy (xpath = "(((//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"])[38])/div)[3]") private WebElement user4_name;

@FindBy (xpath = "(((//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"])[38])/div)[4]") private WebElement user4_surname;

@FindBy (xpath = "(((//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"])[50])/div)[3]") private WebElement user1_name;

@FindBy (xpath = "(((//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"])[50])/div)[4]") private WebElement user1_surname;


@FindBy (xpath = "//button[@class='oxd-pagination-page-item oxd-pagination-page-item--page']") WebElement PageNo2;

@FindBy (xpath = "(((//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"])[42])/div)[3]") private WebElement user3_name;

@FindBy (xpath = "(((//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"])[42])/div)[4]") private WebElement user3_surname;



public EmployeeList5(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

public void Click_EmpList()
{
	EmpList.click();
}

public String PrintEmployee2_name()
{
	String user2Name = user2_name.getText();
	return user2Name;
}

public String PrintEmployee2_surname()
{
	String user2Surname = user2_surname.getText();
	return user2Surname;
}

public String PrintEmployee4_name()
{
	String user4Name = user4_name.getText();
	return user4Name;
}

public String PrintEmployee4_surname()
{
	String user4Surname = user4_surname.getText();
	return user4Surname;
}

public String PrintEmployee1_name()
{
	String user1Name = user1_name.getText();
	return user1Name;
}

public String PrintEmployee1_surname()
{
	String user1Surname = user1_surname.getText();
	return user1Surname;
}

public void Click_PageNo2()
{
	PageNo2.click();
}

public String PrintEmployee3_name()
{
	String user3Name = user3_name.getText();
	return user3Name;
}

public String PrintEmployee3_surname()
{
	String user3Surname = user3_surname.getText();
	return user3Surname;
}


}

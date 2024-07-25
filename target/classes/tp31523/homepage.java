package tp31523;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage 
{
	WebDriver driver;
	
@FindBy (xpath="") WebElement a;

@FindBy (xpath="") WebElement b;

@FindBy (xpath="") WebElement c;

public homepage(WebDriver driver)
{   
	this.driver=driver;

	PageFactory.initElements(driver,this);
}


public void inp_1()
{
	
}

public void inp_2()
{
	
}

public void inp_3()
{
	
}
}

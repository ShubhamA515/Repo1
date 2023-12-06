package DEMO_Applitools;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass 
{
	//WebDriver driver;
	POM1_Login p1;
	POM2_Homepage p2;
	
	@BeforeClass
	public void OpenBrowser()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.applitools.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 p1=new POM1_Login(driver);
		 p2=new POM2_Homepage(driver);
	
	}

	@BeforeMethod
	public void OpenApp()
	{
	p1.Input_username();
	p1.Input_password();
	p1.Click_SignUp();
	
	
		
		
	}

	@Test
	public void Verify()
	{
	
		String act = p2.verify_usersname();
		String exp= "Jack Gomez";
		
		Assert.assertEquals(act, exp);
	}

	@AfterMethod
	public void closeapp()
	{
	
	}

@BeforeClass
public void CloseBrowser()
{
	
}
}

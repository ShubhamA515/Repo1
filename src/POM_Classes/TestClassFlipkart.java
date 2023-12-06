package POM_Classes;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassFlipkart
{

	WebDriver driver;
	POM1 p1;
	POM2 p2;
	POM3 p3;
	
	@BeforeClass
	public void openbrowser()
	{	
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		p1=new POM1(driver);
		p2=new POM2(driver);
		p3=new POM3(driver);
	}
	

	@BeforeMethod
	public void logintoapp()
	{
		p1.clickclose();
		p1.EnterSearch();
		p1.ClickSearch();
		p2.clickmobile();
		
	
		
	}
	
	@Test
	public void TestPrint()
	{
//	p2.printxyz();
//	p2.Ratings();
		p3.clickBuyNow();
	}
	
	@AfterMethod
	public void closeApp()
	{
		
	}
	
	@AfterClass
	public void close()
	{
	//	driver.close();
	}
} 

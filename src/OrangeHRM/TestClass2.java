package OrangeHRM;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass2 extends BaseClass

{

	LoginPage1 p1;
	HomePage2 p2;
	AddEmployee3 p3;
	Enter_EmployeeInfo4 p4;
    EmployeeList5 p5;
    
	@BeforeClass 
	public void Initialize_Browser() throws InterruptedException
{
	OpenBrowser();
	p1=new LoginPage1(driver);
	p2=new HomePage2(driver);
	p3=new AddEmployee3(driver);
	p4=new Enter_EmployeeInfo4(driver);
	p5=new EmployeeList5(driver);
	
	 p1.Input_Username("Admin");
	 p1.Input_Password("admin123");
	 p1.Click_Submit();
	 
	
}
	@BeforeMethod
	public void open_EmplyeePage() throws InterruptedException
	{
		p2.Click_PIM(driver);
		Thread.sleep(2000);
		p5.Click_EmpList();
		Thread.sleep(2000);
	}
	
	@Test
	public void verify1() throws InterruptedException
	{
		String n1 = p5.PrintEmployee1_name();
		System.out.println(n1);
		Thread.sleep(1000);
		String s1 = p5.PrintEmployee1_surname();
		System.out.println(s1);
		Thread.sleep(1000);
	}
	
	@Test
	public void verify2() throws InterruptedException
	{
		String n2 = p5.PrintEmployee2_name();
		System.out.println(n2);
		Thread.sleep(1000);
		String s2 = p5.PrintEmployee2_surname();
		System.out.println(s2);
		Thread.sleep(1000);	
	}
	
	@Test
	public void verify3() throws InterruptedException
	{
		String n3 = p5.PrintEmployee3_name();
		System.out.println(n3);
		Thread.sleep(1000);
		String s3 = p5.PrintEmployee3_surname();
		System.out.println(s3);
		Thread.sleep(1000);		
	}
	
	@Test
	public void verify4() throws InterruptedException
	{
		String n4 = p5.PrintEmployee4_name();
	System.out.println(n4);
	Thread.sleep(1000);
	String s4 = p5.PrintEmployee4_surname();
	System.out.println(s4);
	Thread.sleep(1000);	
	}
	
	
	@AfterMethod
	public void closeapp()
	{
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}
	
	
}

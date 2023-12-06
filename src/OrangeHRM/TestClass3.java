package OrangeHRM;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass3 extends BaseClass 
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
	 
	 p2.Click_PIM(driver);
}

@BeforeMethod () 
public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
{
	
	 p3.Click_AddEmployee();
}

@Test
public void Info1() throws EncryptedDocumentException, IOException, InterruptedException
{
	 p4.Input_FirstName(UtilityClass.getTestData(1, 0));
	 Thread.sleep(1000);
	 p4.Input_MiddleName(UtilityClass.getTestData(1, 1));
	 Thread.sleep(1000);
	 p4.Input_LastName(UtilityClass.getTestData(1, 2));
	 Thread.sleep(1000);
	 p4.Click_Save();
	 Thread.sleep(1000);
}

@Test
public void Info2() throws EncryptedDocumentException, IOException, InterruptedException
{
	 p4.Input_FirstName(UtilityClass.getTestData(2, 0));
	 Thread.sleep(1000);
	 p4.Input_MiddleName(UtilityClass.getTestData(2, 1));
	 Thread.sleep(1000);
	 p4.Input_LastName(UtilityClass.getTestData(2, 2));
	 Thread.sleep(1000);
	 p4.Click_Save();
	 Thread.sleep(1000);
}

@Test
public void Info3() throws EncryptedDocumentException, IOException, InterruptedException
{
	 p4.Input_FirstName(UtilityClass.getTestData(3, 0));
	 Thread.sleep(1000);
	 p4.Input_MiddleName(UtilityClass.getTestData(3, 1));
	 Thread.sleep(1000);
	 p4.Input_LastName(UtilityClass.getTestData(3, 2));
	 Thread.sleep(1000);
	 p4.Click_Save();
	 Thread.sleep(1000);
}

@Test
public void Info4() throws EncryptedDocumentException, IOException, InterruptedException
{
	 p4.Input_FirstName(UtilityClass.getTestData(4, 0));
	 Thread.sleep(1000);
	 p4.Input_MiddleName(UtilityClass.getTestData(4, 1));
	 Thread.sleep(1000);
	 p4.Input_LastName(UtilityClass.getTestData(4, 2));
	 Thread.sleep(1000);
	 p4.Click_Save();
 
	 Thread.sleep(2000);
	 
	 p5.Click_EmpList();
	 Thread.sleep(2000);
		p5.PrintEmployee1_name();
		Thread.sleep(1000);
		p5.PrintEmployee1_surname();
		Thread.sleep(1000);
		
		p5.PrintEmployee2_name();
		Thread.sleep(1000);
		p5.PrintEmployee2_surname();
		Thread.sleep(1000);
		
		p5.PrintEmployee3_name();
		Thread.sleep(1000);
		p5.PrintEmployee3_surname();
		Thread.sleep(1000);
		
		p5.Click_PageNo2();
		Thread.sleep(1000);
		
		p5.PrintEmployee4_name();
		Thread.sleep(1000);
		p5.PrintEmployee4_surname();
		Thread.sleep(1000);
	  
	
	 
}




@AfterMethod
public void s1 ()
{
	
}

@AfterClass
public void close()
{
	//driver.close();
}

}

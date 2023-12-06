package OrangeHRM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralTestClass 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[2]")).click();
		
	driver.findElement(By.xpath("(//a[@class='oxd-topbar-body-nav-tab-item'])[1]")).click();
	
	String s11 = driver.findElement(By.xpath("(((//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable'])[9])/div)[3]")).getText();
		//System.out.println(s11);
		
		String s12 = driver.findElement(By.xpath("(((//div[@class='oxd-table-row oxd-table-row--with-border oxd-table-row--clickable'])[9])/div)[4]")).getText();
		System.out.println(s11+" "+s12);
	//	
//		LoginPage1 p1=new LoginPage1(driver);
//		HomePage2 p2=new HomePage2(driver);
//		AddEmployee3 p3=new AddEmployee3(driver);
//		Enter_EmployeeInfo4 p4=new Enter_EmployeeInfo4(driver);
//		EmployeeList5 p5=new EmployeeList5(driver);
//		Thread.sleep(1000);
//		p2.Click_PIM(driver);
//		
//		Thread.sleep(1000);
//		p5.Click_EmpList();
//		Thread.sleep(1000);
//		String n1 = p5.PrintEmployee1_name();
//		System.out.println(n1);
//		Thread.sleep(1000);
//		String s1 = p5.PrintEmployee1_surname();
//		System.out.println(s1);
//		Thread.sleep(1000);
//		
//		
//		
//		
		
	}
	
	
}

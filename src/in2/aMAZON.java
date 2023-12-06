package in2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class aMAZON 
{
	
	public static void main(String[] args) {
	
		WebDriver driver=new EdgeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		String id = driver.findElement(By.xpath("//div[@id='nav-xshop']")).getText();
		System.out.println("1: "+id);

		String linkedtext=	driver.findElement(By.name("field-keywords")).getText();
		System.out.println("3: "+linkedtext);
		
		
		
		String classs = driver.findElement(By.className("nav-line-1 nav-progressive-content")).getText();
		System.out.println(classs);
		
		driver.findElement(By.id("nav-orders")).click();
		
		driver.close();
		
	}
	
	
	
	
}

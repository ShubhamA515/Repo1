package Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DummySite 

{
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class=\"input_error form_input\"])[1]")).sendKeys("standard_user");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class=\"input_error form_input\"])[2]")).sendKeys("secret_sauce");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='submit-button btn_action']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@class='btn btn_primary btn_small btn_inventory'])[1]")).click();
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[@class='btn btn_action btn_medium checkout_button']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]")).sendKeys("Shubham");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='input_error form_input'])[2]")).sendKeys("Agrawal");
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//input[@class='input_error form_input'])[3]")).sendKeys("441807");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	Thread.sleep(2000);
	driver.close();
	
	
	
	
			
			
					
					
							
							
}
}

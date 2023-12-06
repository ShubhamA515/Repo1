package Naukri;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class childclass 
{
public static void main(String[] args) 
{
WebDriver driver=new ChromeDriver();

driver =new ChromeDriver();

driver.get("https://www.naukri.com/");

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

driver.manage().window().maximize();

driver.findElement(By.xpath("//a[@class='nI-gNb-lg-rg__login']")).click();

driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("shubham.agr6672@gmail.com");

driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shubham@6672");

driver.findElement(By.xpath("//button[@type='submit']")).click();

driver.findElement(By.xpath("//a[@title='Naukri FastForward- Resume Services']")).click();

Set<String> allpages = driver.getWindowHandles();

ArrayList<String> al=new ArrayList<>(allpages);

driver.switchTo().window(al.get(0));









}
}

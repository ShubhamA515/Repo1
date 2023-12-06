package Listbox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CustomizedListbox 
{
public static void main(String[] args) throws InterruptedException 
{
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com");

driver.manage().window().maximize();

driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

////////////////////////////CUSTOMIZED LISTBOX---START/////////////////////////
//an Xpath which does not contains tagname 'select' is cutomized listbox

driver.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();

 WebElement birthyear = 
driver.findElement(By.xpath("//select[@name='birthday_year']"));

 Actions act=new Actions(driver);
 
 act.click(birthyear).perform();
 act.sendKeys(Keys.HOME).perform();
 
 for(int i=1;i<=29;i++)
 {
	 act.sendKeys(Keys.ARROW_DOWN).perform();
 }
 
 
 ////////////////////////////CUSTOMIZED LISTBOX---END/////////////////////////
 
 Thread.sleep(2000); 
 
 WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
 
 Select s=new Select(month);
 
 s.selectByVisibleText("Apr");
 
 Thread.sleep(2000);
 
 //////////////////////////////////////////////////////////
 WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
 
Select sd=new Select(day);
 
 sd.selectByVisibleText("15");
 
 driver.findElement(By.xpath("(//input[@class='_8esa'])[2]")).click();
 
 Thread.sleep(2000); 
 driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[1]")).sendKeys("Shubham");
 Thread.sleep(2000); 
 driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[2]")).sendKeys("Agrawal");
 Thread.sleep(2000); 
 driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[3]")).sendKeys("9404342487");
 Thread.sleep(2000); 
 
 driver.findElement(By.xpath("(//input[@class='inputtext _58mg _5dba _2ph-'])[5]")).sendKeys("Facebookkapassword");
}
}

package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dragAndDrop 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("driver.get(\"https://chercher.tech/practice/practice-pop-ups-selenium-webdriver\");");
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	
	
	
}
}

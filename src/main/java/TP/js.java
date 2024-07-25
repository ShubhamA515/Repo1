//package TP;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//public class js 
//{
//	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com");
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		
//		WebElement adf = driver.findElement(By.linkText("Meta © 2024"));
//	JavascriptExecutor js = (JavascriptExecutor)driver; 
//
//	js.executeScript("arguments[0].click();", adf);
//			
//			
//	}
//}

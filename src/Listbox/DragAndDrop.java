package Listbox;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop 
{
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	
	driver.get("");
	
WebElement source = driver.findElement(By.xpath(""));

WebElement destination = driver.findElement(By.xpath(""));

Actions act=new Actions(driver);

act.dragAndDrop(source, destination);

//OR

act.
moveToElement(source).
clickAndHold().
moveToElement(destination).
release().
build().
perform();
}
}

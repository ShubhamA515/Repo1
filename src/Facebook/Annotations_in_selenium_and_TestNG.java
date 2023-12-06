package Facebook;

import org.openqa.selenium.remote.Augmentable;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.testng.annotations.CustomAttribute;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.NoInjection;
import org.testng.annotations.ObjectFactory;

public class Annotations_in_selenium_and_TestNG 
{
@FindBy(xpath = "asf"); //selenium
@CacheLookup;			//selenium
@Augmentable;			//selenium
@Listeners;				//testng
@Ignore;				//testng
@CustomAttribute;		//testng
@DataProvider;			//testng
@Factory;				//testng
@FindAll				//selenium
@FindBys				//selenium
@NoInjection           	//testng
@ObjectFactory;         	//testng




delete



}

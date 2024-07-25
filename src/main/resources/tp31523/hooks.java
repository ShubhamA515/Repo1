package tp31523;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import driverconfig.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import tp31524_2.driverFactorytp;

public class hooks 
{
	WebDriver driver;

	@Before
public void launchBrowser() throws IOException
{
	 
	String path= System.getProperty("user.dir")+"src\\test\\resources\\config.properties";
	
	FileInputStream file=new FileInputStream(path);
	
	Properties p=new Properties();
	
	p.load(file);
	
	String browsername=p.getProperty("browser");
	
	driverFactorytp df=new driverFactorytp();
	
	 driver = df.initBrowser(browsername);
	
	driver.manage().window().maximize();
	
}


@After
public void tearDown()
{
	driver.quit();	
}
}

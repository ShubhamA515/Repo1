package execution;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import driverconfig.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHooks {

	
	DriverFactory df;
	WebDriver		driver;
	
	@Before
	public void launchBrowser() throws IOException {
		Properties prop = new Properties();

		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		System.out.println(path);

		FileInputStream fis = new FileInputStream(path);

		prop.load(fis);

		String browsername = prop.getProperty("browser");

		 df = new DriverFactory();

	driver = df.initBrowser(browsername);
		
		driver.manage().window().maximize();
	}
	
	
	@After(order = 2)
	public void quitBrowser()
	{
		driver.quit();
	}
	
	
	@After(order = 1)
	public void tearDown(Scenario  scenario)
	{
		boolean isFailed = scenario.isFailed();
		
		if(isFailed)
		{
			String scenarioName = scenario.getName();
			String name = scenarioName.replaceAll(" ", "_");
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			
			byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			//byte[] source = ts.getScreenshotAs(OutputType.BYTES);
			
			scenario.attach(source, "image/png", name);
			
			
		}
}
}

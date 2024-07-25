package execution;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\execution"},
		
		glue = {"execution"},
		
		plugin = {"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"html:target/cucumber-reports/reports.html",
		"json:target/cucumber-report.json"
		}
		
		
	 
		)

public class AmazonRunnerTest extends AbstractTestNGCucumberTests  {

}

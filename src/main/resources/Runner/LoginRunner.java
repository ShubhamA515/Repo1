package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features = {"src\\test\\resources\\appfeatures\\login.feature"},//path of the feature file to be executed
		
		glue = {"Steps"},// package name where we have the glue code available
		
		plugin= {"pretty"}
		)

public class LoginRunner extends AbstractTestNGCucumberTests 
{

}

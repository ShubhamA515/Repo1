package tp31523;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		
features = {"src\\test\\resources\\LogicOfCucumber"},

glue={"tp31524"},

plugin={"pretty"},

dryRun = true

)

public class runner  extends AbstractTestNGCucumberTests
{


}

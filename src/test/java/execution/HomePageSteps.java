package execution;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverconfig.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomePageSteps {
	HomePage homepage = new HomePage(DriverFactory.getDriver());
	//har @(given, when then ) me object banana na pade isliye class level pe homepage ka object banate hai 		


		@Given("user is at the landing page")
		public void user_is_at_the_landing_page() {
			WebDriver driver = DriverFactory.getDriver();
			driver.get("https://www.amazon.in/");
		}

		@Then("page title should contains {string}")
		public void page_title_should_contains(String word) {
		   
			String title = homepage.getTitleOfPage();
			
			boolean isWordPresent = title.contains(word);
			
			Assert.assertTrue(isWordPresent);
			
			//System.out.println("Passed 1");
			
			
		}

		@Then("cart icon should get display")
		public void cart_icon_should_get_display() throws InterruptedException {
		   
			boolean isDisplay = homepage.isCartIconDisplayed();
			
			Assert.assertTrue(isDisplay);
			//System.out.println("Passed 2");
		}

		@When("user clicks on fashion link")
		public void user_clicks_on_fashion_link() {
		    homepage.carouselNavigation();
		}

		@Then("user should redirect  to fashion page")
		public void user_should_redirect_to_fashion_page() {
		boolean  isDisplayed  = homepage.fitnessModule();
		
		Assert.assertTrue(isDisplayed);
		//System.out.println("Passed 3");
		}

		@When("user enters the username as {string}")
		public void user_enters_the_username_as(String uname) {
		   homepage.enterUsername(uname);
		}

		@When("user enters the password as {string}")
		public void user_enters_the_password_as(String pwd) {
		homepage.enterPassword(pwd);
		}

}

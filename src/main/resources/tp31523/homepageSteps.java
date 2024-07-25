package tp31523;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import tp31524_2.driverFactorytp;

public class homepageSteps 
{
	homepage hp=new homepage(driverFactorytp.getBrowser());
	@Given("User landed on login page")
	public void user_landed_on_login_page() 
	{
	  
	}

	@When("user entered username")
	public void user_entered_username() {
	  
	}

	@When("entered password")
	public void entered_password() {
	
	}

	@Then("user is logged in to the app")
	public void user_is_logged_in_to_the_app() {
	    
		
	}


}

package mct.steps.definations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LogingStepsDemo {
		
	
	@Given("user is already on login page")
	public void user_is_already_on_login_page() {
	   System.out.println("User Loged in to the page");
	}
	
	@When("title of loging page is demo script")
	public void title_of_loging_page_is_demo_script() {
	    System.out.println("Page Title is Wild cart Demo");
	}
	
	@Then("user click on login button")
	public void user_click_on_login_button() {
	    System.out.println("User Clicked on Login Button");
	}
	
	@Then("user enter username and password")
	public void user_enter_username_and_password() {
	    System.out.println("User Entered UserName and Password");
	}
	
	@Then("user on Home Page")
	public void user_on_home_page() {
	    System.out.println("User Landed on the Home Page");
	}
	
	@Then("close the Broeser")
	public void close_the_broeser() {
	    System.out.println("Browser Closed");
	}
	
		
		
		
	
	}

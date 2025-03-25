package org.StepDefinitions;

import org.Hooks.Hooks;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.LoginPage;
import Utilities.GenericUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {
	WebDriver driver = Hooks.driver;  //Chrome,Swag Lab
	LoginPage lp ;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/v1/" ,"URL is");
	}

	@When("user enters username as {string}") //Laxmi
	public void user_enters_username_as(String username) {
		lp = new LoginPage(driver);
		lp.enterUsername(username);
		
	}

	@When("user enters password as {string}")
	public void user_enters_password_as(String password) {
		lp.enterPassword(password);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	   lp.clickOnLoginButton();
	}

	@Then("user should be navigated to dashboard page")
	public void user_should_be_navigated_to_dashboard_page() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/v1/inventory.html" ,"URL is");
	}
	
	@Then("error message should be displayed")
	public void error_message_should_be_displayed() {
	    Assert.assertTrue(lp.loginErrorIsDisplayed());
	}

	@Then("user should not be navigated to dashboard page")
	public void user_should_not_be_navigated_to_dashboard_page() {
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.saucedemo.com/v1/" ,"URL is");
	}
	
}

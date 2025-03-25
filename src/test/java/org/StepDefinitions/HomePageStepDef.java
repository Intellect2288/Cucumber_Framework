package org.StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Utilities.GenericUtilities;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class HomePageStepDef {
	WebDriver driver;
	@Given("user hits the URL as {string}")
	public void user_hits_the_url_as(String url) {
		driver = GenericUtilities.launchBrowser("Chrome", url);
	}

	@Then("title of the login page is displayed as {string}")
	public void title_of_the_login_page_is_displayed_as(String expectedTitle) {
	    Assert.assertEquals(driver.getTitle(), expectedTitle);
	}




}

package org.StepDefinitions;

import org.Hooks.Hooks;
import org.testng.Assert;
import org.openqa.selenium.WebDriver;

import Pages.DashboardPage;
import io.cucumber.java.en.Then;

public class DashboardStepDef {
	WebDriver driver = Hooks.driver;
	DashboardPage dp;
	
	@Then("Title of the dashboard page is displayed as {string}")
	public void title_of_the_dashboard_page_is_displayed_as(String expectedTitle) {
		Assert.assertEquals(driver.getTitle(), expectedTitle," Title of the dashboard");
	}


	@Then("Add to Cart button is displayed")
	public void add_to_cart_button_is_displayed() {
		dp=new DashboardPage(driver);
		Assert.assertTrue(dp.addToCartButtonIsDisplayed(),"Add to Cart button ");
	}


	
}

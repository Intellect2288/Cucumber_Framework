package org.Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import Utilities.GenericUtilities;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class Hooks {	
	
	public static WebDriver driver;  //Chrome,Swag Lab
	Scenario scn;
	
	@Before(order=2)
	public void setupBrowser()
	{
		driver = GenericUtilities.launchBrowser("Chrome", "https://www.saucedemo.com/v1/");
	}
	
	@After(order=1)
	public void tearDown()
	{
		driver.quit();
	}
	
	
	@After(order=2)
	public void takeScreenShot(Scenario scn)
	{
		//ifScenario is Failed then Take the Screenshot  //Report main attach
		
		if(scn.isFailed())
		{
			String ss =((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64);
			String scnName = scn.getName();
			scnName=scnName.replaceAll(" ", "_");
			scn.attach(ss, "image/png", scnName);
		}
		
	}	
	
}

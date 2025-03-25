package org.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions
(
	features = {"@target/failedScenario.txt"},
	glue = {"org.StepDefinitions","org.Hooks"},
	//tags ="@Smoke or @Regression",
	plugin= {"pretty",
	"html:Reports/AllHTMLReports/MyHTMLReport.html",
	"json:Reports/ALLJSONReports/MyJSONReport.json",
	"junit:Reports/ALLJUNITReports/MyJUNITReport.junit",	
	
	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	
	}
	
	
)
public class FailedRunner {

}

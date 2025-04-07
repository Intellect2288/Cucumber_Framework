package org.TestRunner;

//import org.junit.runner.RunWith;
//import org.testng.annotations.DataProvider;

//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions
(
	features = {"src/test/resources/FeatureFile/Login.feature"},
	glue = {"org.StepDefinitions","org.Hooks"},
	tags ="@Smoke or @Regression",
	dryRun = false,
	monochrome =true,
	plugin= {"pretty",
	//html Report, json Report , junit report
	"html:Reports/AllHTMLReports/MyHTMLReport.html",
	"json:Reports/ALLJSONReports/MyJSONReport.json",
	"junit:Reports/ALLJUNITReports/MyJUNITReport.junit",
	
	"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
	
	//Falied Scenario >> Save it in some file
	//"rerun:target/failedScenario.txt"
	}
	
)
public class Test extends AbstractTestNGCucumberTests 
{
	
//	@Override
//	@DataProvider(parallel=true)
//	public Object[][] scenarios()
//	{
//		return super.scenarios();
//	}
}

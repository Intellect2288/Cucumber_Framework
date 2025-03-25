package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Find all the WebElements
	//Initalize all the WebElements  ----> By using Constructor
	//Create separate methods for each WebElement to perform required action
	
	WebDriver mainDriver; //null
	
	@FindBy(xpath = "//input[@id='user-name']" )   //cssSelector ===> css
	private WebElement usernameField;
	
	@FindBy(id="password")
	private WebElement passwordField;
	
	@FindBy(className="btn_action")
	private WebElement loginButton;
	
	@FindBy(xpath="//*[@data-test='error']")
	private WebElement loginError;
	
	
	//Initalize all the WebElements  ----> By using Constructor
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		mainDriver=driver;
	}
	
	
	//create public methods to interaction with each WebElement
	
	public void enterUsername(String username)
	{
		usernameField.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		passwordField.sendKeys(password);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	public boolean loginErrorIsDisplayed()
	{
		return loginError.isDisplayed();
	}
	
}

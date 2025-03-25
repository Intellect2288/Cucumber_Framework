package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
		WebDriver mainDriver;
	
		@FindBy(xpath="//button[text()='ADD TO CART']")
		private WebElement addToCartButton;
		
		public DashboardPage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
			mainDriver = driver;
		}
		
		public boolean addToCartButtonIsDisplayed()
		{
			return addToCartButton.isDisplayed();
		}
}

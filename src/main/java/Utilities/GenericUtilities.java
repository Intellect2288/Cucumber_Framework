package Utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GenericUtilities {
	 static WebDriver driver; //null
	
	public static  WebDriver launchBrowser(String browserName, String url) //Chrome
	{
		if(browserName.equals("Chrome"))
		{
			 driver = new ChromeDriver();
		}
		
		if(browserName.equals("Edge"))
		{
			 driver = new EdgeDriver();
		}
		
		if(browserName.equals("Firefox"))
		{
			 driver = new FirefoxDriver();
		}
		
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		return driver;   //Chrome
			
	}
	

}

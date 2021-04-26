package Browser_Luanch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Lanuch_Browser 
{
	private WebDriver driver;
	
	public void Browser(String browser_type , String URL)
	{
		
		if(browser_type.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
			
			WebDriver driver = new ChromeDriver();
		
			driver.get(URL);
			
		}
		
		else if(browser_type.equals("safari"))
		{
			//System.setProperty("webdriver.safari.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
			
			WebDriver driver = new SafariDriver();		
			driver.get(URL);
		}
		
		else if(browser_type.equals("firefox"))
		{
			System.setProperty("webdriver.geck.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
			
			WebDriver driver = new FirefoxDriver();
		
			driver.get(URL);
		}
		
		
		else 
		{
			System.out.println("Specified Browser Type not found");
			
		}
		
	}

	public WebDriver getDriver() {
		return driver;
	}

	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	

}

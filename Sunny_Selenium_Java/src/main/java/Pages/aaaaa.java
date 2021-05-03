package Pages;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver; 

public class aaaaa 
{ 
	public static void main(String[] args) 
	{ 
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");

		// Create a driver object for Firefox browser. 
		   WebDriver driver = new ChromeDriver(); 
		   
		   //Creating the JavascriptExecutor interface object by Typecasting
	        JavascriptExecutor js = (JavascriptExecutor)driver;
	        
	        //Launching the Site.
	        driver.get("https://in.news.yahoo.com/");
	     
	        //Maximize window
	        driver.manage().window().maximize();
	        
	        //Vertical scroll down by 500  pixels
	       // js.executeScript("window.scrollBy(1000,1000)");
	        
	        
	        ((JavascriptExecutor)driver).executeScript("window.location='https://www.softwaretestingexperts.com/'");
	        
	        
	        
	      ((JavascriptExecutor)driver).executeScript("returnwindow.innerHeight;").toString();
	       // System.out.println(Heights);

	        
	     ((JavascriptExecutor)driver).executeScript("returnwindow.innerWidth;").toString();
	        //System.out.println(Heights);


	        
	        
	        
	        
	        
	  } 
 }



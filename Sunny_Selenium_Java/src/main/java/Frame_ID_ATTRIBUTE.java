import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_ID_ATTRIBUTE 
{
	public static void main(String[] args) 
	{ 
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");

		// Create a driver object for Firefox browser. 
		   WebDriver driver = new ChromeDriver(); 
	

	// Maximize the web browser. 
	   driver.manage().window().maximize(); 
	// Store the URL in a variable of type String. 
	   String URL = "https://selenium08.blogspot.com/2019/11/selenium-iframe.html"; 
	// Call get() method and pass the URL as a parameter. 
	   driver.get(URL); 
	// Wait for some time to load web page completely. 
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

	// Locate iframe and switch driver context to first iframe by value of name attribute. 
	   System.out.println("Switching to first frame from main web page"); 
	 
	   
	   driver.switchTo().frame("iframe_a"); 
	   driver.findElement(By.xpath("//input[@itemprop = 'query-input']")).sendKeys("Selenium Jobs"); 
	   driver.findElement(By.xpath("//button[@class = 'wpb_button wpb_btn-inverse btn']")).click(); 

	// Switch to main web page from iframe by using defaultContent() method. 
	   System.out.println("Switching to main web page from first frame"); 
	   driver.switchTo().defaultContent(); 

	// Click on link text. 
	  WebElement ele =  driver.findElement(By.xpath("//a[text() = 'Freshers Now']"));
	  
	  String texts = ele.getText();
	   System.out.println(texts+ "   Clicked on link text successfully."); 
	   
	   ele.click();
	   driver.quit(); 
	  } 


}

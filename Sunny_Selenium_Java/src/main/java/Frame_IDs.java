import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_IDs {

	public static void main(String[] args) throws InterruptedException 
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
		
		   // Locate the total number of iframes on the web page. 
		   int iFrameSize = driver.findElements(By.tagName("iframe")).size(); 
		   System.out.println("Toal no of iframes: " +iFrameSize); 

	
		   // Locate the first iframe and switch driver to first iframe by index value 0. 
		   driver.switchTo().frame(0); 
		  driver.findElement(By.xpath("//input[@itemprop = 'query-input']")).sendKeys("Selenium Jobs"); 
		  driver.findElement(By.xpath("//button[@class = 'wpb_button wpb_btn-inverse btn']")).click(); 
		   Thread.sleep(3000);

		// Now, switch to main web page from iframe by using defaultContent() method. 
		   driver.switchTo().defaultContent(); 
		
		   // Closing first frame. 
		   String getTitleOfMain = driver.getTitle(); 
		   System.out.println("Title of main web page: " +getTitleOfMain); 
		   String mainPageURL = driver.getCurrentUrl(); 
		   System.out.println("URL of main web page: " +mainPageURL); 

		// Switch to second iframe by its index value 1. 
		   driver.switchTo().frame(1); 
		   driver.findElement(By.xpath("//*[@id=\"block\"]")).click();

		   
		   driver.findElement(By.xpath("//*[@id=\"qsb-keyword-sugg\"]")).sendKeys("Selenium , Manual Testing ");
		  
		   Thread.sleep(4000);
		   driver.quit(); 

	}

}

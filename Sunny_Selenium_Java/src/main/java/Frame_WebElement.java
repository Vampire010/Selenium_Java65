import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame_WebElement {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");

		// Create a driver object for Firefox browser. 
		   WebDriver driver = new ChromeDriver(); 
		   
		   driver.manage().window().maximize(); 
		  String URL = "https://selenium08.blogspot.com/2019/11/selenium-iframe.html"; 
		  driver.get(URL); 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		// Locate second frame (Naukri) by WebElement. 
		   WebElement frameElement = driver.findElement(By.name("iframe_b")); // Here, frame is located by using name attribute. 
		   System.out.println("Switching to second frame from main web page"); 
		   Thread.sleep(2000);

		   driver.findElement(By.xpath("//*[@id=\"block\"]")).click();

		   driver.findElement(By.xpath("//*[@id=\"qsb-keyword-sugg\"]")).sendKeys("Selenium , Manual Testing ");
		  
		   driver.switchTo().defaultContent(); 
		   driver.quit(); 

	}

}

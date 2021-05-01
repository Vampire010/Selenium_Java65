package Pages;

import java.util.concurrent.TimeUnit; 
import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver; 

public class aaaaa 
{ 
	public static void main(String[] args) 
	{ 
		WebDriver driver = new FirefoxDriver(); 
		   driver.manage().window().maximize(); 
		  String URL = "https://selenium08.blogspot.com/2019/11/selenium-iframe.html"; 
		  driver.get(URL); 
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS); 

		// Locate second frame (Naukri) by WebElement. 
		   WebElement frameElement = driver.findElement(By.name("iframe_b")); // Here, frame is located by using name attribute. 
		   System.out.println("Switching to second frame from main web page"); 
		   driver.switchTo().frame(frameElement); // Passing frameElement as an input parameter to frame(). 

		// After switching to the frame, locate element CREATE JOB ALERT By.xpath. 
		  WebElement jobAlert = driver.findElement(By.xpath("//a[text() = 'CREATE JOB ALERT' ]")); 
		  jobAlert.click(); 

		// Switch to main web page from iframe by using defaultContent() method. 
		   System.out.println("Switching to main web page from second frame"); 
		   driver.switchTo().defaultContent(); 
		   driver.quit(); 
	  } 
 }



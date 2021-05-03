package JavaScripExcuters;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JS_CLICK {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");

		// Create a driver object for Firefox browser. 
		   WebDriver driver = new ChromeDriver(); 
		   
		   driver.manage().window().maximize(); 
		   
	        driver.get("file:///Users/girishg/git/repository2/Sunny_Selenium_Java/src/main/java/html_pages/chkbox.html");

	        JavascriptExecutor js = (JavascriptExecutor)driver;

	        
	        
	        String titleText =  js.executeScript("return document.title;").toString();

	        
		   //Creating the JavascriptExecutor interface object by Typecasting
	        
	      //  js.executeScript("document.getElementById('customer.firstName').value='Girish';");
	        

	        js.executeScript("document.getElementById('vehicle1').checked=true;");

	        
	        Thread.sleep(5000);
	        js.executeScript("document.getElementById('vehicle3').checked=true;");

	        Thread.sleep(5000);

	        js.executeScript("document.getElementById('submit1').click();");


	        js.executeScript("alert('Welcome To SeleniumTesting');");

	        System.out.println(titleText);

	        
	}

}

package JavaScripExcuters;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Tilts_Js {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");

		// Create a driver object for Firefox browser. 
		   WebDriver driver = new ChromeDriver(); 
		   
		   driver.manage().window().maximize(); 
		   //Creating the JavascriptExecutor interface object by Typecasting
	        
	        //Launching the Site.
	        driver.get("http://www.facebook.com/");

	        JavascriptExecutor js = (JavascriptExecutor)driver;

	        
	        String titleText =  js.executeScript("return document.title;").toString();
	        System.out.println(titleText);

	      //  Thread.sleep(5000);
	        
	        
	        ((JavascriptExecutor)driver).executeScript("history.go(0)");
	        
	        
	        
	        String innerText = js.executeScript(" return document.documentElement.innerText;").toString();
	        System.out.println(innerText);
	        

	        String Domain_Is = ((JavascriptExecutor)driver).executeScript("return document.domain;").toString();
	        System.out.println(Domain_Is);
	        
	        
	        String URL_Is = ((JavascriptExecutor)driver).executeScript("return document.URL;").toString();
	        System.out.println(URL_Is);


driver.quit();	        

	}

}

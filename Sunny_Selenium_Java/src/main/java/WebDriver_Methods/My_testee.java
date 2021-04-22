package WebDriver_Methods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class My_testee {

	public static void main(String[] args) 
	{
System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.functionize.com/blog/a-glossary-of-testing-terms/");
		
		List<WebElement> ele =driver.findElements(By.tagName("h2"));
		
		
		for(WebElement em : ele) 
		{
			String texts = em.getText();
		
		    System.out.println(texts);
			
		}
		
	}

}

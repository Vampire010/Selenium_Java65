package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example_1 {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/eclipse-workspace/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://parabank.parasoft.com");
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
	}

}

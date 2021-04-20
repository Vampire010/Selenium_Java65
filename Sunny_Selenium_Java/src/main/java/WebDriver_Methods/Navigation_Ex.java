package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Ex {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
		driver.navigate().to("https://parabank.parasoft.com");
		
		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();
		
		
		Thread.sleep(10000);

		
		driver.navigate().back();
		
		Thread.sleep(10000);
		
		driver.navigate().forward();
		
		Thread.sleep(10000);

		
		driver.navigate().refresh();


	}

}

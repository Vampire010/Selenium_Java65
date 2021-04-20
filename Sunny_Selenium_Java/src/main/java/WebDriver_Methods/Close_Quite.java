package WebDriver_Methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Close_Quite {

	public static void main(String[] args) throws InterruptedException
	{
System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
		
		
		driver.get("https://www.snapdeal.com/");
		
		
		driver.manage().window().fullscreen();
		WebElement ele =driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[5]/a/div[2]/img"));
		ele.click();
		
		Thread.sleep(5000);

		
		driver.close();
		
		
		driver.manage().window().maximize();;

		Thread.sleep(5000);
		driver.quit();
		
		

	}

}

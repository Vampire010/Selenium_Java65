package Browser_Luanch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoublE_Click {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///Users/girishg/git/repository2/Sunny_Selenium_Java/src/main/java/html_pages/Dbouble_Clicks.html");
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
		
		
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		
		act.doubleClick(ele).perform();
		Thread.sleep(3000);

		driver.quit();

	}

}

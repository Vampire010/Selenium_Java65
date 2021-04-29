package Pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDown {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///Users/girishg/git/repository2/Sunny_Selenium_Java/src/main/java/html_pages/mul.html");

		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"cars\"]"));	

		
		Select cat = new Select(ele);
		
		cat.selectByIndex(0);
		
		Thread.sleep(2000);

		cat.selectByVisibleText("Saab");
		Thread.sleep(2000);

		cat.selectByValue("audi");
		
		Thread.sleep(2000);

		//cat.deselectAll();
		cat.deselectByIndex(0);
		Thread.sleep(2000);

		cat.deselectByVisibleText("Saab");
		Thread.sleep(2000);

		cat.deselectByValue("audi");
		
		

		
		Thread.sleep(5000);

		driver.quit();
		
	}

}

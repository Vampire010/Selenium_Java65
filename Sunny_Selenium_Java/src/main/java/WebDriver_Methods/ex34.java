package WebDriver_Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex34 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://parabank.parasoft.com");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		
		WebElement ele =driver.findElement(By.xpath("//*[@id=\"rightPanel\"]/ul[1]/li[2]/a"));
		
		String texts = ele.getText();
		
		System.out.print(texts);
		
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"));
		ele1.sendKeys("ClearMyText");
		ele1.clear();


	}

}

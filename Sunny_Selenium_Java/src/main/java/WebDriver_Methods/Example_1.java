package WebDriver_Methods;



import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Example_1 
{
	public static void main(String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://parabank.parasoft.com");

		driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/p[2]/a")).click();

		driver.findElement(By.id("customer.firstName")).sendKeys("Jack");
		driver.findElement(By.id("customer.lastName")).sendKeys("Daniel");
		
		driver.findElement(By.name("customer.address.street")).sendKeys("6th ton street");
		driver.findElement(By.name("customer.address.city")).sendKeys("Newyork");
		
		driver.findElement(By.cssSelector("#customer\\.address\\.state")).sendKeys("Alaska");
		driver.findElement(By.cssSelector("#customer\\.address\\.zipCode")).sendKeys("10036");

		driver.findElement(By.xpath("//*[@id=\"customer.phoneNumber\"]")).sendKeys("3211234560");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/form/table/tbody/tr[8]/td[2]/input")).sendKeys("2312456");

		driver.findElement(By.xpath("//*[@name=\"customer.username\"]")).sendKeys("jkdaniel");
		driver.findElement(By.xpath("//*[@name=\"customer.password\"]")).sendKeys("jkdaniel_1234");
		driver.findElement(By.xpath("//*[@name=\"repeatedPassword\"]")).sendKeys("jkdaniel_1234");
		driver.findElement(By.xpath("//*[@value=\"Register\"]")).submit();
		driver.manage().window().fullscreen();

		File screenshotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

		Files.copy(screenshotFile, new File("/Users/girishg/git/repository2/Sunny_Selenium_Java/screen_shots/abc.png"));

		driver.quit();
		
		

	}

}

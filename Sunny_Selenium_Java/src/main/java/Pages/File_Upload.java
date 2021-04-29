package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class File_Upload {
	public static void main(String[] args) throws InterruptedException 
	
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///Users/girishg/git/repository2/Sunny_Selenium_Java/src/main/java/html_pages/File_Upload.html");
		
		driver.findElement(By.xpath("//*[@id=\"fileToUpload\"]")).sendKeys("/Users/girishg/Desktop/main-qimg-386bf8dce0fde7d7dffc3a40ade6b1cc.png");

		
		Thread.sleep(4000);
		driver.quit();
	}

}

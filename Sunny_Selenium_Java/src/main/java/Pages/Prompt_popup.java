package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prompt_popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///Users/girishg/git/repository2/Sunny_Selenium_Java/src/main/java/html_pages/Prompt.html");
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(3000);
		alert.sendKeys("Girish");
		//Using accept() method to accep the alert box
		Thread.sleep(3000);

		alert.accept();
		Thread.sleep(3000);
		System.out.println(alert.getText());

		driver.quit();
	}

}

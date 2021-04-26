package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex4 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///Users/girishg/git/repository2/Sunny_Selenium_Java/src/main/java/html_pages/Enb_Disp.html");

		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"fname\"]"));	
		boolean ele_displayed = ele.isDisplayed();
		
		System.out.println(ele_displayed);
		
		boolean ele_enabled = ele.isEnabled();
		System.out.println(ele_enabled);

		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"lname\"]"));	
		boolean ele_disabled = ele2.isEnabled();
		
		System.out.println(ele_disabled);
		
		
		

		driver.quit();
	}

}

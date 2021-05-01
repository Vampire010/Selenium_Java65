package Browser_Luanch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
		Thread.sleep(3000);
 
		WebElement source=driver.findElement(By.xpath("//*[@id='credit2']/a"));
		
		WebElement target=driver.findElement(By.xpath("//*[@id='bank']/li"));
 
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source, target).perform();

		Thread.sleep(3000);

		driver.quit();

	}

}

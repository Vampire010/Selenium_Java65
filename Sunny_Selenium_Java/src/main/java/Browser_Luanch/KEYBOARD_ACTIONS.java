package Browser_Luanch;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KEYBOARD_ACTIONS {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch Website  
        driver.navigate().to("file:///Users/girishg/git/repository2/Sunny_Selenium_Java/src/main/java/html_pages/Login.html"); 
        driver.manage().window().maximize();

        WebElement ele = driver.findElement(By.xpath("/html/body/form/div[1]/input[1]"));
        ele.sendKeys("Girish_011");
       
        
        Actions act = new Actions(driver);
        ele.sendKeys(Keys.COMMAND, "a");
        
        Thread.sleep(2000);
        ele.sendKeys(Keys.COMMAND, "c");
        
        
                 
        WebElement ele2 = driver.findElement(By.xpath("/html/body/form/div[1]/input[2]"));
        ele2.click();
        ele2.sendKeys(Keys.COMMAND, "v");


	}

}

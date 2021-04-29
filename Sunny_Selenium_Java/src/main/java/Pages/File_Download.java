package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class File_Download {

	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.selenium.dev/downloads/");
		
		driver.findElement(By.xpath("/html/body/div[3]/table/tbody/tr[2]/td[6]/a[1]")).click();
		

		Robot robot = new Robot(); 
		
		robot.keyPress(KeyEvent.VK_TAB);
		
		        robot.keyRelease(KeyEvent.VK_TAB);
		
		        robot.keyPress(KeyEvent.VK_ENTER); 
		
	}

}

package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cobfirmation_Popup {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("file:///Users/girishg/git/repository2/Sunny_Selenium_Java/src/main/java/html_pages/Confirmation.html");
		
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		//Using accept() method to accept the alert box
		alert.accept();
		
		WebElement ele = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
		
		String test = ele.getText();
		System.out.println(test);

		
		Thread.sleep(3000);

		
		
		
		
		driver.findElement(By.xpath("/html/body/button")).click();
		
		
		Alert alert1 = driver.switchTo().alert();
		
		Thread.sleep(2000);
		
		//Using accept() method to accept the alert box
		alert1.dismiss();
		
		WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"demo\"]"));
		
		String test1 = ele1.getText();
		System.out.println(test1);

		
		
		Thread.sleep(3000);

		
		driver.quit();
		
		
		
		
	}

}

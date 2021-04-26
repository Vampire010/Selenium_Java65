package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Browser_Luanch.Lanuch_Browser;

public class example {

	public static void main(String[] args) throws InterruptedException 
	{
		
		
		
		
	
	//	Lanuch_Browser br = new Lanuch_Browser();
	//	br.Browser("chrome", "https://www.softwaretestingexperts.com");
		for(int i = 0 ; i<=1000 ; i++)
		{
				System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				driver.get("https://www.softwaretestingexperts.com");
		
				Thread.sleep(2000);

				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				Thread.sleep(2000);

				driver.findElement(By.xpath("//*[@id=\"app\"]/main/header/nav/ul/li[2]/div/a")).click();
				JavascriptExecutor js1 = (JavascriptExecutor) driver;
				js1.executeScript("window.scrollBy(0,500)");
				js1.executeScript("window.scrollBy(0,-500)");

				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"T3kFQQiYvdIqVueZxP72m\"]")).click();
				JavascriptExecutor js2 = (JavascriptExecutor) driver;
				js2.executeScript("window.scrollBy(0,500)");
				js2.executeScript("window.scrollBy(0,-500)");


				Thread.sleep(2000);
				
				driver.findElement(By.xpath("//*[@id=\"yi7HA3eaNYkmXXJWU3_xY\"]")).click();
				JavascriptExecutor js3 = (JavascriptExecutor) driver;
				js3.executeScript("window.scrollBy(0,500)");
				js3.executeScript("window.scrollBy(0,-500)");				
				

				Thread.sleep(2000);

				driver.findElement(By.xpath("//*[@id=\"app\"]/main/header/nav/ul/li[1]/div/a")).click();
				JavascriptExecutor js4 = (JavascriptExecutor) driver;
				js4.executeScript("window.scrollBy(0,500)");
				js4.executeScript("window.scrollBy(0,-500)");				

				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//*[@id=\"qhojFiNR3XgU4ga-YlTzH\"]")).click();
				JavascriptExecutor js5 = (JavascriptExecutor) driver;
				js5.executeScript("window.scrollBy(0,500)");
				js5.executeScript("window.scrollBy(0,-500)");
				
				System.out.println(i);

				Thread.sleep(5000);
				driver.quit();
		}
		
	}

}

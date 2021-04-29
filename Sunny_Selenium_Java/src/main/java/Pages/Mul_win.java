package Pages;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mul_win {

	public static void main(String[] args) throws InterruptedException 
	{

		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.snapdeal.com");

		
		// get the Session id of the Parent
		String parentGUID = driver.getWindowHandle();
		
		System.out.println("Total Windows : "+parentGUID);

		
		
		// click the button to open new window
		driver.findElement(By.xpath("//*[@id=\"content_wrapper\"]/section/div[4]/section/div[2]/div[1]/div/div[5]/a/div[3]/div[1]")).click();
		Thread.sleep(5000);
		
		
		
		// get the All the session id of the browsers
		Set<String> allGUID = driver.getWindowHandles();
		System.out.println("Total Windows : "+allGUID);

		
		
		// print number of windows
		System.out.println("Total Windows : "+allGUID.size());
		
		//iterate through windows
		for(String guid : allGUID)
		{
			driver.switchTo().window(guid);
			Thread.sleep(3000);

			// check the title of the page to match with "bhawna"
			if(driver.getTitle().toLowerCase().contains("bhawna"))
			{
				driver.findElement(By.id("pincode-check")).sendKeys("543210");
				Thread.sleep(3000);
				
				driver.switchTo().window(parentGUID);
				System.out.println("Parent Window");	
			}
			
			else	
			{			
				System.out.println("Window Doesnt Match ");		
			}
		}
		// close all the windows 
	//	driver.quit();
	}

}

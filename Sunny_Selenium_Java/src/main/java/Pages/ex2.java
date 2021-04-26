package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		

				System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				driver.get("https://parabank.parasoft.com");
		
				Thread.sleep(2000);
				
				WebElement ele = driver.findElement(By.xpath("//*[@id=\"loginPanel\"]/form/div[1]/input"));	
				String attr_text = ele.getAttribute("class");
				System.out.println(attr_text);
				
				
				WebElement ele1 = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/h2"));	
				String css_text = ele1.getCssValue("color");
				System.out.println(css_text);
				
				WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/h2"));	
				Point location_ele2 = ele2.getLocation();
				System.out.println(location_ele2);
				
				WebElement ele3 = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/h2"));	
				Dimension siz_ele3 = ele3.getSize();
				System.out.println(siz_ele3);
				
				
				WebElement ele4 = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/h2"));	
				String tag_name = ele4.getTagName();
				System.out.println(tag_name);
			
				driver.quit();

	}

}

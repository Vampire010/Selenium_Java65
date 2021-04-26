package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex455 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://mykidsbank.org/");

		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table[1]/tbody/tr/td[2]/form/table[1]/tbody/tr[6]/td[2]/input"));	
		boolean ele_isSelected = ele.isSelected();
		System.out.println("Before CheckBox Selected   " + ele_isSelected);
		
		Thread.sleep(3000);

			ele.click();
			
			Thread.sleep(3000);

		boolean ele_isSelected1 =ele.isSelected();
		
		System.out.println("After Checkbox Selected  " + ele_isSelected1);
		
		
		

		driver.quit();
	}

}

package Pages;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_Suggestions_Select {

	public static void main(String[] args) throws InterruptedException 
	{
		
System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.makemytrip.com");
		
        Thread.sleep(3000);		

        
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/label")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[1]/div[2]/div[1]/div[1]/div[1]/div/div/div/input")).sendKeys("Mum");
        driver.manage().timeouts().implicitlyWait(30000, TimeUnit.MILLISECONDS);

        // get all the auto populated results - using xpath
        List<WebElement> elements = driver.findElements(By.xpath("//*[@id=\"react-autowhatever-1\"]"));

        System.out.println(elements.size());

        // Traverse each auto-suggest result and click on the result "time in india", if
        // this suggestion is displayed.
        for (WebElement element : elements)
        {
            if (element.getText().equals("Mumbai, India")) 
            {
                System.out.println(element.getText());

                element.click();
                break;
            }

        }
        
    //  driver.quit();
	}

}

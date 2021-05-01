package Pages
;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent_reprts {

	public static void main(String[] args)
	{
		ExtentTest test;
		ExtentReports report;
		
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/ex_Reporter.html");
		
        // Create object of ExtentReports class- This is main class which will create report
    ExtentReports extent = new ExtentReports();
    
        // attach the reporter which we created in Step 1
    extent.attachReporter(reporter);
    
        // call createTest method and pass the name of TestCase- Based on your requirement
    ExtentTest logger=extent.createTest("LoginTest");
    logger.log(Status.INFO, "Login to amazon");
	   
    logger.log(Status.PASS, "Title verified");
   
        // Flush method will write the test in report- This is mandatory step  
    extent.flush();
		
		System.setProperty("webdriver.chrome.driver", "/Users/girishg/git/repository2/Sunny_Selenium_Java/Browser_Drivers/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// Launch Website  
        driver.navigate().to("file:///Users/girishg/git/repository2/Sunny_Selenium_Java/src/main/java/html_pages/Login.html"); 
        driver.manage().window().maximize();
        extent.flush();

        driver.quit();
	}

}

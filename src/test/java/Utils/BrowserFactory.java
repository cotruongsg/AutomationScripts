package Utils;


import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//Class Name
public class BrowserFactory 
{
        private static WebDriver driver = null;
        
        //@BeforeMethod
        public static WebDriver getBrowser(String browserType) throws IOException        
        {        	
	        if(driver == null)         
		    {	         
		        if(browserType.toLowerCase().equals("firefox"))	         
			        {
			        	//Using the Gecko Driver
			    		System.setProperty("webdriver.gecko.driver", "B:\\SeleniumSource\\browserdriver\\geckodriver.exe");
			    		FirefoxOptions options = new FirefoxOptions();
			    		options.addArguments("start-maximized"); 	
			    		driver = new FirefoxDriver(options);
			         
			        }	         
		        else if(browserType.equals("chrome"))	         
			        {    
		        		String exePath = "B:\\SeleniumSource\\browserdriver\\chromedriver.exe";
				   		System.setProperty("webdriver.chrome.driver", exePath);
				   		ChromeOptions options = new ChromeOptions();
				   		options.setExperimentalOption("useAutomationExtension", false);
				   		options.addArguments("start-maximized"); 	
			   		    driver = new ChromeDriver(options);		         
			        }	         
		        else if(browserType.equals("ie"))	         
			        {		         
			        	driver = new InternetExplorerDriver();		         
			        }
		         
		     }
		     return driver;	         
	     }
        
       // @AfterMethod
        public void closeApp()
        {
        	driver.quit();
        }
        
}
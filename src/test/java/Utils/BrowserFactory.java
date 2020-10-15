package Utils;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//Class Name
public class BrowserFactory 
{
        private static WebDriver driver = null;
        
        //@BeforeMethod
        @SuppressWarnings({ "unchecked", "deprecation" })
		public static WebDriver getBrowser(String browserType) throws IOException        
        {        	
	        if(driver == null)         
		    {	         
		        if(browserType.toLowerCase().equals("firefox"))	         
			        {
			        	//Using the Gecko Driver		
			        	/*FirefoxProfile profile = new FirefoxProfile();
			        	profile.setPreference("permissions.default.desktop-notification", 1); 
			        	DesiredCapabilities capabilities=DesiredCapabilities.firefox();
			        	capabilities.setCapability(FirefoxDriver.PROFILE, profile); */
			        	
			        	FirefoxProfile geoDisabled = new FirefoxProfile();
			        	geoDisabled.setPreference("geo.enabled", false);
			        	geoDisabled.setPreference("geo.provider.use_corelocation", false);
			        	geoDisabled.setPreference("geo.prompt.testing", false);
			        	geoDisabled.setPreference("geo.prompt.testing.allow", false);
			        	DesiredCapabilities capabilities = DesiredCapabilities.firefox();
			        	capabilities.setCapability(FirefoxDriver.PROFILE, geoDisabled);
		        	
			    		/*FirefoxOptions options = new FirefoxOptions();			    		
			    		options.addArguments("start-maximized"); 
			    		options.addArguments("--disable-notifications");*/
			    		System.setProperty("webdriver.gecko.driver", "B:\\SeleniumSource\\browserdriver\\geckodriver.exe");
			    		driver = new FirefoxDriver(capabilities);
			         
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
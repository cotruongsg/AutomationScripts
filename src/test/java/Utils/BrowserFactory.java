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
import io.github.bonigarcia.wdm.WebDriverManager;

//Class Name
public class BrowserFactory 
{
		private static final String DRIVER_DIR = "src/test/resources/";
	
	    @SuppressWarnings("static-access")
		public static WebDriver getWebDriver(String browserName) {
	    	String bn = browserName.valueOf(browserName).toLowerCase();
	        switch (bn)
	        {
	            case "chrome":
	                return getChromeDriver();
	            case "firefox":
	                return getFirefoxDriver();
	            case "internet explorer":
	                return getInternetExplorerDriver();
	            default:
	                throw new IllegalArgumentException("Match case not found for browser: " 
	                        + browserName);
	        }
	    }
	
	    private static WebDriver getChromeDriver() {	       
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--start-maximized");
	        WebDriverManager.chromedriver().setup();
	        return new ChromeDriver(options);
	    }
	
	    private static WebDriver getFirefoxDriver() {
	        //System.setProperty("webdriver.gecko.driver", DRIVER_DIR + "geckodriver.exe");
	        FirefoxOptions options = new FirefoxOptions();
	        options.addArguments("--start-maximized");
	        WebDriverManager.firefoxdriver().setup();
	        return new FirefoxDriver(options);
	    }
	
	    private static WebDriver getInternetExplorerDriver() {
	        System.setProperty("webdriver.ie.driver", DRIVER_DIR + "IEDriverServer.exe");
	        return new InternetExplorerDriver();
	    }
        
//       // @AfterMethod
//        public void closeApp()
//        {
//        	driver.quit();
//        }
        
}
package RegresstionTestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import Utils.BrowserFactory;
import Utils.CommonActions;
import org.testng.Assert;
 
public class Groups 
{ 
	WebDriver driver;
	String baseURL = "https://demoqa.com/";
	CommonActions actions = new CommonActions();	  
    String title = "ToolsQA";    
   
    @Parameters({"browser"})       
    @Test(groups = { "demo1" }) 
    public void checkTitle(String browser)  
    {    	
    	WebDriver driver = BrowserFactory.getWebDriver(browser);	
    	driver.get(baseURL);
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        String testTitle = "ToolsQA";
        String originalTitle = driver.getTitle();
        Assert.assertEquals(originalTitle, testTitle);
        driver.close();
    } 
    
    @Parameters({"browser"})       
    @Test(groups = { "demo2" }) 
    public void click_element(String browser) 
    {   
    	WebDriver driver = BrowserFactory.getWebDriver(browser);	
    	driver.get(baseURL);    	
    	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).click();
        System.out.println("Home Page heading is displayed"); 
        driver.close();
    }
}
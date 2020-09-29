package Utils;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.*;

public class CommonActions 
{
	private static WebDriver driver = null;	
	
	public void WaitForElementExists(WebDriver driver , int timeout , String elementpath)
	{
		WebDriverWait wait = new WebDriverWait(driver ,20);
		WebElement web;
		web = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementpath)));
	}
	

	public void ImplicitWait(WebDriver driver , int timeout)
	{
		driver.manage().timeouts().implicitlyWait(timeout, TimeUnit.SECONDS);
	}
	
	// Waiting 30 seconds for an element to be present on the page, checking
	// for its presence once every 5 seconds.
	// When you try to test the presence of an element that may appear after every x seconds/minutes.
	public void FluentWait(WebDriver driver , int timeout , int pollingtimeout , final String elementpath)
	{		
		@SuppressWarnings("deprecation")
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
		    .withTimeout(30, TimeUnit.SECONDS)
		    .pollingEvery(5, TimeUnit.SECONDS)
		    .ignoring(NoSuchElementException.class);
	
		WebElement foo = wait.until(new Function<WebDriver, WebElement>() 
		{
		    public WebElement apply(WebDriver driver) {
		    return driver.findElement(By.xpath(elementpath));
		}
		});
	}
	
	public boolean isAlertPresent(WebDriver driver) 
	{ 
	    try 
	    { 
	        driver.switchTo().alert(); 
	        return true; 
	    }  
	    catch (NoAlertPresentException Ex) 
	    { 
	        return false; 
	    }   
	}  

	
	
}	




package RegresstionTestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import Utils.BrowserFactory_old;
import Utils.CommonActions;


public class TestUploadFile
{
	  CommonActions cact = new CommonActions();
	  @Test
	  public void TestUpload() throws IOException
	  {
		  WebDriver driver = BrowserFactory_old.getBrowser("firefox");
		  driver.get("https://fineuploader.com/demos.html");
		  driver.manage().window().maximize();
		  cact.ImplicitWait(driver, 10);
		  WebElement select_btn = driver.findElement(By.xpath("//div[starts-with(@class,'qq-upload-button-selector qq-upload-button')]/div[contains(text(),'Select files')]"));
		  JavascriptExecutor jse = (JavascriptExecutor)driver;		  
		  jse.executeScript("window.scrollBy(0,350)");
		  //Actions act = new Actions(driver);
		  //act.moveToElement(select_btn).click().perform();		 
		  driver.switchTo().activeElement().sendKeys("D:\\TestUpload.txt");
		 
		  
		  
	  }
}


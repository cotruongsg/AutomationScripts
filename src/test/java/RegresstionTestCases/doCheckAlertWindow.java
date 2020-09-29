package RegresstionTestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utils.BrowserFactory;
import Utils.CommonActions;

public class doCheckAlertWindow extends BrowserFactory
{	  
	
	  CommonActions act = new CommonActions();
	 
	  @Test
	  public void GetAlertText() throws IOException 
	  {
		  WebDriver driver = BrowserFactory.getBrowser("firefox");
		  driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		  act.WaitForElementExists(driver, 5 , "//input[@value='Sign in']");
		  driver.findElement(By.xpath("//input[@value='Sign in']")).click();
		  Boolean alert = act.isAlertPresent(driver);
		  Assert.assertTrue(alert, "The Alert popup is not displayed");
		  String alertmsg = driver.switchTo().alert().getText();
		  Assert.assertEquals(alertmsg, "Please enter a valid user name" , "The alert msg is wrong");
		  driver.switchTo().alert().accept();
		  driver.quit();
		  
	  }
}

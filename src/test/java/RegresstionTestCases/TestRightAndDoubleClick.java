package RegresstionTestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utils.BrowserFactory;
import Utils.CommonActions;



public class TestRightAndDoubleClick 
{
	  CommonActions cact = new CommonActions();
	  @Test
	  public void testRightandDbClick()  throws IOException
	  {	
		  WebDriver driver = BrowserFactory.getWebDriver("firefox");
		  driver.get("https://demoqa.com/buttons");
		  driver.manage().window().maximize();
		  cact.ImplicitWait(driver, 5);
		  
		  //Dbl Click
		  Actions act = new Actions(driver);
		  WebElement dbl_element = driver.findElement(By.xpath("//*[@id='doubleClickBtn']"));
		  act.doubleClick(dbl_element).build().perform();
		  boolean dbl_msg = driver.findElement(By.xpath("//p[(@id='doubleClickMessage')  and contains(text(),'You have done a double click')]")).isDisplayed();		
		  Assert.assertEquals(dbl_msg, true, "You have done a double click msg is not displayed");
		  
		  //Right Click	
		  WebElement rght_element = driver.findElement(By.xpath("//*[@id='rightClickBtn']"));
		  act.contextClick(rght_element).build().perform();
		  boolean rght_msg = driver.findElement(By.xpath("//p[(@id='rightClickMessage')  and contains(text(),'You have done a right click')]")).isDisplayed();		
		  Assert.assertEquals(rght_msg, true, "You have done a right click msg is not displayed");
		  
		  //Close
		  driver.quit();
		  
	  }
}

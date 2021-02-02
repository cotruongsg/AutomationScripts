package RegresstionTestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.GoogleSearchPage;
import org.testng.annotations.*;
import Utils.BrowserFactory;
import Utils.CommonActions;

public class ParallelTest 
{
	  String baseURL = "http://www.google.com/";
	  CommonActions actions = new CommonActions();	 
	  
	  @Parameters({"browser"})
	  @Test
	  public void GoogleSearch(String browser)
	  {
		  WebDriver driver = BrowserFactory.getWebDriver(browser);
		  driver.get(baseURL);
		  actions.ImplicitWait(driver, 3);
		  
		  //Enter Text
		  GoogleSearchPage.textbox_search(driver).sendKeys("Selenium",Keys.ENTER);
		  actions.ImplicitWait(driver, 3);
		  
		  //Assert		
		  Boolean sel_icon = GoogleSearchPage.selenium_icon(driver).isDisplayed();
		  SoftAssert sa = new SoftAssert();
		  sa.assertEquals(sel_icon, "true", "Selenium content is not displayed");
		  
		  //Close
		  driver.close();		  
	  }
  
}

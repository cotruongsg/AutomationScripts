package RegresstionTestCases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.GoogleSearchPage;
import Utils.BrowserFactory;
import Utils.CommonActions;

public class TestGoogleSearch 
{
	  CommonActions actions = new CommonActions();
	
	  @Test
	  public void GoogleSearch()
	  {
		  WebDriver driver = BrowserFactory.getWebDriver("firefox");
		  driver.get("https://www.google.com");
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

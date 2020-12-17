package RegresstionTestCases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.GoogleSearchPageObjects;
import Utils.BrowserFactory;
import Utils.CommonActions;

public class TestGoogleSearchObjects
{
	  CommonActions actions = new CommonActions();
	
	  @Test
	  public void GoogleSearch()
	  {
		  WebDriver driver = BrowserFactory.getWebDriver("firefox");
		  driver.get("https://www.google.com");
		  actions.ImplicitWait(driver, 3);
		  
		  //Enter Text		 
		  GoogleSearchPageObjects obj = new GoogleSearchPageObjects(driver);
		  obj.setTexttoSearch("Selenium");
		  obj.clickSearchBtn();
		  actions.ImplicitWait(driver, 3);
		  
		  //Assert		
		  Boolean sel_icon = obj.isSeleniumDisplayed();
		  SoftAssert sa = new SoftAssert();
		  sa.assertEquals(sel_icon, "true", "Selenium content is not displayed");
		  
		  //Close
		  driver.close();
		  
	  }
	  
}

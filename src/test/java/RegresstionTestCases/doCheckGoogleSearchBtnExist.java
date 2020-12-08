package RegresstionTestCases;

import org.testng.annotations.Test;
import Utils.BrowserFactory;
import java.util.concurrent.TimeUnit;//--
import org.openqa.selenium.By;//--
import org.openqa.selenium.WebDriver;//--
import org.testng.Assert;
import Utils.BrowserFactory;

@SuppressWarnings("unused")
public class doCheckGoogleSearchBtnExist
{

  @Test
  public void verifySearchButton() 
  {
	  WebDriver driver = BrowserFactory.getWebDriver("firefox");     
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.get("http://www.google.com");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);         
      boolean exists = driver.findElement(By.id("hplogo")).isDisplayed();
      Assert.assertEquals(exists, true, "Google Search Button is not exist");
      driver.quit();
      
  }
}

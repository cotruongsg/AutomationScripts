package RegresstionTestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

import java.util.concurrent.TimeUnit;
//--
import org.openqa.selenium.By;
//--
import org.openqa.selenium.WebDriver;
//--
import org.openqa.selenium.WebElement;
//--
import org.openqa.selenium.firefox.FirefoxDriver;
//--
import org.testng.Assert;
//--
import org.testng.annotations.AfterClass;
//--
import org.testng.annotations.BeforeClass;
//--
import org.testng.annotations.Test;

public class doCheckGoogleSearchBtnExist
{

  private WebDriver driver;

  @BeforeClass
  public void beforeClass() 
  {
	  System.setProperty("webdriver.gecko.driver", "B:\\SeleniumSource\\geckodriver\\geckodriver.exe");
      driver = new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() 
  {
      driver.quit();
  }

  @Test
  public void verifySearchButton() 
  {
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      driver.get("http://www.google.com");
      driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
      String search_text = "Google Search";
      WebElement search_button = driver.findElement(By.name("btnK"));
      String text = search_button.getAttribute("value");
      AssertJUnit.assertEquals(text, search_text, "Text not found!");
  }
}

package RegresstionTestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Utils.BrowserFactory;
import Utils.CommonActions;

public class TestFaceBookImage 
{
	  CommonActions cact = new CommonActions();
	  @Test
	  public void testImageOperation()  throws IOException
	  {
		  WebDriver driver = BrowserFactory.getWebDriver("firefox");	
		  driver.get("https://www.facebook.com");
		  driver.manage().window().maximize();
		  cact.ImplicitWait(driver, 5);
		  driver.findElement(By.linkText("Forgot Password?")).click();
		  cact.ImplicitWait(driver, 3);
		  driver.findElement(By.xpath("//i[starts-with(@class,'fb_logo img')]")).click();
		  cact.ImplicitWait(driver, 2);
		  boolean Login_btn = driver.findElement(By.name("login")).isDisplayed();	
		  Assert.assertEquals(Login_btn, true, "Image Operation works uncorrectly");
		  driver.quit();
	  }
}

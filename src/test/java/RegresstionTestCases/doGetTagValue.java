package RegresstionTestCases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class doGetTagValue
{

	 private WebDriver driver;

	  @BeforeClass
	  public void beforeClass() 
	  {
		  System.setProperty("webdriver.gecko.driver", "B:\\SeleniumSource\\geckodriver\\geckodriver.exe");
	      driver = new FirefoxDriver();
	      driver.manage().window().maximize();
	  }

	  @AfterClass
	  public void afterClass() 
	  {
	      driver.quit();
	  }
	  
	  @Test
	  public void getTagValue()
	  {
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.get("https://www.rediff.com/");
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  List <WebElement> list = driver.findElements(By.tagName("a"));
		  for(int i = 0 ; i < list.size() ; i++)
		  {
			  System.out.println(list.get(i).getText());
		  }
		  
	  }

}

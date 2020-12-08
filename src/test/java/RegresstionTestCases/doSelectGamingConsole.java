package RegresstionTestCases;

import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Utils.BrowserFactory;
import Utils.CommonActions;

public class doSelectGamingConsole 
{
	  CommonActions act = new CommonActions();
	  @Test
	  public void doBestBuyGaming() throws IOException 
	  {
		  WebDriver driver = BrowserFactory.getWebDriver("firefox");
		  driver.get("https://www.bestbuy.com/site/searchpage.jsp?st=laptop+and+computer&_dyncharset=UTF-8&_dynSessConf=&id=pcat17071&type=page&sc=Global&cp=1&nrp=&sp=&qp=&list=n&af=true&iht=y&usc=All+Categories&ks=960&keys=keys");
		  driver.manage().window().maximize();
		  act.WaitForElementExists(driver, 8 , "//img[@class='logo']");				  
		  if (driver.findElement(By.xpath("//fieldset[@name='Brand']")).isDisplayed())
		  {
			  String li_xpath = "//fieldset[@name='Brand']/ul[@class='facet-option-list']/li";
			  List<WebElement> litag = driver.findElements(By.xpath(li_xpath));
			  int litag_size = litag.size();
			  System.out.println("Li tag size is " + litag_size);			  
			  for(int i = 0 ; i <= litag_size-2 ; i++)
			  {
				  String chkbox_xpath = "//fieldset[@name='Brand']/ul[@class='facet-option-list']/li//input[contains(@id, '-" + i + "'" + ")" + "]";
				  driver.findElement(By.xpath(chkbox_xpath)).click();
			  }
		  }
		  driver.quit();
	  }
}

package RegresstionTestCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Utils.BrowserFactory_old;
import Utils.CommonActions;

public class doXpath extends BrowserFactory_old
{
	  CommonActions act = new CommonActions();
	  @Test
	  public void doCheckXpath() throws IOException 
	  {
		  WebDriver driver = BrowserFactory_old.getBrowser("firefox");
		  driver.get("https://selenium.dev");
		  //starts-with 
		  //a[starts-with(@class,"nav-item") and contains(@href,"support")]
		  //a[starts-with(@class,"nav-item")]
		  
		  //find text
		  //a[contains(text(),"License")]
		  
		  //Find id name or function name with div tag attribute
		  //div[contains(@onclick,"toggleAboutNav()")]
		  //div[contains(@class,"nav-item")]
		  
		  
	  }
}
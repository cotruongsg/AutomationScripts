package RegresstionTestCases;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import Utils.BrowserFactory;
import Utils.CommonActions;

public class TestHandleIFrame 
{
	  CommonActions cact = new CommonActions();
	
	  @Test
	  public void TestDragAndDrop() throws IOException
	  {
		  WebDriver driver = BrowserFactory.getWebDriver("firefox");	
		  driver.get("https://jqueryui.com/droppable/");
		  driver.manage().window().maximize();
		  cact.ImplicitWait(driver, 5);
		  driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		  WebElement source = driver.findElement(By.id("draggable"));
		  WebElement target = driver.findElement(By.id("droppable"));		  
		  Actions act = new Actions(driver);
		  act.dragAndDrop(source, target).build().perform();		  
		  System.out.println("Drag and Drop item is working fine");
		  System.out.println("Only " + (driver.findElements(By.tagName("iframe")).size()) + " is displayed.");
		  driver.quit();
	  }
}
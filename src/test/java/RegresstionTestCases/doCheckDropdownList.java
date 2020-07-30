package RegresstionTestCases;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class doCheckDropdownList 
{
	@Test
	public void TestCase1() throws InterruptedException
	{
	
		//Using the Gecko Driver
		System.setProperty("webdriver.gecko.driver", "B:\\SeleniumSource\\geckodriver\\geckodriver.exe");
		
		//Defining driver
		WebDriver driver;		
		driver = new FirefoxDriver();
		
		//Launching the dropdown Page
		driver.get("https://techcanvass.com/examples/register.html");
		Thread.sleep(5000);
		
		//Maximize the newly loaded window
		driver.manage().window().maximize();
		
		//Creating instance of Drop down list box
		Select drpdwn = new Select(driver.findElement(By.name("model")));
		
		//List Element to capture all the elements from the dropdown list
		List<WebElement> allOptions= drpdwn.getOptions();		
		int optsize = allOptions.size();
		
		if (optsize == 4)
		{		
			
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
		
		
		drpdwn.selectByIndex(3);
		Thread.sleep(5000);
		
		//close Firefox		
		driver.quit();
	}
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;


public class GoogleSearchPageObjects 
{
	WebDriver driver = null;
	By txt_search = By.name("q");
	By btn_search = By.name("btnK");
	By selenium_icon = By.xpath("//div[@class='fWhgmd']");
	
	public GoogleSearchPageObjects(WebDriver driver)
	{
		this.driver = driver ;
	}
	
	public void setTexttoSearch(String text)
	{
		driver.findElement(txt_search).sendKeys(text);
	}
	
	public void clickSearchBtn()
	{
		driver.findElement(txt_search).sendKeys(Keys.RETURN);
	}
	
	public Boolean isSeleniumDisplayed()
	{
		return driver.findElement(selenium_icon).isDisplayed();
		
	}
	
}

package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GoogleSearchPage
{
	  private static WebElement element = null;
	  
	  public static WebElement textbox_search(WebDriver driver)
	  {
		  element = driver.findElement(By.name("q"));
		  return element ;		  		
	  }
	  
	  public static WebElement button_search(WebDriver driver)
	  {
		  element = driver.findElement(By.name("btnK"));
		  return element;
	  }
	  
	  public static WebElement selenium_icon(WebDriver driver)
	  {
		  element = driver.findElement(By.xpath("//div[@class='fWhgmd']"));
		  return element;
	  } 
	 
}

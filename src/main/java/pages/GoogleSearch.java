package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GoogleSearch {

	WebDriver driver;
	
	public GoogleSearch(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By search = By.xpath("//input[@name='q']");
	
	public void googleSearch(String text) throws InterruptedException
	{
		driver.findElement(search).click();
		driver.findElement(search).sendKeys(text);
	}
	
}

package script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GooglePage {
WebDriver driver;

@BeforeTest
public void LaunchBrowser()
{
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	}

	@Test
	public void GoogleSearch() throws InterruptedException 
	{
		pages.GoogleSearch gs= new pages.GoogleSearch(driver);
		gs.googleSearch("test");
	}
	@AfterTest
	public void Close()
	{
		driver.quit();
	}
}

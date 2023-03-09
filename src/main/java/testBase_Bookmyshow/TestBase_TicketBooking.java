package testBase_Bookmyshow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase_TicketBooking 
{
public static WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://in.bookmyshow.com/explore/home/pune");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

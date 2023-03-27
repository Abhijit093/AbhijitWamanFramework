package testBase_spicejet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase_Spicejet 
{
	 public static WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
	   WebDriverManager.chromedriver().setup();
	   driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://book.spicejet.com/search.aspx");
	   driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
}

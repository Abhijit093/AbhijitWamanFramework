package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderClass 
{
 
	@Test(dataProvider="getData")
	public void setup(String Username, String Password) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com");
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
        driver.findElement(By.xpath("//div[@id='app']/descendant::button")).click();
        
        Thread.sleep(2000);
        driver.quit();
 	}
	
	@DataProvider
	
	public Object[][] getData()
	{
		/*Object[][] data = new Object[3][2];
		
		data[0][0]="Admin";
		data[0][1]="admin123";
				
		data[1][0]="Admin1";
		data[1][1]="Admin123";
		
		data[2][0]="xvt";
		data[2][1]="saf";
		
		
		return data;*/
		
		return new Object[][]
		{
		  {"Admin","admin123"},
		  {"admin","adas"},
		  {"adsad","admin"},
		  {"qwer","rvccc"}
		};
	}
	
	
	
	
	
	
	
}

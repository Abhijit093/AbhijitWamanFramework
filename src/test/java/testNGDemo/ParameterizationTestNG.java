package testNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationTestNG 
{
 
	
	WebDriver driver;
	@Test
	@Parameters({"Browser","url","username","password"})
	public void parameterzation(String Browser,String url, String username, String password) throws InterruptedException
	{

	    
		if(url.equals("Chrome"))
		{
		//System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Java\\Setup\\Chrome\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(url);
		
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(3000);
		driver.quit();
		
		}
		else if(url.equals("Firefox"))
		{
			//System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Java\\Setup\\Chrome\\chromedriver.exe");
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.get(url);
			
			
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			
			Thread.sleep(3000);
			driver.quit();
		}
	}
	
}

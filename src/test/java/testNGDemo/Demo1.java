package testNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 
{
 WebDriver driver;
	@BeforeClass
	public void getsite()
	{
	  System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\Java\\Setup\\Chrome\\chromedriver.exe");	
	  driver = new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  driver.manage().deleteAllCookies();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.get("https://sg3plcpnl0153.prod.sin3.secureserver.net:2083");
	}
	
	@Test()
	public void loginAcc() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@id='user']")).sendKeys("p0cpcex4hk0j");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("Niwa@godaddy21");
		driver.findElement(By.xpath("//button[@id='login_submit']")).click();
		Thread.sleep(3000);
	}
	
	@Test(dependsOnMethods = "loginAcc")
	public void home() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@id='email_table_menu_webmail_abhijit@niwainternational.com']")).click();
	    Thread.sleep(3000);
	}
	
	@AfterClass
	public void exit()
	{
		driver.quit();
	}
	
}

package testNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo3 
{
  
	WebDriver driver;
	 
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Java\\Setup\\Chrome\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.get("https://www.facebook.com/");
	}
	
	@Test(priority=1)
	public void login() throws InterruptedException
	{

		WebElement logo =driver.findElement(By.xpath("//img[@alt='Facebook']"));
		System.out.println(logo.isDisplayed());
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhijeetwaman37@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void homePage() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("abhijeetwaman37@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.findElement(By.xpath("//div[@class='x1iyjqo2']/ul")).click();
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void exit() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.quit();
	}
	
}

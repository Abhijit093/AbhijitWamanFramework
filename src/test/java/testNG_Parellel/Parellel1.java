package testNG_Parellel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parellel1 
{
    WebDriver driver; 
	@Test(threadPoolSize=2, invocationCount=3)
	public void Test1() throws InterruptedException
	{
		System.out.println("This is output 1: "+Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://testng.org/");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void Test2() throws InterruptedException
	{
		System.out.println("this is output 2: "+ Thread.currentThread().getId());
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		driver.get("https://www.javatpoint.com/");
		Thread.sleep(3000);
		driver.quit();
	}
	
	@Test
	public void Test3()
	{
		System.out.println("this is output 3: "+ Thread.currentThread().getId());
	}
}

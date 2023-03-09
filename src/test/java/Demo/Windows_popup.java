package Demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Windows_popup 
{
  
	WebDriver driver;
	@BeforeMethod
	public void m1()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
	}
	
	@Test
	public void m2() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@id='newWindowBtn']")).click();
		
		String ParentHandles = driver.getWindowHandle();
		System.out.println(ParentHandles);
		
		Set<String> handles =driver.getWindowHandles();
		
		
		for(String handle:handles)
		{
			System.out.println(handles);
			if(!handle.equals(ParentHandles))
			driver.switchTo().window(handle);
			driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Abhijit");
			
			Thread.sleep(5000);
			
			
			driver.close();
		}
          		
		
		
		
	}
	
	
}

package Demo;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandle 
{
	public static WebDriver driver;
	@Test
	public void a()
	{
	     
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.naukri.com/mnjuser/homepage");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Test
	public void b()
	{
	  driver.findElement(By.xpath("(//a[@class='nI-gNb-menuItems__anchorDropdown'])[3]/child::div")).click();
	  
	  String Parent_id =driver.getWindowHandle();
	  System.out.println(Parent_id);
	  
	  Set<String> child_id = driver.getWindowHandles();
	  System.out.println(child_id);
	  
	  for(String a : child_id)
		{
			System.out.println(a);
			
			if(Parent_id.equals(a))
			{
				
			}
			else
			{
				driver.switchTo().window(a);
			}
		}
	  
	 }
	 
	
	@Test
	  public void c()
	  {
		  driver.findElement(By.xpath("(//div[@class='cardHead'])[2]/*[5]")).click();
	  }
	
	
	
}

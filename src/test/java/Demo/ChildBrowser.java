package Demo;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChildBrowser {

	public static void main(String[] args) 
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
      
		driver.manage().window().maximize();
	    driver.get("https://demoqa.com/browser-windows");
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		driver.findElement(By.xpath("//button[@id='windowButton']")).click();
		
		Set<String> id =driver.getWindowHandles();
		
	
		
		ArrayList a = new ArrayList(id);
		System.out.println(a.get(0));
		
		String parentTitle =driver.getTitle();
		System.out.println(parentTitle);
		
		driver.switchTo().window((String)a.get(1));
		
		driver.findElement(By.xpath("//h1")).isDisplayed();
		
		
	}

}

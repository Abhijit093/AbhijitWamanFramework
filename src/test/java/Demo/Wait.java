package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Wait 
{
    WebDriver driver;
	@BeforeMethod
	public void a1()
	{
	   
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.facebook.com/");
		driver.get("https://www.google.com/");
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
	}
	
	@Test(enabled=false)
	public void a2() throws InterruptedException
	{
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		
		driver.findElement(By.xpath("//input[@name='lsd']/following::div[1]/following-sibling::div[4]/child::a")).click();
		
		 WebDriverWait wait = new WebDriverWait(driver,10);
		
	WebElement element =    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='firstname']")));
		
		element.sendKeys("abc");	
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("XYZ");
	    driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("456213557845");
	    driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("9503145052");
	    // driver.findElement(By.xpath(""))
	  
	}
	
	@Test()
	public void gogle() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@class='gLFyf']")).sendKeys("abc",Keys.ENTER);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void a3()
	{
		driver.quit();
	}
	
	
}

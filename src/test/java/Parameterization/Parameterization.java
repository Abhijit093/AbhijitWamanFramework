package Parameterization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization 
{
 public static WebDriver driver;
	
 @Test
 @Parameters({"Browser","Url","Username","Password"})
 public void setUp(String Browser, String Url,String Username, String Password)
 {
	 if(Browser.equals("Chrome"))
	 {
	 WebDriverManager.chromedriver().setup();
	 driver=new ChromeDriver();
	 
	 }
	 else if(Browser.equals("Firefox"))
	 {
		 WebDriverManager.firefoxdriver().setup();
		 driver = new FirefoxDriver();
	 }
	 driver.manage().window().maximize();
	 driver.get(Url);
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 
		 
	 
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys(Username);
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
	 driver.findElement(By.xpath("//div[@id='app']/descendant::button")).click();
	 
	 
	
 }
}

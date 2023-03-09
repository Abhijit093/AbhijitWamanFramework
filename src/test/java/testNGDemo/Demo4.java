package testNGDemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo4 
{
	WebDriver driver;
 @BeforeTest
 public void lunchApp()
 {
	 
	 
	 //System.setProperty("webdriver.chrome.driver","F:\\Velocity\\Java\\Setup\\Chrome\\chromedriver.exe");
	 WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
 
 @Test(priority=2)
 public void loginPage() throws InterruptedException
 {
	 
	 WebElement logo = driver.findElement(By.xpath("//div[@class='oxd-sidepanel-header']/descendant::div[@class='oxd-brand-banner']"));
	 System.out.println(logo.isDisplayed());
	 
	 Thread.sleep(5000);
 }
 
 @Test(priority=3,invocationCount=2)
 public void leaveFeature() throws InterruptedException
 {
	 driver.findElement(By.xpath("//span[text()='Leave']")).click();
	 String pageTitle = driver.getTitle();
	 System.out.println(pageTitle);
	 
	 
	 }
 
 
 @Test(priority=1) 
 public void homePage() throws InterruptedException 
 {	
	 
	 
	 driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	 driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	 driver.findElement(By.xpath("//button[@type='submit']")).click();
	 WebElement logo = driver.findElement(By.xpath("//div[@class='oxd-sidepanel-header']/descendant::div[@class='oxd-brand-banner']"));
	 System.out.println(logo.isDisplayed());
	 //driver.findElement(By.xpath("//input")).sendKeys("ASDFGH");
	 
	 Thread.sleep(5000);
 }
 
 @Test(priority=4)
 public void leavePage() throws InterruptedException
 {
	 /*driver.findElement(By.xpath("(//i[@class='oxd-icon bi-calendar oxd-date-input-icon'])[1]")).click();
	 //driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active']")).sendKeys("2022-12-31");
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("Tam  An");
	 Thread.sleep(3000);*/
	 
	 
	 /*WebElement status = driver.findElement(By.xpath("//div[@class='oxd-select-text-input'])[2]"));
	 Select s = new Select(status);
	 s.selectByVisibleText("US - Vacation");*/
	 
	 WebElement search = driver.findElement(By.xpath("//button[@type='submit']"));
	 System.out.println(search.isDisplayed());
	 Assert.fail();
 }
 
  
 @AfterClass
 public void exit() throws InterruptedException
 { 
	 
	 driver.quit();
 }
 
}

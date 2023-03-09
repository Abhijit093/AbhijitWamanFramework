package testNGDemo;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo5 
{
	
	 WebDriver driver;
 @BeforeTest
 public void setUp()
 {
	 System.setProperty("webdriver.chrome.driver", "F:\\Velocity\\Java\\Setup\\Chrome\\chromedriver.exe");
	 
	 driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 driver.get("https://www.mycarhelpline.com/");
 }

 
 
 
 @Test(priority=2,alwaysRun=true)
 public void newCar()
 {
 driver.findElement(By.xpath("//a[text()='New Car']")).click();
 WebElement makelist = driver.findElement(By.xpath("//select[@id='brand']"));
 System.out.println(makelist.isDisplayed());
 }
 
 @Test(priority=1)
 public void home()
 {
	 System.out.println(driver.getCurrentUrl());
	 //System.out.println(2/0);
	 String ExpectedURL ="https://www.mycarhelpline.com/";
	 String ActualURL ="https://www.mycarhelpline123.com/";
	 
	Assert.assertEquals(ActualURL, ExpectedURL);
			 
 }
	
 
 
 @Test(priority=3)
 public void calculator()
 {
	 driver.findElement(By.xpath("//a[text()='Calculator']")).click();
	 Assert.fail("Fail intentionally");
 }
 
 
 @Test
 public void SoftAssertiontest()
 {
	 SoftAssert soft = new SoftAssert();
	 
	 String expectedName = "Abhijit";
	 String actualName = "Abhijit";
	 soft.assertEquals(actualName, expectedName);
	 
	 //Assert.assertTrue(true);
	 
	 String expectedName1 = "Java";
	 String actualName1 = "Pyton";
	 soft.assertEquals(actualName1, expectedName1);
	 
	 //Assert.assertTrue(false);
	 
	 String expectedName2 = "QA";
	 String actualName2 = "Sr QA";
	 soft.assertEquals(actualName2, expectedName2);
	 //Assert.assertTrue(false);
	 
	 
	 /*System.out.println("This is 1st statement");
	 soft.assertTrue(true);
	 
	 
	 System.out.println("This is 2nd statement");
	 soft.assertTrue(false);
	 
	 
	 System.out.println("This is 3rd statement");
	 soft.assertTrue(true);
	 */
	 
	soft.assertAll();
 
 }
 
 
 @AfterTest
 public void exit()
 {
	 driver.quit();
 }
 
}

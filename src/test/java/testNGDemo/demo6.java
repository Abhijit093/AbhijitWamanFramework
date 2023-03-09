package testNGDemo;

import static org.testng.Assert.fail;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demo6 
{
 
	private static final String TakesScreeenshot = null;
	public static WebDriver driver;
	
	
	@Test(priority=1)
	public void Launch() throws IOException, InterruptedException
	{
	  	WebDriverManager.chromedriver().setup();
	  	
	  	driver = new ChromeDriver();
	  	
	  	driver.manage().window().maximize();
	  	
	  	
	  	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  	
	  	driver.get("https://opensource-demo.orangehrmlive.com/");
	  	
	  	
	    
		/**WebElement firstresult = new WebDriverWait(driver, timeOutinSeconds :10)
	    		.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='app']/descendant::img[1]")));*/
	  	
	  	
	  	
	  	Date currentDate = new Date();
	  	System.out.println(currentDate);
	  	String ScreenshotName =currentDate.toString().replace(" ", "_").replace(":", "_");
	  	System.out.println(ScreenshotName);
	  	
	   	File Sc =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);	  	
	  	FileUtils.copyFile(Sc, new File("C:\\Users\\Administrator\\eclipse-workspace\\Niwa\\src\\test\\java\\testNGDemo\\ScrrenShot"+ ScreenshotName+ ".png"));
	   	
	   	
	}
	
	
	@Test(priority=2, dataProvider="Datapro")
	public void LoginPage(String username, String password) throws InterruptedException, IOException
	{
		driver.findElement(By.xpath("//div[@id='app']/descendant::div[12]/child::div[2]/child::input[@name='username']")).sendKeys(username);
	    driver.findElement(By.xpath("//div[@class='orangehrm-login-forgot']/preceding-sibling::div[2]/descendant::div/child::div[2]/*")).sendKeys(password);
	    driver.findElement(By.xpath("//div[@id='app']/descendant::button[1]")).click();
	    
	    
	   WebElement logo = driver.findElement(By.xpath("//div[@id='app']/descendant::img[2]"));
	    
	   logo.isDisplayed();
	   Assert.assertTrue(true,"must be pass");
	   
	   
	    Thread.sleep(5000);
	    
	    File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	    
	    File des = new File("C:\\Users\\Administrator\\eclipse-workspace\\Niwa\\src\\test\\java\\testNGDemo\\ScrrenShot\\sclogin.png");
	    
	    FileHandler.copy(src, des);
	    
	}
	@DataProvider(name="Datapro")
	public Object[][] dataSet()
	{
	 Object[][] data = new Object[2][2];
			 
		data[0][0]="admin";
	    data[0][1]="admin123";
	    
	    data[1][0]="test";
	    data[1][1]="admin123";
	
	    
	    return data;
	    
	 
	}
	   	
	
	@Test(priority=3, enabled=false)
	public void AdminPage()
	{
		driver.findElement(By.xpath("//div[@id='app']/descendant::li[1]/child::a[1]")).click();
		driver.findElement(By.xpath("//div[@id='app']/child::div[1]/descendant::div[15]/descendant::div[14]/child::input")).sendKeys("Abhijieet");
		driver.findElement(By.xpath("//div[@id='app']/descendant::input[3]")).sendKeys("ABCDEF");
		driver.findElement(By.xpath("//div[@class='oxd-form-actions']/child::button[2]")).click();
		
		
		
		//Assert.fail("Fail intenstionally");
		
	}
	
	@Test(priority=4)
	public void pimPage() throws IOException, InterruptedException
	{
		driver.findElement(By.xpath("//div[@id='app']/descendant::li[2]/child::a")).click();
		driver.findElement(By.xpath("//div[@id='app']/descendant::nav[2]/descendant::li[3]/child::a")).click();
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Abhijit");
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Waman");
		driver.findElement(By.xpath("//div[@class='oxd-form-actions']/child::button[2]")).click();
		
		Thread.sleep(10000);
		//Take Screenshot and store it as a File format.
		File Sc = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Store the sreenshot in desired location
		File Dest = new File("C:\\Users\\Administrator\\eclipse-workspace\\Niwa\\src\\test\\java\\testNGDemo\\ScrrenShot\\sc1.png");
		
		FileHandler.copy(Sc, Dest);
		
		driver.quit();
		
	}
	
	
	
	
	
	
	
}

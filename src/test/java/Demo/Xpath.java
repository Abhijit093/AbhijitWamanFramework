package Demo;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Xpath {

	public static void main(String[] args) throws InterruptedException, IOException 
	{
 
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.mycarhelpline.com/");
		
		
		//driver.findElement(By.xpath("//div[@id='topnav']/descendant::li[4]/*")).click();
		
		//driver.findElement(By.xpath("//div[@id='bodycontainer-innerpage']/descendant::a[10]/*")).click();
		
		WebElement make =driver.findElement(By.xpath("//div[@class='newcar']/descendant::select[@id='brand']"));
		
		//WebElement model =driver.findElement(By.xpath("//div[@id='txtHint']/select[@id='model']"));
		Select s1 = new Select(make);
		s1.selectByValue("10");
		
		
		/*Select s2 = new Select(model);
		s2.selectByVisibleText("XUV300");*/
		
		
		driver.findElement(By.xpath("//div[@class='newcar-right']/child::input[@class='red-btn']")).click();
		
		
		/*String path ="C:\\Users\\Administrator\\eclipse-workspace\\Niwa\\src\\test\\java\\testNGDemo\\ScrrenShot";
		//To Take a Screenshot
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//to store SS in this location
		File des = new File(path+"\\demosc.png");
		//copy from src to des
		FileHandler.copy(src, des);*/
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("scroll(0,600)");
		Thread.sleep(4000);
		js.executeScript("scroll(0,-500)");
		
		

		
		Thread.sleep(3000);
		driver.quit();
	}

}

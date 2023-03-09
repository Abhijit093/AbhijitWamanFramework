package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PopUpWindow 
{
 public static void main(String[] args) throws InterruptedException
 {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	 
	 driver.get("https://demoqa.com/alerts");
	 
	 driver.findElement(By.xpath("//button[@id='alertButton']")).click();
	 driver.switchTo().alert().accept();
	 
	 
	 driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
	 
	 Alert ale=driver.switchTo().alert();
	 ale.accept();
	 
	 
	 driver.findElement(By.xpath("//button[@id='promtButton']")).click();
	 
	 Alert promt =driver.switchTo().alert();
	 System.out.println(promt.getText());
	 promt.sendKeys("Welcome");
	 promt.accept();
	 
	 Thread.sleep(3000);
	 driver.quit();
 }
}

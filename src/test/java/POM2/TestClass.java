package POM2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass {

	public static void main(String[] args) throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://localhost/login.do");
		
		
		
		Login l = new Login(driver);
		
		l.UsernamePage("admin");
		l.passwordpage("admin123");
		l.loginbutton();
		
		Thread.sleep(3000);
		driver.quit();
		

	}

}

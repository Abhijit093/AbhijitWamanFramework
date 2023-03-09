package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class POMTestClass {

	public static void main(String[] args) throws InterruptedException 
	{
		 
		WebDriverManager.firefoxdriver().setup();
		
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		LoginPage lp = new LoginPage(driver);
		
	
		lp.orangeUsername("Admin");
		lp.orangPassword("admin123");
		lp.orangeLoginButton();
		
		
		
		HomePage home = new HomePage(driver);
		
		home.clickOnAdmin();
		home.checkUsername("Abhijit");
		home.checkName("Waman");
		home.cickOnSearch();
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
		

	}

}

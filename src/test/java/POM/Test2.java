package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 { 
	 
	public static WebDriver driver;
	 @BeforeMethod
	 public void m1() {
		 
		 WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get("https://demo.guru99.com/test/web-table-element.php");
		 
		 
	 }

}

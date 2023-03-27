

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo2Sem {

public static void main(String[] args) {
WebDriverManager.chromedriver().setup();
//WebDriverManager.chromedriver().setup();
WebDriver d=new ChromeDriver();
d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
d.get("https://www.siemens.com/global/en.html");
d.findElement(By.xpath("//button[@class='newHomeHeaderSearch__searchIcon']")).sendKeys("hospital");
d.findElement(By.xpath("//button[@class='newHomeHeaderSearch__searchIcon']")).click();
Set<String> window = d.getWindowHandles();
ArrayList<String> al=new ArrayList<String>(window);

String mainid = al.get(0);
System.out.println(mainid);
d.switchTo().window(al.get(1));

String cwid = al.get(1);
System.out.println(cwid);
   String text = d.getTitle();
   System.out.println(text);

WebElement lang=d.findElement(By.xpath("//div[@class='v-select vs--single vs--unsearchable newHomeDropdown newHomeDropdown--hasSelected']"));
Select s=new Select(lang);
s.selectByVisibleText("French");
d.findElement(By.xpath("//div[text()='Smart Hospitals | Solutions IoT | Siemens Switzerland']")).click();
String t1 = d.findElement(By.xpath("//h1[text()='Page not found ']")).getText();
System.out.println(t1);




}
}
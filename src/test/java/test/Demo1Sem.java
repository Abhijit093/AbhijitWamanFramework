package test;



import java.io.File;

import org.openqa.selenium.By;

import org.openqa.selenium.OutputType;

import org.openqa.selenium.TakesScreenshot;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1Sem {

public static void main(String[] args) {

//System.setProperty("webdiver.chrome.diver", "C:/Users/Suraj//Desktop/chromedriver.exe");

	WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();

driver.navigate().to("https://www.siemens.com/global/en.html");

driver.findElement(By.id("newHomeHeaderSearch__searchIcon")).sendKeys("hospitals");

((WebElement) driver).click();

driver.switchTo();

Select dropdown=new Select(driver.findElement(By.className("vs__search")));

dropdown.deselectByVisibleText("French");

((WebElement) dropdown).click();

} 
}
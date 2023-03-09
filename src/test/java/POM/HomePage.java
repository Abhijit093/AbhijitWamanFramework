package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
 
	 @FindBy(xpath="//li[@class='oxd-main-menu-item-wrapper'][1]")
	 WebElement Admin;
	 
	 @FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	 WebElement Username;
	 
	 @FindBy(xpath="//input[@placeholder='Type for hints...']")
	 WebElement emName;
	 
	 @FindBy(xpath="//button[@type='submit']")
	 WebElement Search;
	 
	 
	 
	 public HomePage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 
	 public void clickOnAdmin()
	 {
		Admin.click(); 
	 }
	 
	 public void checkUsername(String uname)
	 {
		 Username.sendKeys(uname);
	 }
	 
	 public void checkName(String name)
	 {
		 emName.sendKeys(name);
	 }
	 
	 public void cickOnSearch()
	 {
		 Search.click();
	 }
	 
	 
}

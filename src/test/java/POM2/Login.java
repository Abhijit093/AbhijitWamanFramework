package POM2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login 
{
	
	
   @FindBy(xpath="//input[@name='username']")
   WebElement uname;
   
   @FindBy(xpath="//input[@name='pwd']")
   WebElement pwd;
   
   @FindBy(xpath="//a[@id='loginButton']")
   WebElement login;
   
   
   public Login(WebDriver driver)
   {
	   
	   PageFactory.initElements(driver, this);
   }
   
   
   
   public void UsernamePage(String un)
   {
	   uname.sendKeys(un);
	   
   }
   
   public void passwordpage(String pd)
   {
	   pwd.sendKeys(pd);
   }
   
   public void loginbutton()
   {
	   login.click();
   }
   
}

package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
  
	@FindBy(xpath="//input[@name='username']")
	WebElement Username;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement Password;
	
	@FindBy(xpath="//button")
	WebElement Login;
	
	
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	
	public void orangeUsername(String Uname)
	{
		Username.sendKeys(Uname);
	}
	
	public void orangPassword(String pwd)
	{
		Password.sendKeys(pwd);
	}
	
	public void orangeLoginButton()
	{
		Login.click();
	}
	
	
}

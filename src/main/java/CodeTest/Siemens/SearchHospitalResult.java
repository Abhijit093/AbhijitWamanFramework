package CodeTest.Siemens;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import SiemensTest.TestBase_Siemens;

public class SearchHospitalResult extends TestBase_Siemens {

	public SearchHospitalResult() {
		  PageFactory.initElements(driver,this);
			}
	
	 @FindBy(xpath="//button[@class='newHomeHeaderSearch__searchIcon']")
	 private WebElement clickonSearchicon;
	 
	 @FindBy(xpath="//div[@class='newHomeHeader__search']/descendant::input")
	 private WebElement clickOnSearchBox;
	 
	 @FindBy(xpath="(//div[@class='vs__actions'])[1]/child::div[1]")
	 private WebElement clickOnLangDropDown;
	 
	 //@FindBy(xpath="")
	 
	 @FindBy(xpath="//div[@class='newHomeSearchPage__results']/descendant::p")
	 private WebElement verifyText;
	 
	 
	 public void clickOnSearchBox() throws InterruptedException{
		 Thread.sleep(8000);
		 clickonSearchicon.click();
		 Thread.sleep(5000);
		 clickOnSearchBox.sendKeys("hospital");
		 Thread.sleep(5000);
		 clickonSearchicon.click();
		  handleWindows();
		 Thread.sleep(5000);
		 clickOnLangDropDown.click();
		 Thread.sleep(5000);
		 selectLangDropDown();
		 Thread.sleep(5000);
		 captureLink();
		 Thread.sleep(5000);
		 verifyText();
		 Thread.sleep(5000);
		 verifyDepartureFlightMessage();
		 
		 
		 
		 
		 
	 }

	 public void handleWindows() {
		Set<String> windowid= driver.getWindowHandles();
		
		List list = new ArrayList(windowid);
		String listid=(String) list.get(1);
		driver.switchTo().window(listid);
		} 
	 
	 
	 public void selectLangDropDown() {
		 Select select = new Select(clickOnLangDropDown);
		 select.selectByVisibleText("French");
				 
	 }
	 
	public void captureLink() {
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		 for(WebElement link:allLinks){
		 System.out.println(link.getText());
	   }
	}
	
	
		

        
	 
		
	 

	private void selectLang() {
		// TODO Auto-generated method stub
		
	}
	
	public void verifyDepartureFlightMessage() {
    	String textDisplayed = verifyText();
    	if(textDisplayed.equalsIgnoreCase(" About 26 results for “hospitals”: "))
    	{
    		System.out.println("Result is Dispyled");
    	}else
    	{
    	  System.out.println("Result is not Dispyled");
    	} 
	}
	
	public String verifyText(){
   	 String Text =verifyText.getText();
   	 return Text;
    }
	
	
	      
	      
	 
	 
	    /* public void acceptCookies() {
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
		 WebElement element =driver.findElement(By.xpath(""));
		 js.executeScript();
	 }*/
	 
	 
}

package Assg1.Spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import testBase_spicejet.TestBase_Spicejet;

public class Book_Ticket extends TestBase_Spicejet
{
 public Book_Ticket()
 {
	PageFactory.initElements(driver,this); 
 }
 
 
 
     @FindBy(xpath="//a[@class='selected']/child::span[2]")
	 private WebElement select_Flight;
     
     @FindBy(xpath="//div[@id='RoundTrip']/child::input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_RoundTrip']")
     private WebElement select_Roundtrip;
     
     @FindBy(xpath="//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")
     private WebElement select_Departure;
     
     @FindBy(xpath="//div[@id='marketDate_1']/descendant ::button")
     private WebElement select_Calnder;
     
     @FindBy(xpath="(//table[@class='ui-datepicker-calendar'])[1]/child::tbody/child::tr[5]/descendant::a[text()='28']")
     private WebElement select_DepartureDate; 
     
     @FindBy(xpath="//div[@id='marketDate_2']/descendant::button")
     private WebElement select_ReturnCalnder;
     
     @FindBy(xpath="(//table[@class='ui-datepicker-calendar'])[1]/child::tbody/child::tr[5]/descendant::a[text()='30']")
     private WebElement select_ReturnDate;
     
     @FindBy(xpath="//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchViewdestinationStation1_CTXT']")
     private WebElement Return_Date;
          
     @FindBy(xpath="//div[@id='divpaxinfo']")
     private WebElement passanger;
     
     @FindBy(xpath="//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT']")
     private WebElement selectAdult;
     
     @FindBy(xpath="//select[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_CHD']")
     private WebElement selectChild;
     
     @FindBy(xpath="//tr[@class='thheadingbg1']/descendant::span[3]")
     private WebElement verifyText;
     
     @FindBy(xpath="//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_ButtonSubmit']")
     private WebElement SearchButton;
     
     
     public void city(String city)
     {
    	 driver.findElement(By.xpath("//a[text()='"+city+"']")).click();
    	 
     }
     
     public void returnCity(String city)
     {
    	 driver.findElement(By.xpath("(//a[text()='"+city+"'])[2]")).click();
    	 
     }
     
     
     
     
     public void selectRoundTrip() throws InterruptedException
     {
    	 select_Flight.click();
    	 select_Roundtrip.click(); 
     }
     public void selectDepartureAndArrivalCity() throws InterruptedException {
    	 Thread.sleep(5000);
    	 select_Departure.click();
    	 Thread.sleep(5000);
    	 city(" Mumbai (BOM)");
    	 Thread.sleep(5000);
    	 Return_Date.click();
    	 Thread.sleep(5000);
    	 returnCity(" Delhi (DEL)");
    	 Thread.sleep(5000);
     }
    	 
    public void selectDepartureAndReturnDate() throws InterruptedException {
    	 Thread.sleep(8000);
    	 selectDepartureDate();
    	 Thread.sleep(5000);
    	 select_ReturnCalnder.click();
    	 Thread.sleep(5000);
    	 select_ReturnDate.click();
    	 Thread.sleep(5000);
    }
    	 
    	 
    public void enterPassengerDetails() throws InterruptedException {
    	passanger.click();
    	Thread.sleep(5000);
    	Select obj = new Select(selectAdult);
    	obj.selectByVisibleText("3");
    	Select obj2 = new Select(selectChild);
    	obj2.selectByVisibleText("2");
    	Thread.sleep(5000);
    	SearchButton.click();
    	Thread.sleep(8000);
    }
    public void verifyDepartureFlightMessage() {
    	String textDisplayed = verifyText();
    	if(textDisplayed.equalsIgnoreCase("Departure Flight"))
    	{
    		System.out.println("Departure Flight Text is Dispyled");
    	}else
    	{
    	  System.out.println("Departure Flight Text is Not Dispyled");	
    	} 
     }

     
     
     public void selectDepartureDate()
	 {
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 WebElement element =driver.findElement(By.xpath("(//table[@class='ui-datepicker-calendar'])[1]/child::tbody/child::tr[5]/descendant::a[text()='28']"));
		 js.executeScript("arguments[0].click();",element);
	 }
     
     
     public String verifyText()
     {
    	 
    	
    	 String Text =verifyText.getText();
    	 return Text;
     }
     
     
     
     
 
 
 
}

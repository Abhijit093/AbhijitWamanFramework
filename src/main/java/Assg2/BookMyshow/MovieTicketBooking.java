package Assg2.BookMyshow;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testBase_Bookmyshow.TestBase_TicketBooking;

public class MovieTicketBooking extends TestBase_TicketBooking   
{ 
	public MovieTicketBooking()
	 {
		PageFactory.initElements(driver,this); 
	 }
	
	
	 @FindBy(xpath="//div[@id='1']/descendant::span[@id='4']")
	 private WebElement Search_txtbox;
	 
	 @FindBy(xpath="//div[@id='sdk-AD_HOME_CAROUSEL']/preceding::input")
	 private WebElement search_movie;
	 
	 @FindBy(xpath="//div[@id='super-wrapper']/descendant::span[4]/child::strong")
	 private WebElement select_movie;
	 
	 @FindBy(xpath="//div[@id='page-cta-container']/descendant::span")
	 private WebElement bookticket_button; 
	 
     @FindBy(xpath="//div[@class='slick-track']/descendant::li[3]")
	 private WebElement select_date;
	 
	 @FindBy(xpath="//button[@id='wzrk-cancel']")
	 private WebElement notify_window;
	 
	 @FindBy(xpath="(//div[@class='showtime-pill-wrapper'])[1]/child::div/child::a")
	 private WebElement select_time;
	 
	 @FindBy(xpath="//div[@class='btn-bar']/child::div[@id='btnPopupAccept']")
	 private WebElement accept_condition;
	 
	 @FindBy(xpath="//ul[@id='popQty']/child::li[4]")
	 private WebElement select_sheet;
	 
	 @FindBy(xpath="//div[@id='proceed-Qty']")
	 private WebElement accept_sheet;
	 
	 
	 
	 
	 
	 
	 public void movieSearch() throws InterruptedException
	 {
		 WebDriverWait wait=new WebDriverWait(driver, 20);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='1']/descendant::span[@id='4']")));	
		 Thread.sleep(5000);
		 Search_txtbox.click();
		 Thread.sleep(5000);
		 search_movie.sendKeys("Pathaan");
		 Thread.sleep(5000);
		 select_movie.click();
		 Thread.sleep(5000);
		 
     }
	 
	 public void bookTicket() throws InterruptedException
	 {
		 bookticket_button.click();
		 Thread.sleep(5000);
		 notify_window.click();
		 Thread.sleep(8000);
		 select_date.click();
		 Thread.sleep(3000);
		 select_time.click();
		 Thread.sleep(3000);
		 accept_condition.click();
		 Thread.sleep(3000);
		 
	 }
	 
	 public void selectSheet()
	 {
		 select_sheet.click();
		 accept_sheet.click();
		 
	 }
	 
	 
	 
	
	
	
}

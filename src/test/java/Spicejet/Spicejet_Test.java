package Spicejet;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Assg1.Spicejet.Book_Ticket;
import io.github.bonigarcia.wdm.WebDriverManager;
import testBase_spicejet.TestBase_Spicejet;

public class Spicejet_Test extends TestBase_Spicejet 
{
    
	@Test
	public void verifyRoundTripFlightBooking() throws InterruptedException
	{
		Book_Ticket book = new  Book_Ticket();
		book.selectRoundTrip();
		book.selectDepartureAndArrivalCity();
		book.selectDepartureAndReturnDate();
		book.enterPassengerDetails();
		book.verifyDepartureFlightMessage();
    }
	
}

package BookMyshow;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import Assg2.BookMyshow.MovieTicketBooking;
import testBase_Bookmyshow.TestBase_TicketBooking;


public class Bookmyshow_Test extends TestBase_TicketBooking
{
	@Test
	public void Open() throws InterruptedException
	{
		MovieTicketBooking moviebook = new  MovieTicketBooking();
		moviebook.movieSearch();
		moviebook.bookTicket();
		moviebook.selectSheet();
	}
}

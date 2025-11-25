package testcases;

import org.testng.annotations.Test;

import pageObjects.BusSearchPage;
import pageObjects.HomePage;
import testBase.BaseTest;

public class BusSearchTest extends BaseTest {

	@Test
	void searchBusTest() throws InterruptedException
	{
		HomePage h = new HomePage(driver);
		h.crossButtonClick();
		h.BusMenuMethod();
		
		BusSearchPage b = new BusSearchPage(driver);
		b.getFromcity();
		b.getFromBusOptions();
		b.getBusStops();
		b.getToBusOptions();
		b.getToBusStops();
		b.getFromDates();
		b.clickSearchButton();
		Thread.sleep(3000);
		b.getBusList();
		b.getSeats();
		b.getPickup();
		b.getDropup();
		b.clickContinueBtn();
	}
}

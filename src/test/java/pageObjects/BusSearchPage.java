package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BusSearchPage extends BasePage {

	public BusSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	//locators
	
	@FindBy(xpath = "//label[@for='fromCity']")
	WebElement busFromcity;
	
	@FindBy(xpath = "//input[@placeholder='From']")
	WebElement BusFromOptions;
	
	@FindBy(xpath = "//p[@class='searchedResult font14 darkText']")
	List<WebElement> fromBusStops;
	
	@FindBy(xpath = "//input[@placeholder='To']")
	WebElement BusToOptions;
	
	@FindBy(xpath = "//p[@class='searchedResult font14 darkText']")
	List<WebElement> ToBusStops;
	
	@FindBy(xpath = "//div[@class='DayPicker-Month'][1]//div[@class='DayPicker-Day']")
	List<WebElement> FromDates;
	
	@FindBy(xpath = "//button[@id='search_button']")
	WebElement BusSearchButton;
	
	@FindBy(xpath = "//p[@class='BusCard_listName__4GI_0']")
	List<WebElement> BusList;
	
	@FindBy(xpath = "//button[@class='BusCard_primaryBtn__iiHt1 ']")
	WebElement selectSeats;
	
	@FindBy(xpath = "//div[@class='SeatMapContainer_seat__FPUJ3 undefined' and @style = 'grid-area: 5 / 1; width: auto; margin-right: 0px;']")
	WebElement SeatBook;
	
	@FindBy(xpath = "//div[@class='PickUpDropSelection_busStopTextContainer__IwUzp']//div[normalize-space()='Chembur']")
	WebElement Pickup;
	
	@FindBy(xpath = "//div[@class='PickUpDropSelection_busStopTextContainer__IwUzp']//div[normalize-space()='Tale Gaon']")
	WebElement DropAt;
	
	@FindBy(xpath = "//button[normalize-space()='Continue']")
	WebElement btnContinue;
	
	public void getFromcity()
	{
		busFromcity.click();
	}
	
	public void getFromBusOptions()
	{
		BusFromOptions.sendKeys("Mumbai");
	}
	
	public void getBusStops()
	{
		for(WebElement fromBusStop :fromBusStops)
		{
			String BusStopFrom = fromBusStop.getText();
			System.out.println(BusStopFrom);
			if(BusStopFrom.contains("Mumbai, Maharashtra"))
			{
				fromBusStop.click();
				break;
				
			}
		}
	}
	
	public void getToBusOptions()
	{
		BusToOptions.click();
		BusToOptions.sendKeys("Pune");
	}
	
	public void getToBusStops()
	{
		for(WebElement ToBusStop :ToBusStops)
		{
			String BusStopTo = ToBusStop.getText();
			System.out.println(BusStopTo);
			if(BusStopTo.contains("Pune, Maharashtra"))
			{
				ToBusStop.click();
				break;
			}
		}
	}
	
	public void getFromDates()
	{
		for(WebElement d:FromDates)
		{
			String date =d.getText();
			System.out.println(date);
			if(date.contains("29"))
			{
				d.click();
				break;
			}
		}
	}
	
	
	public void clickSearchButton()
	{
		BusSearchButton.click();
	}
	
	
	public void getBusList() 
	{
		for(WebElement bus:BusList)
		{
			String busName = bus.getText();
			if(busName.contains("SWAMI NARAYAN TOURS & TRAVELS")) {
				selectSeats.click();
				//Thread.sleep(5000);
			}
		}
	}
	
	public void getSeats()
	{
		SeatBook.click();
	}
	
	public void getPickup()
	{
		Pickup.click();
	}
	
	public void getDropup()
	{
		DropAt.click();
	}
	
	public void clickContinueBtn()
	{
		btnContinue.click();
	}
	
}

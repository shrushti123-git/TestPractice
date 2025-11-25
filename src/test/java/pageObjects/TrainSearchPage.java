package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TrainSearchPage extends BasePage{

	public TrainSearchPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	
	//locators
	
	@FindBy(xpath ="//label[@for='fromCity']")
	WebElement Fromcity;
	
	@FindBy(xpath ="//input[@placeholder='From']")
	WebElement FromOptions;
	
	@FindBy(xpath = "//li[@role='option']//p[@class='searchedResult font14 darkText']")
	List<WebElement> fromcities;
	
	@FindBy(xpath = "//label[@for='toCity']")
	WebElement toCity;
	
	@FindBy(xpath ="//input[@placeholder='To']")
	WebElement toOptions;
	
	@FindBy(xpath = "//li[@role='option']//p[@class='searchedResult font14 darkText']")
	List<WebElement> tocities;
	
	@FindBy(xpath = "//div[@class='DayPicker-Month'][1]//div[@class='DayPicker-Day']")
	List<WebElement> fromdates;
	
	@FindBy(xpath = "//ul[@class='travelForPopup']//li[@data-cy=\"2A\"]")
	WebElement secondclass;
	
	@FindBy(xpath = "//a[normalize-space()='Search']")
	WebElement btnSearch;
	
	@FindBy(xpath = "//p[@class='ListingCard_listName__4Ox7f']")
	List<WebElement> trainlist;
	
	@FindBy(xpath = "(//p[@data-testid='class-info'][normalize-space()='2S'])[1]")
	WebElement classname;
	
	public void fromcity()
	{
		Fromcity.click();
	}
	
	public void fromOptions()
	{
		FromOptions.sendKeys("Thane");
	}

	public void fromcities()
	{
		for(WebElement fromcity:fromcities)
		{
			String fromcityname = fromcity.getText();
			System.out.println(fromcityname);
			if(fromcityname.contains("Mumbai"))
			{
				fromcity.click();
				break;
			}
		}
	}
	
	/*public void tocity()
	{
		toCity.click();
	}*/
	
	public void toOptions()
	{
		toOptions.click();
		toOptions.sendKeys("Pune");
	}
	
	public void tocities()
	{
		for(WebElement toCity:tocities)
		{
			String tocityname = toCity.getText();
			System.out.println(tocityname);
			if(tocityname.contains("Pune"))
			{
				toCity.click();
				break;
			}
		}
	}
	
	
	public void fromDates()
	{
		for(WebElement d:fromdates)
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
	
	public void clickSecondClass() {
		secondclass.click();
	}
	
	public void searchButton()
	{
		btnSearch.click();
	}
	
	
	public void trainlist()
	{
		for(WebElement t:trainlist)
		{
			String trainname = t.getText();
			System.out.println(trainname);
			
			if(trainname.contains("Deccan Queen"))
			{
				
				classname.click();
				break;
			}
			
			
		}
	}
}


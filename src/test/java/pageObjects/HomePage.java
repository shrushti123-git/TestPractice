package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//locators
	@FindBy(xpath = "//span[@class='commonModal__close']")
	WebElement btnCross;
	
	@FindBy(xpath = "//li[@class='menu_Trains']")
	WebElement trainMenu;
	
	@FindBy(xpath = "//li[@class='menu_Buses']")
	WebElement busMenu;
	
	
	//action methods
	public void crossButtonClick()
	{
		btnCross.click();
	}
	
	public void trainMenuMehtod()
	{
		trainMenu.click();
	}
	
	public void BusMenuMethod()
	{
		busMenu.click();
	}

}

package testcases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.TrainSearchPage;
import testBase.BaseTest;

public class TrainSearchTest extends BaseTest {
	
	@Test
	void trainsearchTest()
	{
		HomePage h = new HomePage(driver);
		h.crossButtonClick();
		h.trainMenuMehtod();
		
		TrainSearchPage t = new TrainSearchPage(driver);
		t.fromcity();
		t.fromOptions();
		t.fromcities();
		//t.tocity();
		t.toOptions();
		t.tocities();
		t.fromDates();
		t.clickSecondClass();
		t.searchButton();
		t.trainlist();
		
	}

}

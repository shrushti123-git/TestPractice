package testBase;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
	
	public WebDriver driver;
	public WebDriverWait wait;
	
	@BeforeClass
	public void setup() throws InterruptedException
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/");
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		
		try {
	        WebElement cta = driver.findElement(By.className("tp-dt-enhanced-floating-cta"));
	        ((JavascriptExecutor)driver).executeScript("arguments[0].style.display='none';", cta);
	    } catch(Exception e) {}


	    // Scroll to class section
	    ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,300);");
	    Thread.sleep(500);
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	

}

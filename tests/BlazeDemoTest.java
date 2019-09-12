import static org.junit.Assert.*;

import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BlazeDemoTest {
	 
	WebDriver driver;
	

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver","/Users/sivaprrasad/Desktop/chromedriver");
		driver = new ChromeDriver();
		
		driver.get("http://blazedemo.com/");
	}
	

	@After
	public void tearDown() throws Exception {
		Thread.sleep(5000);
		driver.close();
	}

	//SivaPrasad Uppalapati - C0744659
	@Test
	public void testCheckDepartureCities() {
		
		WebElement dCities = driver.findElement(By.className("form-inline"));
		dCities.click();
		
		Select se = new Select(driver.findElement(By.className("form-inline")));

		List<WebElement> l = se.getOptions();
		int departureCities = l.size();
		
		assertEquals(7, departureCities);
		// Edited Just quotes.
		// Declared departure Cities as int but given as string("7") in assert equals with previous commit.
		// Edited in assertEquals to interger type, which is passed.
	}
	
	@Test
	public void testVirginAmericaFlight() {
	
		
	}

}

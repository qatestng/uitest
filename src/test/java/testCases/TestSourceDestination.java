package testCases;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import driver.Driver;
import pages.FindFlights;
import resources.Constants;

public class TestSourceDestination extends Driver {

	@BeforeClass
	public void init() throws IOException, InterruptedException {

		System.out.println("Driver is initialized - " + Constants.BLAZEDEMOURL);
		driver = initializeDriver();
		driver.get(Constants.BLAZEDEMOURL);
	}

	@Test(priority = 1, description = "Verify selected city is source does not appear in Destination")
	public void verifySourceCityNotInDestination() throws InterruptedException {
		FindFlights pg = PageFactory.initElements(driver, FindFlights.class);
		pg.selectSourceCity();
		List<WebElement> destCityList = pg.selectDestinationCityList();
		Assert.assertFalse(destCityList.contains("Rome"));

	}

	@Test(priority = 2, description = "Searching flights from Paris to Rome")
	public void verifyFindFlights() throws InterruptedException {
		FindFlights pg = PageFactory.initElements(driver, FindFlights.class);
		pg.selectSourceCity();
		pg.selectDestinationCity();
		pg.clickFindFlights();

		Assert.assertEquals(pg.chooseFlightPage(), "Flights from Paris to Rome:");

	}

	@AfterClass
	public void teardown() {
		driver.quit();

	}
}

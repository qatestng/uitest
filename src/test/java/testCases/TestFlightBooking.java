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
import pages.ChooseFlight;
import pages.FindFlights;
import pages.PurchaseFlight;
import pages.ResultPage;
import resources.Constants;

public class TestFlightBooking extends Driver {

	@BeforeClass
	public void init() throws IOException, InterruptedException {

		System.out.println("Driver is initialized - " + Constants.BLAZEDEMOURL);
		driver = initializeDriver();
		driver.get(Constants.BLAZEDEMOURL);
	}

	@Test(priority = 1, description = "Verify complete flow of flight booking")
	public void verifyFLightBookingFlow() throws InterruptedException {
		FindFlights ff = PageFactory.initElements(driver, FindFlights.class);
		ChooseFlight cf = PageFactory.initElements(driver, ChooseFlight.class);
		PurchaseFlight pf = PageFactory.initElements(driver, PurchaseFlight.class);
		ResultPage rp = PageFactory.initElements(driver, ResultPage.class);

		ff.selectSourceCity();
		ff.selectDestinationCity();
		ff.clickFindFlights();
		cf.clickFirstAvailableFlight();
		pf.sendFirstLastName();
		pf.clickPurchaseFlightButton();
		String resultPageString = rp.readBookingConfirmationString();
		Assert.assertEquals(resultPageString, Constants.BOOKING_CONFIRMED);

	}

	@AfterClass
	public void teardown() {
		driver.quit();

	}

}

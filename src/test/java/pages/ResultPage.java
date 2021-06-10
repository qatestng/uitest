package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultPage {

	WebDriver driver;

	public ResultPage(WebDriver driver) {
		this.driver = driver;
	}

	By bookingConfirmationString = By.xpath("//h1[contains(text(),'Thank you for your purchase today!')]");

	public String readBookingConfirmationString() {
		return driver.findElement(bookingConfirmationString).getText().toString();
	}

}

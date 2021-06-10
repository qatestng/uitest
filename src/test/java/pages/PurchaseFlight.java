package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class PurchaseFlight {

	WebDriver driver;

	public PurchaseFlight(WebDriver driver) {
		this.driver = driver;
		System.out.println("driver in constructor: " + driver);
	}

	By purchaseFlightButton = By.xpath("//input[@value='Purchase Flight']");
	By inputName = By.id("inputName");

	public void clickPurchaseFlightButton() throws InterruptedException {
		// Javascript executor
		((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");

		Thread.sleep(2000);
		driver.findElement(purchaseFlightButton).click();
	}

	public void sendFirstLastName() throws InterruptedException {
		Thread.sleep(500);
		driver.findElement(inputName).sendKeys("FirstName LastName");
	}

}

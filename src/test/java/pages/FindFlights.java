package pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FindFlights {
	
 WebDriver driver;
	 
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public FindFlights (WebDriver driver ) {
	 this.driver=driver;
	 }
	 
	 //Locator for source city paris
	 By sourceCityParis = By.xpath("//option[@value='Paris']");
	 
	//Locator for source city Rome
	 By destinationCityRome = By.xpath("//option[@value='Rome']"); 
	 
	 //Locator for find flight button 
	 By findFlightButton = By.xpath("//input[@value='Find Flights']");
	 
	//Locator for Flights from city 1 to city 2
	By chooseFlightPage = By.xpath("//h3[contains(text(),'Flights from Paris to Rome:')]");
	
	 public void selectSourceCity() {
	 driver.findElement(sourceCityParis).click();
	 }
	 //Locator of destination city rome
	 public void selectDestinationCity() {
	 driver.findElement(destinationCityRome).click();
	 }
	 
	 //Click find flights
	 public void clickFindFlights() {
	 driver.findElement(findFlightButton).click();
	 }
	 
	 //Choose flight page title
	 public String chooseFlightPage() {
		return driver.findElement(chooseFlightPage).getText();
		 }

	 //Get list from destination city dropdown 
	public List selectDestinationCityList() {
		
		WebElement selectElement = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select select = new Select(selectElement);
		List<WebElement> allOptions = select.getOptions();
		return allOptions;
		
		
	}

}

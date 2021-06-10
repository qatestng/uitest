package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ChooseFlight {
	
	 WebDriver driver;
	 
	 //Constructor that will be automatically called as soon as the object of the class is created
	 public ChooseFlight (WebDriver driver ) {
	 this.driver=driver;
	 }
	 
	 //Locator for Flights from city 1 to city 2
	 By chooseFirstFlight = By.xpath("//body/div[@class='container']/table[@class='table']/tbody/tr[1]/td[1]/input[1]");
	 
	 public void clickFirstAvailableFlight(){
		 driver.findElement(chooseFirstFlight).click();
	 }
}

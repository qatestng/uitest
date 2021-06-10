package driver;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;

import resources.Constants;

public class Driver {

	public static WebDriver driver;
	public Properties prop;

	public WebDriver initializeDriver() throws IOException {

		
		// Initializing firefox driver 
		System.setProperty(Constants.geckoDriverProperty, Constants.geckoDriverExe);
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);

		FirefoxOptions options = new FirefoxOptions();
		options.addArguments("--disable-infobars");
//		FirefoxProfile profile = new FirefoxProfile();
//		profile.setPreference("browser.download.folderList", 2);
//		profile.setPreference("browser.download.dir", "test-output/TestResponse");
//		profile.setPreference("browser.download.useDownloadDir", true);
//		profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/ms-excel");
//		profile.setPreference("pdfjs.disabled", true); // disable the built-in
//														// PDF viewer
//		profile.setPreference("app.update.enabled", false);
//		profile.setPreference("app.update.service.enabled", false);
//		profile.setPreference("app.update.auto", false);
//		profile.setPreference("app.update.staging.enabled", false);
//		profile.setPreference("app.update.silent", false);
//		profile.setPreference("extensions.update.autoUpdate", false);
//		profile.setPreference("extensions.update.autoUpdateEnabled", false);
//		profile.setPreference("extensions.update.enabled", false);
//		profile.setPreference("extensions.update.autoUpdateDefault", false);
//		options.setProfile(profile);

		// options.addArguments("--headless");

		//options.setLegacy(true);
		((Capabilities) options).merge(capabilities);

		driver = new FirefoxDriver(options);

	

	//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;

	}

}

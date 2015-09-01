/* This class sets up the driver for the entire project.
 * I am using this method for driver setup as opposed to 
 * extending the AbstractStepDefinitions class because I
 * think this way works better.
 */

package Driver;

import java.util.concurrent.TimeUnit;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.phantomjs.*;

import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;

import com.gargoylesoftware.htmlunit.BrowserVersion;

public class Driver {

	public static WebDriver driver;
	public static String baseUrl = "http://demo114.thegrandriver.net/"; // "http://qa01.woodland.easydev.us/";
	private boolean acceptNextAlert = true;

	public static WebDriver driver() throws MalformedURLException {
		// Uncomment this section if you would like to use a headless browser,
		// be warned though it does not act like a traditional browser.
		
		/*
		 * System.setProperty("webdriver.phantomjs.driver",
		 * "/Users/joshpartridge/.m2/repository/com/codeborne/phantomjsdriver/1.2.1/phantomjsdriver-1.2.1.jar"
		 * ); System.setProperty("phantomjs.binary.path",
		 * "/Users/Shared/Jenkins/phantomjs-2.0.0-macosx/bin/phantomjs");
		 * DesiredCapabilities caps = new DesiredCapabilities();
		 * caps.setJavascriptEnabled(true); // not really needed: JS enabled by
		 * default caps.setCapability("phantomjs.binary.path",
		 * "/Users/Shared/Jenkins/phantomjs-2.0.0-macosx/bin/phantomjs");
		 * caps.setCapability("takesScreenshot", true); driver = new
		 * PhantomJSDriver(caps); driver.manage().window().maximize();
		 * 
		 * driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 */

		// I was playing around with another headless browser but never got it to work
		// driver = new HtmlUnitDriver();
		
		/*
		 * This is were the fire fox driver is set up with desired capabilities.
		 * You can change the URL to make the driver run on your local host
		 * or have it run on a virtual machine. The shutdown hook at the end makes
		 * it so the driver doesn't have to open and close in between each scenario.
		 */
		DesiredCapabilities capabilities = new DesiredCapabilities();
		FirefoxProfile fp = new FirefoxProfile();
		fp.setPreference("reader.parse-on-load.enabled", false);
		DesiredCapabilities dc = DesiredCapabilities.firefox();
		dc.setCapability(FirefoxDriver.PROFILE, fp);

		final WebDriver driver = new RemoteWebDriver(

		new URL("http://localhost:4444/wd/hub"), dc);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

		Runtime.getRuntime().addShutdownHook(new Thread() {
			public void run() {
				driver.close();
			}
		});

		return driver;
	}

	// Driver teardown, I don't think I ever used this though
	public static void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

	//Sets up baseUrl for the entire project
	public static String getBaseUrl() {
		return baseUrl;
	}

	// Reopens driver is it is null
	public static WebDriver getDriver() {
		if (driver == null) {
			try {
				driver = driver();
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return driver;
	}

}
/*
 * The Abstract file can set up your driver and baseUrl for you,
 * but I decided it would be easier just to create a driver class
 * and import that into all of my step definition files. So this
 * class isn't really used.
 */

package DemoSite.SmokeTests;

import static org.junit.Assert.fail;
import io.appium.java_client.ios.IOSDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.apache.commons.io.FileUtils;

import cucumber.api.java.After;
import Driver.Driver;

public class AbstractPageStepDefinitions {

	public static WebDriver driver;
	public static String baseUrl = "http://demo114.thegrandriver.net/"; // "http://qa01.woodland.easydev.us/";
	private boolean acceptNextAlert = true;
	protected WebDriver getDriver() {

		if (driver == null) {
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
		}
		return driver;
	}

	protected WebDriver tearDown() {
		if (driver != null) {
			driver.quit();
		}
		return driver;
	}

	protected static String getBaseUrl() {
		return baseUrl;
	}

}

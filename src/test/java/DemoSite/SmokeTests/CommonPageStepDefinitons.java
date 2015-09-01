/*
 * I intended this class to be where all the common step definitions were,
 * but I got lazy again and once I wrote out a step definition in another
 * class I pretty much just left it there. There are a couple step definitions
 * that are used in here though
 */

package DemoSite.SmokeTests;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Driver.Driver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

public class CommonPageStepDefinitons {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	// public static WebDriver driver;
	// private String baseUrl = getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;

	// I don't think I ever used this method
	public void goToHomepage() throws Throwable {
		driver.get(baseUrl);
	}

	/*
	 * Before Hook
	 * Sets up the driver for the project and will set it up again if the driver becomes null
	 */
	@Before
	public void setUp() {
		if (driver == null) {
			driver = Driver.getDriver();
		}
		// Deletes all cookies so driver starts fresh
		driver.manage().deleteAllCookies();
		driver.get(baseUrl);
	}

	/*
	 * After Hook
	 * I used this to close down the driver after each scenario but that
	 * wasted a lot of time so instead decided to comment it out.
	 */
	@After
	public void Close() throws Throwable {
		/*
		 * Driver.tearDown(); //driver = new FirefoxDriver(); String
		 * verificationErrorString = verificationErrors.toString();
		 * //System.out.println("After hook ran"); driver = null;
		 * 
		 * if (driver != null){ System.out.println(
		 * "driver is not null for some reason"); }
		 */
	}

	@Given("^I am on the homepage$")
	public void i_am_on_the_homepage() throws Throwable {
		System.out.println(baseUrl);
		driver.navigate().to(baseUrl);
	}

	@Given("^I am on home page$")
	public void i_am_on_home_page() throws Throwable {
		driver.navigate().to(baseUrl);
		assertEquals(driver.getTitle(), "Home page");
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/");
	}
	
	@Given("^I am on homepage$")
	public void i_am_on_homepage() throws Throwable {
		driver.get(baseUrl);
		assertEquals("Home page", driver.getTitle());
		assertEquals("http://demo114.thegrandriver.net/", driver.getCurrentUrl());
	}

	/*
	 * Next section is of all the common methods Selenium IDE puts out to
	 * verify elements and alerts, as opposed to asserting them.
	 */
	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}

}

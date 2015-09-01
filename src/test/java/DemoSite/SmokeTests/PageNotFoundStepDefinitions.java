package DemoSite.SmokeTests;

import org.openqa.selenium.WebDriver;

import DemoSitePageObjects.CrumbTrayPageObjects;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.PageNotFoundPageObjects;
import Driver.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class PageNotFoundStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	public static String text;
	public String winHandleBefore;

	@When("^I type in invalid URL for website$")
	public void i_type_in_invalid_URL_for_website() throws Throwable {
		driver.get(baseUrl + "wrongwrongwrongwrong");
	}

	@When("^press enter$")
	public void press_enter() throws Throwable {
		// this is in previous command
	}

	@Then("^I am taken to Page not found page$")
	public void i_am_taken_to_Page_not_found_page() throws Throwable {
		assertEquals(driver.getTitle(), "404 Not Found");
		assertEquals(PageNotFoundPageObjects.Header(driver).getText().toUpperCase(), "OOPS!");
		assertEquals(PageNotFoundPageObjects.Message(driver).getText(),
				"404 Page not found. You might want to check that URL again or head over to our homepage.");
	}

	@Given("^I am on Page not found page$")
	public void i_am_on_Page_not_found_page() throws Throwable {
		driver.get(baseUrl + "AHHHHHHHH");
		assertEquals(driver.getTitle(), "404 Not Found");
		assertEquals(PageNotFoundPageObjects.Header(driver).getText().toUpperCase(), "OOPS!");
		assertEquals(PageNotFoundPageObjects.Message(driver).getText(),
				"404 Page not found. You might want to check that URL again or head over to our homepage.");
	}

	@When("^I click the homepage link$")
	public void i_click_the_homepage_link() throws Throwable {
		PageNotFoundPageObjects.HomepageLink(driver).click();
	}

	@Then("^I am taken to homepage$")
	public void i_am_taken_to_homepage() throws Throwable {
		assertEquals(driver.getTitle(), "Home page");
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/");
	}

}

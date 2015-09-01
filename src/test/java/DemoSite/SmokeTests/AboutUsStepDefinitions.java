package DemoSite.SmokeTests;

import org.openqa.selenium.WebDriver;

import DemoSitePageObjects.CrumbTrayPageObjects;
import DemoSitePageObjects.GlobalPageObjects;
import Driver.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class AboutUsStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	public static String text;
	public String winHandleBefore;

	@Given("^client website has an about us page$")
	public void client_website_has_an_about_us_page() throws Throwable {
		assertTrue(CrumbTrayPageObjects.AboutUsLink(driver).isDisplayed());
	}

	@When("^I click on the about us link$")
	public void i_click_on_the_about_us_link() throws Throwable {
		CrumbTrayPageObjects.AboutUsLink(driver).click();
	}

	@Then("^I am taken to the about us page$")
	public void i_am_taken_to_the_about_us_page() throws Throwable {
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/about-magento-demo-store/");
		assertEquals(driver.getTitle(), "About Us");
		assertEquals(GlobalPageObjects.LastCategoryTitle(driver).getText().toUpperCase(), "ABOUT US");
	}

}

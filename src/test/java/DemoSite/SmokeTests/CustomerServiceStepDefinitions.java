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

public class CustomerServiceStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	public static String text;
	public String winHandleBefore;

	@Given("^client website has a customer service page$")
	public void client_website_has_a_customer_service_page() throws Throwable {
		assertTrue(CrumbTrayPageObjects.CustomerServiceLink(driver).isDisplayed());
	}

	@When("^I click on the customer service link$")
	public void i_click_on_the_customer_service_link() throws Throwable {
		CrumbTrayPageObjects.CustomerServiceLink(driver).click();
	}

	@Then("^I am taken to the customer service page$")
	public void i_am_taken_to_the_customer_service_page() throws Throwable {
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer-service/");
		assertEquals(driver.getTitle(), "Customer Service");
		assertEquals(GlobalPageObjects.Header(driver).getText().toUpperCase(), "CUSTOMER SERVICE");
	}

}

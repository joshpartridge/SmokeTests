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

public class PrivacyPolicyStepDefinitions {
	
	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	public static String text;
	public String winHandleBefore;
	
	@Given("^client website has a privacy policy page$")
	public void client_website_has_a_privacy_policy_page() throws Throwable {
		assertTrue(CrumbTrayPageObjects.PrivacyPolicyLink(driver).isDisplayed());
	}

	@When("^I click on the privacy policy link$")
	public void i_click_on_the_privacy_policy_link() throws Throwable {
		CrumbTrayPageObjects.PrivacyPolicyLink(driver).click();
	}

	@Then("^I am taken to the privacy policy page$")
	public void i_am_taken_to_the_privacy_policy_page() throws Throwable {
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/privacy-policy-cookie-restriction-mode/");
	    assertEquals(driver.getTitle(), "Privacy Policy");
	    assertEquals(GlobalPageObjects.LastCategoryTitle(driver).getText().toUpperCase(), "PRIVACY POLICY");
	    assertEquals(GlobalPageObjects.Header(driver).getText().toUpperCase(), "PRIVACY POLICY");
	}

}

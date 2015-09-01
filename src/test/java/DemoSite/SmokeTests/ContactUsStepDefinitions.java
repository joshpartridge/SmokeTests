package DemoSite.SmokeTests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.lang3.text.WordUtils;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.regex.Pattern;

import org.openqa.selenium.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import DemoSitePageObjects.AccessoriesPageObjects;
import DemoSitePageObjects.AccountInformationPageObjects;
import DemoSitePageObjects.AccountLinkPageObjects;
import DemoSitePageObjects.AddressBookPageObjects;
import DemoSitePageObjects.CategoryPageObjects;
import DemoSitePageObjects.CategoryStaticContentPageObjects;
import DemoSitePageObjects.ComparePopupPageObjects;
import DemoSitePageObjects.ContactUsPageObjects;
import DemoSitePageObjects.CrumbTrayPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.MiniCartObjects;
import DemoSitePageObjects.MyAccountPageObjects;
import DemoSitePageObjects.NotLoggedInCheckoutPageObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
import DemoSitePageObjects.WishlistPageObjects;
import Driver.Driver;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.GlobalProductPageObjects;
import DemoSitePageObjects.LoginPageObjects;

public class ContactUsStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	public static String text;
	public String winHandleBefore;

	@When("^I click on the Contact link$")
	public void i_click_on_the_Contact_link() throws Throwable {
		CrumbTrayPageObjects.ContactUsLink(driver).click();
	}

	@Then("^I am taken to contact page$")
	public void i_am_taken_to_contact_page() throws Throwable {
		assertEquals("Contact Us", driver.getTitle());
		assertEquals("http://demo114.thegrandriver.net/contacts/", driver.getCurrentUrl());
		assertEquals("CONTACT US", ContactUsPageObjects.ContactUsHeader(driver).getText().toUpperCase());
	}

	@Given("^I am on Contact page$")
	public void i_am_on_Contact_page() throws Throwable {
		CrumbTrayPageObjects.ContactUsLink(driver).click();
		assertEquals("Contact Us", driver.getTitle());
		assertEquals("http://demo114.thegrandriver.net/contacts/", driver.getCurrentUrl());
		assertEquals("CONTACT US", ContactUsPageObjects.ContactUsHeader(driver).getText().toUpperCase());
	}

	@When("^I fill out all the contact fields correctly$")
	public void i_fill_out_all_the_contact_fields_correctly() throws Throwable {
		ContactUsPageObjects.NameField(driver).clear();
		ContactUsPageObjects.NameField(driver).sendKeys("test test");
		ContactUsPageObjects.EmailField(driver).clear();
		ContactUsPageObjects.EmailField(driver).sendKeys("test@test.com");
		ContactUsPageObjects.TelephoneField(driver).clear();
		ContactUsPageObjects.TelephoneField(driver).sendKeys("1234567890");
		ContactUsPageObjects.CommentField(driver).clear();
		ContactUsPageObjects.CommentField(driver).sendKeys("test TEST test");
	}

	@When("^press the Submit button$")
	public void press_the_Submit_button() throws Throwable {
		ContactUsPageObjects.SubmitButton(driver).click();
	}

	@Then("^contact form is successfully submitted$")
	public void contact_form_is_successfully_submitted() throws Throwable {
		assertTrue(ContactUsPageObjects.SuccessMessage(driver).isDisplayed());
		assertEquals(
				"Your inquiry was submitted and will be responded to as soon as possible. Thank you for contacting us.",
				ContactUsPageObjects.SuccessMessage(driver).getText());
	}

}

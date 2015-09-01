package DemoSite.SmokeTests;

import static org.junit.Assert.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
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
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.MiniCartObjects;
import DemoSitePageObjects.MyAccountPageObjects;
import DemoSitePageObjects.NotLoggedInCheckoutPageObjects;
import Driver.Driver;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.LoginPageObjects;

public class MyAccountStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;

	@When("^I click on the My Account link$")
	public void i_click_on_the_My_Account_link() throws Throwable {
		driver.get(baseUrl);
		GlobalPageObjects.AccountLink(driver).click();
		AccountLinkPageObjects.MyAccountLink(driver).click();
	}

	@Then("^I am taken to the My Account page$")
	public void i_am_taken_to_the_My_Account_page() throws Throwable {
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/");
		assertEquals(driver.getTitle(), "My Account");
		assertEquals(MyAccountPageObjects.MyAccountHeader(driver).getText().toUpperCase(), "MY DASHBOARD");

	}

	@Given("^I am on My Account Dashboard page$")
	public void i_am_on_My_Account_Dashboard_page() throws Throwable {
		GlobalPageObjects.AccountLink(driver).click();
		AccountLinkPageObjects.MyAccountLink(driver).click();
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/");
		assertEquals(driver.getTitle(), "My Account");
		assertEquals(MyAccountPageObjects.MyAccountHeader(driver).getText().toUpperCase(), "MY DASHBOARD");
	}

	@Given("^I want to Edit my contact information$")
	public void i_want_to_Edit_my_contact_information() throws Throwable {
		// heck yes I want to edit my contact information
	}

	@When("^I click on the edit contact link$")
	public void i_click_on_the_edit_contact_link() throws Throwable {
		MyAccountPageObjects.EditContactInformationLink(driver).click();
	}

	@When("^I click on the edit address link$")
	public void i_click_on_the_edit_address_link() throws Throwable {
		MyAccountPageObjects.EditBillingAddressLink(driver).click();
	}

	@Then("^I am able to successfully edit my contact information$")
	public void i_am_able_to_successfully_edit_my_contact_information() throws Throwable {
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/edit/");
		assertEquals(driver.getTitle(), "Account Information");
		assertEquals(AccountInformationPageObjects.AccountInformationHeader(driver).getText().toUpperCase(),
				"EDIT ACCOUNT INFORMATION");

		// These if else statements switch the contact information back and forth every test
		if ("Mr.".equals(AccountInformationPageObjects.PrefixField(driver).getAttribute("value"))) {

			AccountInformationPageObjects.PrefixField(driver).clear();
			AccountInformationPageObjects.PrefixField(driver).sendKeys("Ms.");
			AccountInformationPageObjects.FirstNameField(driver).clear();
			AccountInformationPageObjects.FirstNameField(driver).sendKeys("Testy");
			AccountInformationPageObjects.MiddleNameField(driver).clear();
			AccountInformationPageObjects.MiddleNameField(driver).sendKeys("L.");
			AccountInformationPageObjects.LastNameField(driver).clear();
			AccountInformationPageObjects.LastNameField(driver).sendKeys("McTestershorts");
			AccountInformationPageObjects.SuffixField(driver).clear();
			AccountInformationPageObjects.SuffixField(driver).sendKeys("II");

			new Select(AccountInformationPageObjects.GenderDropdown(driver)).selectByVisibleText("Female");

			AccountInformationPageObjects.SaveButton(driver).click();

			assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/");
			assertEquals(driver.getTitle(), "My Account");
			assertEquals(MyAccountPageObjects.MyAccountHeader(driver).getText().toUpperCase(), "MY DASHBOARD");
			assertEquals(GlobalPageObjects.WelcomeMessage(driver).getText().toUpperCase(),
					"WELCOME, MS. TESTY L. MCTESTERSHORTS II!");
			assertEquals(MyAccountPageObjects.HelloMessage(driver).getText(), "Hello, Ms. Testy L. McTestershorts II!");
			assertTrue(MyAccountPageObjects.SuccessMessage(driver).isDisplayed());
			assertEquals(MyAccountPageObjects.SuccessMessageText(driver).getText(),
					"The account information has been saved.");

			MyAccountPageObjects.AccountInformationLink(driver).click();

			assertEquals(AccountInformationPageObjects.PrefixField(driver).getAttribute("value"), "Ms.");
			assertEquals(AccountInformationPageObjects.FirstNameField(driver).getAttribute("value"), "Testy");
			assertEquals(AccountInformationPageObjects.MiddleNameField(driver).getAttribute("value"), "L.");
			assertEquals(AccountInformationPageObjects.LastNameField(driver).getAttribute("value"), "McTestershorts");
			assertEquals(AccountInformationPageObjects.SuffixField(driver).getAttribute("value"), "II");
			assertEquals(AccountInformationPageObjects.GenderDropdown(driver).getAttribute("value"), "2");
		}

		else if ("Ms.".equals(AccountInformationPageObjects.PrefixField(driver).getAttribute("value"))) {

			AccountInformationPageObjects.PrefixField(driver).clear();
			AccountInformationPageObjects.PrefixField(driver).sendKeys("Mr.");
			AccountInformationPageObjects.FirstNameField(driver).clear();
			AccountInformationPageObjects.FirstNameField(driver).sendKeys("Testy");
			AccountInformationPageObjects.MiddleNameField(driver).clear();
			AccountInformationPageObjects.MiddleNameField(driver).sendKeys("J.");
			AccountInformationPageObjects.LastNameField(driver).clear();
			AccountInformationPageObjects.LastNameField(driver).sendKeys("McTesterpants");
			AccountInformationPageObjects.SuffixField(driver).clear();
			AccountInformationPageObjects.SuffixField(driver).sendKeys("III");

			new Select(AccountInformationPageObjects.GenderDropdown(driver)).selectByVisibleText("Male");

			AccountInformationPageObjects.SaveButton(driver).click();

			assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/");
			assertEquals(driver.getTitle(), "My Account");
			assertEquals(MyAccountPageObjects.MyAccountHeader(driver).getText().toUpperCase(), "MY DASHBOARD");
			assertEquals(GlobalPageObjects.WelcomeMessage(driver).getText().toUpperCase(),
					"WELCOME, MR. TESTY J. MCTESTERPANTS III!");
			assertEquals(MyAccountPageObjects.HelloMessage(driver).getText(), "Hello, Mr. Testy J. McTesterpants III!");
			assertTrue(MyAccountPageObjects.SuccessMessage(driver).isDisplayed());
			assertEquals(MyAccountPageObjects.SuccessMessageText(driver).getText(),
					"The account information has been saved.");

			MyAccountPageObjects.AccountInformationLink(driver).click();

			assertEquals(AccountInformationPageObjects.PrefixField(driver).getAttribute("value"), "Mr.");
			assertEquals(AccountInformationPageObjects.FirstNameField(driver).getAttribute("value"), "Testy");
			assertEquals(AccountInformationPageObjects.MiddleNameField(driver).getAttribute("value"), "J.");
			assertEquals(AccountInformationPageObjects.LastNameField(driver).getAttribute("value"), "McTesterpants");
			assertEquals(AccountInformationPageObjects.SuffixField(driver).getAttribute("value"), "III");
			assertEquals(AccountInformationPageObjects.GenderDropdown(driver).getAttribute("value"), "1");
		}

	}

	@Given("^I want to Edit my address information$")
	public void i_want_to_Edit_my_address_information() throws Throwable {
		// I guess I want to edit my address
	}

	@Then("^I am able to successfully edit my address information$")
	public void i_am_able_to_successfully_edit_my_address_information() throws Throwable {
		assertEquals(driver.getTitle(), "Edit Address");
		assertEquals(AddressBookPageObjects.AddressBookHeader(driver).getText().toUpperCase(), "EDIT ADDRESS");

		// Change address blah blah back and forth blah blah each test
		if ("456 Your Mom's House".equals(AddressBookPageObjects.StreetAddressField(driver).getAttribute("value"))) {

			AddressBookPageObjects.TelephoneField(driver).clear();
			AddressBookPageObjects.TelephoneField(driver).sendKeys("1234567890");
			AddressBookPageObjects.StreetAddressField(driver).clear();
			AddressBookPageObjects.StreetAddressField(driver).sendKeys("123 My Mom's House");
			AddressBookPageObjects.CityField(driver).clear();
			AddressBookPageObjects.CityField(driver).sendKeys("Brighton");
			new Select(AddressBookPageObjects.CountryDropdown(driver)).selectByVisibleText("United States");
			new Select(AddressBookPageObjects.StateDropdown(driver)).selectByVisibleText("Michigan");
			AddressBookPageObjects.PostalCodeField(driver).clear();
			AddressBookPageObjects.PostalCodeField(driver).sendKeys("48116");

			AddressBookPageObjects.SaveAddressButton(driver).click();

			assertTrue(AddressBookPageObjects.SuccessMessage(driver).isDisplayed());
			assertEquals(AddressBookPageObjects.SuccessMessageText(driver).getText(), "The address has been saved.");

			MyAccountPageObjects.AccountDashboardLink(driver).click();
			MyAccountPageObjects.EditShippingAddressLink(driver).click();

			assertEquals(AddressBookPageObjects.TelephoneField(driver).getAttribute("value"), "1234567890");
			assertEquals(AddressBookPageObjects.StreetAddressField(driver).getAttribute("value"), "123 My Mom's House");
			assertEquals(AddressBookPageObjects.CityField(driver).getAttribute("value"), "Brighton");
			assertEquals(AddressBookPageObjects.CountryDropdown(driver).getAttribute("value"), "US");
			assertEquals(AddressBookPageObjects.StateDropdown(driver).getAttribute("value"), "33");
			assertEquals(AddressBookPageObjects.PostalCodeField(driver).getAttribute("value"), "48116");
		}

		else if ("123 My Mom's House".equals(AddressBookPageObjects.StreetAddressField(driver).getAttribute("value"))) {

			AddressBookPageObjects.TelephoneField(driver).clear();
			AddressBookPageObjects.TelephoneField(driver).sendKeys("0987654321");
			AddressBookPageObjects.StreetAddressField(driver).clear();
			AddressBookPageObjects.StreetAddressField(driver).sendKeys("456 Your Mom's House");
			AddressBookPageObjects.CityField(driver).clear();
			AddressBookPageObjects.CityField(driver).sendKeys("Quebec City");
			new Select(AddressBookPageObjects.CountryDropdown(driver)).selectByVisibleText("Canada");
			new Select(AddressBookPageObjects.StateDropdown(driver)).selectByVisibleText("Quebec");
			AddressBookPageObjects.PostalCodeField(driver).clear();
			AddressBookPageObjects.PostalCodeField(driver).sendKeys("L6J5E4");

			AddressBookPageObjects.SaveAddressButton(driver).click();

			assertTrue(AddressBookPageObjects.SuccessMessage(driver).isDisplayed());
			assertEquals(AddressBookPageObjects.SuccessMessageText(driver).getText(), "The address has been saved.");

			MyAccountPageObjects.AccountDashboardLink(driver).click();
			MyAccountPageObjects.EditShippingAddressLink(driver).click();

			assertEquals(AddressBookPageObjects.TelephoneField(driver).getAttribute("value"), "0987654321");
			assertEquals(AddressBookPageObjects.StreetAddressField(driver).getAttribute("value"),
					"456 Your Mom's House");
			assertEquals(AddressBookPageObjects.CityField(driver).getAttribute("value"), "Quebec City");
			assertEquals(AddressBookPageObjects.CountryDropdown(driver).getAttribute("value"), "CA");
			assertEquals(AddressBookPageObjects.StateDropdown(driver).getAttribute("value"), "76");
			assertEquals(AddressBookPageObjects.PostalCodeField(driver).getAttribute("value"), "L6J5E4");
		}

	}

}

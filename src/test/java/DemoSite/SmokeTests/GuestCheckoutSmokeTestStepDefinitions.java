package DemoSite.SmokeTests;

import static org.junit.Assert.assertTrue;

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
import DemoSitePageObjects.AccountLinkPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.MiniCartObjects;
import DemoSitePageObjects.NotLoggedInCheckoutPageObjects;
import Driver.Driver;
import DemoSitePageObjects.GlobalPageObjects;

public class GuestCheckoutSmokeTestStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;

	@Given("^I am not a registered user$")
	public void i_am_not_a_registered_user() throws Throwable {
		// Don't really need code here since user will be logged out when the browser opens
	}

	@When("^click on the checkout button$")
	public void click_on_the_checkout_button() throws Throwable {
		MiniCartObjects.CheckoutButton(driver).click();
	}

	@Then("^I am taken to Checkout page$")
	public void i_am_taken_to_Checkout_page() throws Throwable {
		assertTrue(NotLoggedInCheckoutPageObjects.CheckoutOnepageTitle(driver)
				.equals(NotLoggedInCheckoutPageObjects.SupposedCheckoutOnepageTitle()));
	}

	@Then("^options are displayed to checkout as guest, register and checkout, or login as a returning customer\\.$")
	public void options_are_displayed_to_checkout_as_guest_register_and_checkout_or_login_as_a_returning_customer()
			/*
			 * Instead of asserting I used verifications here to make sure elements are displayed.
			 * While verifying is better because it makes it so other steps aren't skipped if 
			 * one step fails, it takes more code and looks messier. I think I'll just stick to
			 * assertions.
			 */
			throws Throwable {
		try {
			assertTrue(NotLoggedInCheckoutPageObjects.CheckoutasGuestOption(driver).isDisplayed());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		try {
			assertTrue(NotLoggedInCheckoutPageObjects.RegisterandCheckoutOption(driver).isDisplayed());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		try {
			assertTrue(NotLoggedInCheckoutPageObjects.ContinueButton(driver).isDisplayed());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		try {
			assertTrue(NotLoggedInCheckoutPageObjects.EmailAddressField(driver).isDisplayed());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		try {
			assertTrue(NotLoggedInCheckoutPageObjects.PasswordField(driver).isDisplayed());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		try {
			assertTrue(NotLoggedInCheckoutPageObjects.ForgotyourpasswordLink(driver).isDisplayed());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
		try {
			assertTrue(NotLoggedInCheckoutPageObjects.LoginButton(driver).isDisplayed());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	@Given("^I am on checkout page$")
	public void i_am_on_checkout_page() throws Throwable {
		GlobalPageObjects.AccountLink(driver).click();
		AccountLinkPageObjects.CheckoutLink(driver).click();
		try {
			assertTrue(NotLoggedInCheckoutPageObjects.CheckoutOnepageTitle(driver)
					.equals(NotLoggedInCheckoutPageObjects.SupposedCheckoutOnepageTitle()));
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	@When("^I checkout as a guest$")
	public void i_checkout_as_a_guest() throws Throwable {
		NotLoggedInCheckoutPageObjects.CheckoutasGuestOption(driver).click();
		NotLoggedInCheckoutPageObjects.ContinueButton(driver).click();
	}

	@Then("^I am able to complete my purchase$")
	public void i_am_able_to_complete_my_purchase() throws Throwable {
		/*
		 * While progressing through the checkout I was running into problems where
		 * selenium was looking for elements too quickly so I wrote some code blocks
		 * to wait until an element is visible before continuing on.
		 */
		
		// Verify Continue button on Billing info is visible
		for (int second = 0;; second++) {
			if (second >= 30)
				fail("timeout");
			try {
				if (isElementPresent(NotLoggedInCheckoutPageObjects.ContinueButtonBilling(driver)))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
			System.out.println("button was successfully verified");
		}

		NotLoggedInCheckoutPageObjects.PrefixFieldBilling(driver).sendKeys("Mr.");
		NotLoggedInCheckoutPageObjects.FirstNameFieldBilling(driver).sendKeys("Testy");
		NotLoggedInCheckoutPageObjects.MiddleNameFieldBilling(driver).sendKeys("J");
		NotLoggedInCheckoutPageObjects.LastNameFieldBilling(driver).sendKeys("McTesterPants");
		NotLoggedInCheckoutPageObjects.SuffixFieldBilling(driver).sendKeys("The Third");
		NotLoggedInCheckoutPageObjects.CompanyFieldBilling(driver).sendKeys("Prestige Worldwide");
		NotLoggedInCheckoutPageObjects.EmailAddressFieldBilling(driver).sendKeys("test@test.com");
		NotLoggedInCheckoutPageObjects.AddressFieldBilling(driver).sendKeys("123 Street");
		NotLoggedInCheckoutPageObjects.CityFieldBilling(driver).sendKeys("Citysville");
		new Select(NotLoggedInCheckoutPageObjects.StateDropdownBilling(driver)).selectByVisibleText("Michigan");
		NotLoggedInCheckoutPageObjects.ZipFieldBilling(driver).sendKeys("48103");
		NotLoggedInCheckoutPageObjects.TelephoneFieldBilling(driver).sendKeys("1234567890");

		// Captcha
		/*
		 * This is where the user will manually need to input the captcha text.
		 * This block of code gives the user 30 seconds to input the text and
		 * gives alerts with how much time is remaining
		 */

		NotLoggedInCheckoutPageObjects.CaptchaFieldBilling(driver).click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",
				NotLoggedInCheckoutPageObjects.CaptchaFieldBilling(driver));
		Thread.sleep(500);
		System.out.println("You have 30 seconds to type in the captcha so make sure you do it!");
		for (int second = 0;; second++) {
			if (second == 10)
				System.out.println("20 seconds remaining");
			if (second == 20)
				System.out.println("10 SECONDS REMAINING!");
			if (second == 25)
				System.out.println("I hope you filled out the captcha or else this test is going to fail");
			if (second == 30)
				try {
					NotLoggedInCheckoutPageObjects.ShiptothisaddressOptionsBilling(driver).click();

					NotLoggedInCheckoutPageObjects.ContinueButtonBilling(driver).click();
					break;
				} catch (Exception e) {
				}
			Thread.sleep(1000);
		}

		NotLoggedInCheckoutPageObjects.ContinueButtonBilling(driver).click();

		// Verify Continue button on shipping method is visible
		for (int second = 0;; second++) {
			if (second >= 30)
				fail("timeout");
			try {
				if (isElementPresent(NotLoggedInCheckoutPageObjects.ContinueButtonShippingMethod(driver)))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}
		NotLoggedInCheckoutPageObjects.ContinueButtonShippingMethod(driver).click();

		// Verify Continue button on Payment info is visible
		for (int second = 0;; second++) {
			if (second >= 30)
				fail("timeout");
			try {
				if (isElementPresent(NotLoggedInCheckoutPageObjects.ContinueButtonPayment(driver)))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}

		NotLoggedInCheckoutPageObjects.CreditCardOption(driver).click();
		new Select(NotLoggedInCheckoutPageObjects.CreditCardTypeDropdownPayment(driver)).selectByVisibleText("Visa");
		NotLoggedInCheckoutPageObjects.CreditCardNumberFieldPayment(driver).sendKeys("4111111111111111");
		new Select(NotLoggedInCheckoutPageObjects.ExpirationDateMonthDropdownPayment(driver))
				.selectByVisibleText("10 - October");
		new Select(NotLoggedInCheckoutPageObjects.ExpirationDateYearDropdownPayment(driver))
				.selectByVisibleText("2022");
		NotLoggedInCheckoutPageObjects.ContinueButtonPayment(driver).click();

		// Verify Continue button on Payment info is visible
		for (int second = 0;; second++) {
			if (second >= 30)
				fail("timeout");
			try {
				if (isElementPresent(NotLoggedInCheckoutPageObjects.PlaceOrderButtonReview(driver)))
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}

		NotLoggedInCheckoutPageObjects.PlaceOrderButtonReview(driver).click();

		// Verify inactive account error is visible
		for (int second = 0;; second++) {
			if (second >= 30)
				fail("timeout");
			try {
				if (isAlertPresent())
					break;
			} catch (Exception e) {
			}
			Thread.sleep(1000);
		}

		// Last assertion
		assertEquals(
				"Gateway error: (TESTMODE) The merchant login ID or password is invalid or the account is inactive.",
				closeAlertAndGetItsText());
	}

	private void FindElement(WebElement webElement) {

	}

	private boolean isElementPresent(WebElement webElement) {
		try {
			FindElement(webElement);
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

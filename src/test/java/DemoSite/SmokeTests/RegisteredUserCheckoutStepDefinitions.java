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
import DemoSitePageObjects.AccountLinkPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.MiniCartObjects;
import DemoSitePageObjects.NotLoggedInCheckoutPageObjects;
import Driver.Driver;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.LoginPageObjects;

public class RegisteredUserCheckoutStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;

	@Given("^I am a registered user$")
	public void i_am_a_registered_user() throws Throwable {
		// I love being registered
	}

	@Given("^I am logged in$")
	public void i_am_logged_in() throws Throwable {
		GlobalPageObjects.AccountLink(driver).click();
		AccountLinkPageObjects.LogInLink(driver).click();
		assertEquals(driver.getTitle(), "Customer Login");
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/login/");
		assertEquals(LoginPageObjects.LoginTitle(driver).getText().toUpperCase(), "LOGIN OR CREATE AN ACCOUNT");

		LoginPageObjects.EmailAddressField(driver).clear();
		LoginPageObjects.EmailAddressField(driver).sendKeys("josh.partridge@perficient.com");
		LoginPageObjects.PasswordField(driver).clear();
		LoginPageObjects.PasswordField(driver).sendKeys("blah5380");
		LoginPageObjects.LoginButton(driver).click();

		assertEquals(driver.getTitle(), "My Account");
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/");
		
		// Used an if statement here because in one of my other tests I change
		// my name
		if (GlobalPageObjects.WelcomeMessage(driver).getText().toUpperCase().contains("MR")) {
			assertEquals(GlobalPageObjects.WelcomeMessage(driver).getText().toUpperCase(),
					"WELCOME, MR. TESTY J. MCTESTERPANTS III!");
		} else if (GlobalPageObjects.WelcomeMessage(driver).getText().toUpperCase().contains("MS")) {
			assertEquals(GlobalPageObjects.WelcomeMessage(driver).getText().toUpperCase(),
					"WELCOME, MS. TESTY L. MCTESTERSHORTS II!");
		}

		GlobalPageObjects.HomeLogo(driver).click();
	}

	@Given("^I am not logged in$")
	public void i_am_not_logged_in() throws Throwable {
		GlobalPageObjects.AccountLink(driver).click();
		assertEquals(AccountLinkPageObjects.LogInLink(driver).getText(), "Log In");
		GlobalPageObjects.AccountLink(driver).click();
	}

	@When("^I checkout as a registered user$")
	public void i_checkout_as_a_registered_user() throws Throwable {
		GlobalPageObjects.CartLink(driver).click();
		MiniCartObjects.CheckoutButton(driver).click();
		assertEquals(driver.getTitle(), "Checkout");
	}

	@Then("^There is no option for guest checkout$")
	public void there_is_no_option_for_guest_checkout() throws Throwable {
		assertFalse(isElementPresent(By.id("login:guest")));
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

	@Then("^I am able to complete my purchase as a registered user$")
	public void i_am_able_to_complete_my_purchase_as_a_registered_user() throws Throwable {
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
		
		// I commented all this stuff out because this is for guest checkout

		/*
		 * NotLoggedInCheckoutPageObjects.PrefixFieldBilling(driver).sendKeys(
		 * "Mr."); NotLoggedInCheckoutPageObjects.FirstNameFieldBilling(driver).
		 * sendKeys( "Testy");
		 * NotLoggedInCheckoutPageObjects.MiddleNameFieldBilling(driver).
		 * sendKeys( "J");
		 * NotLoggedInCheckoutPageObjects.LastNameFieldBilling(driver).sendKeys(
		 * "McTesterPants");
		 * NotLoggedInCheckoutPageObjects.SuffixFieldBilling(driver).sendKeys(
		 * "The Third");
		 * NotLoggedInCheckoutPageObjects.CompanyFieldBilling(driver).sendKeys(
		 * "Prestige Worldwide");
		 * NotLoggedInCheckoutPageObjects.EmailAddressFieldBilling(driver)
		 * .sendKeys("test@test.com");
		 * NotLoggedInCheckoutPageObjects.AddressFieldBilling(driver).sendKeys(
		 * "123 Street");
		 * 
		 * NotLoggedInCheckoutPageObjects.CityFieldBilling(driver).sendKeys(
		 * "Citysville");
		 * 
		 * new Select(
		 * NotLoggedInCheckoutPageObjects.StateDropdownBilling(driver))
		 * .selectByVisibleText("Michigan");
		 * 
		 * NotLoggedInCheckoutPageObjects.ZipFieldBilling(driver).sendKeys(
		 * "48103");
		 * 
		 * NotLoggedInCheckoutPageObjects.TelephoneFieldBilling(driver).sendKeys
		 * ("1234567890");
		 * 
		 * // Captcha /* This is where the user will manually need to input the
		 * captcha text. This block of code gives the user 30 seconds to input
		 * the text and gives alerts with how much time is remaining
		 */

		/*
		 * NotLoggedInCheckoutPageObjects.CaptchaFieldBilling(driver).click();
		 * 
		 * ((JavascriptExecutor) driver).executeScript(
		 * "arguments[0].scrollIntoView(true);",
		 * NotLoggedInCheckoutPageObjects.CaptchaFieldBilling(driver));
		 * Thread.sleep(500); System.out .println(
		 * "You have 30 seconds to type in the captcha so make sure you do it!"
		 * ); for (int second = 0;; second++) { if (second == 10)
		 * System.out.println("20 seconds remaining"); if (second == 20)
		 * System.out.println("10 SECONDS REMAINING!"); if (second == 25)
		 * System.out .println(
		 * "I hope you filled out the captcha or else this test is going to fail"
		 * ); if (second == 30) try { NotLoggedInCheckoutPageObjects
		 * .ShiptothisaddressOptionsBilling(driver).click();
		 * 
		 * NotLoggedInCheckoutPageObjects
		 * .ContinueButtonBilling(driver).click(); break; } catch (Exception e)
		 * { } Thread.sleep(1000);
		 * 
		 * }
		 */
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
	
	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

}

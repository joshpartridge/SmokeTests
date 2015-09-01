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

public class LoginStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;

	@Given("^I am on client website$")
	public void i_am_on_client_website() throws Throwable {
		driver.get(baseUrl);
	}

	@Given("^I am not logged into an account$")
	public void i_am_not_logged_into_an_account() throws Throwable {
		GlobalPageObjects.AccountLink(driver).click();
		assertEquals(AccountLinkPageObjects.LogInLink(driver).getText(), "Log In");
		GlobalPageObjects.AccountLink(driver).click();
	}

	@When("^I click on login/register link$")
	public void i_click_on_login_register_link() throws Throwable {
		GlobalPageObjects.AccountLink(driver).click();
		AccountLinkPageObjects.LogInLink(driver).click();
	}

	@Then("^I am taken to login or create an Account page$")
	public void i_am_taken_to_login_or_create_an_Account_page() throws Throwable {
		assertEquals(driver.getTitle(), "Customer Login");
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/login/");
		assertEquals(LoginPageObjects.LoginTitle(driver).getText().toUpperCase(), "LOGIN OR CREATE AN ACCOUNT");
	}

	@Given("^I am on Login or Create an Account page$")
	public void i_am_on_Login_or_Create_an_Account_page() throws Throwable {
		GlobalPageObjects.AccountLink(driver).click();
		AccountLinkPageObjects.LogInLink(driver).click();
		assertEquals(driver.getTitle(), "Customer Login");
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/login/");
		assertEquals(LoginPageObjects.LoginTitle(driver).getText().toUpperCase(), "LOGIN OR CREATE AN ACCOUNT");
	}

	@When("^I put in my credentials$")
	public void i_put_in_my_credentials() throws Throwable {
		LoginPageObjects.EmailAddressField(driver).clear();
		LoginPageObjects.EmailAddressField(driver).sendKeys("josh.partridge@perficient.com");
		LoginPageObjects.PasswordField(driver).clear();
		LoginPageObjects.PasswordField(driver).sendKeys("blah5380");
	}

	@When("^click on the login button$")
	public void click_on_the_login_button() throws Throwable {
		LoginPageObjects.LoginButton(driver).click();
	}

	@Then("^I am able to successfully log in$")
	public void i_am_able_to_successfully_log_in() throws Throwable {
		assertEquals(driver.getTitle(), "My Account");
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/");
		
		// Used an if statement here because in one of my other tests I change my name
		if (GlobalPageObjects.WelcomeMessage(driver).getText().toUpperCase().contains("MR")){
			assertEquals(GlobalPageObjects.WelcomeMessage(driver).getText().toUpperCase(),
					"WELCOME, MR. TESTY J. MCTESTERPANTS III!");
		}
		else if (GlobalPageObjects.WelcomeMessage(driver).getText().toUpperCase().contains("MS")){
			assertEquals(GlobalPageObjects.WelcomeMessage(driver).getText().toUpperCase(),
					"WELCOME, MS. TESTY L. MCTESTERSHORTS II!");
		}
	}

}

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
import DemoSitePageObjects.AccessoriesShoesPageObjects;
import DemoSitePageObjects.AccountLinkPageObjects;
import DemoSitePageObjects.CategoryPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.MiniCartObjects;
import DemoSitePageObjects.NotLoggedInCheckoutPageObjects;
import Driver.Driver;
import DemoSitePageObjects.GlobalPageObjects;

public class HomeLogoStepDefinitons {

	private WebDriver driver = Driver.driver;
	private String baseUrl = Driver.getBaseUrl();
	// private String baseUrl = getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;

	@Given("^I am on any page on the site$")
	public void i_am_on_any_page_on_the_site() throws Throwable {
		Actions a1 = new Actions(driver);
		a1.moveToElement(MainNavObjects.MainNavAccessoriesLink(driver)).build().perform();
		MainNavObjects.MainNavAccessoriesShoes(driver).click();
		assertEquals(driver.getTitle(), AccessoriesShoesPageObjects.SupposedAccessoriesShoesPageTitle());
		CategoryPageObjects.ThirdProductImage(driver).click();
	}

	@When("^I click the company logo$")
	public void i_click_the_company_logo() throws Throwable {
		GlobalPageObjects.HomeLogo(driver).click();
	}

	@Then("^I am taken to site homepage$")
	public void i_am_taken_to_site_homepage() throws Throwable {
		assertEquals(driver.getTitle(), "Home page");
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/");
	}

}

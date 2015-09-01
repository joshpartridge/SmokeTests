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

public class WishlistStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	public static String text;

	@When("^I click on the Add to Wishlist link$")
	public void i_click_on_the_Add_to_Wishlist_link() throws Throwable {
		GlobalProductPageObjects.AddtoWishlistLink(driver).click();
	}

	@Then("^I am directed to login/create an account page$")
	public void i_am_directed_to_login_create_an_account_page() throws Throwable {
		assertEquals(driver.getTitle(), "Customer Login");
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/login/");
		assertEquals(LoginPageObjects.LoginTitle(driver).getText().toUpperCase(), "LOGIN OR CREATE AN ACCOUNT");
	}

	@Given("^I am on Category page$")
	public void i_am_on_Category_page() throws Throwable {
		MainNavObjects.MainNavSportingGoodsLink(driver).click();
		assertEquals(driver.getTitle(), "Sporting Goods");
		assertEquals(CategoryPageObjects.CategoryPageTitle(driver).toUpperCase(), "SPORTING GOODS");
	}

	@When("^I click on the Add to Wishlist link under a product$")
	public void i_click_on_the_Add_to_Wishlist_link_under_a_product() throws Throwable {
		text = WordUtils.capitalizeFully(CategoryPageObjects.SecondProductLinkText(driver).toLowerCase());
		CategoryPageObjects.SecondProductAddToWishlistLink(driver).click();
		CategoryPageObjects.SecondProductFirstWishlistLink(driver).click();

	}

	@Then("^that product is added to my wishlist$")
	public void that_product_is_added_to_my_wishlist() throws Throwable {
		assertTrue(WishlistPageObjects.SuccessMessage(driver).isDisplayed());
		assertEquals(WishlistPageObjects.SuccessMessage(driver).getText().toLowerCase(),
				text.toLowerCase() + " has been added to your wishlist. click here to continue shopping.");
		assertTrue(driver.findElement(By.cssSelector("h3.product-name > a[title=\"" + text + "\"]")).isDisplayed());

	}

	@Then("^I am directed to my wishlist page$")
	public void i_am_directed_to_my_wishlist_page() throws Throwable {
		assertEquals(driver.getTitle(), "My Wishlists");
		assertEquals(WishlistPageObjects.WishlistHeader(driver).getText().toUpperCase(), "MY WISHLISTS");
	}

}

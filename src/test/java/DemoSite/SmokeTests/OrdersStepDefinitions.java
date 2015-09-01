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
import DemoSitePageObjects.AccessoriesBagsLuggagePageObjects;
import DemoSitePageObjects.AccessoriesEyewearPageObjects;
import DemoSitePageObjects.AccessoriesJewelryPageObjects;
import DemoSitePageObjects.AccessoriesPageObjects;
import DemoSitePageObjects.AccessoriesShoesPageObjects;
import DemoSitePageObjects.AccountInformationPageObjects;
import DemoSitePageObjects.AccountLinkPageObjects;
import DemoSitePageObjects.AddressBookPageObjects;
import DemoSitePageObjects.CategoryPageObjects;
import DemoSitePageObjects.CategoryStaticContentPageObjects;
import DemoSitePageObjects.ComparePopupPageObjects;
import DemoSitePageObjects.ContactUsPageObjects;
import DemoSitePageObjects.CrumbTrayPageObjects;
import DemoSitePageObjects.ElectronicsAudioPageObjects;
import DemoSitePageObjects.ElectronicsPageObjects;
import DemoSitePageObjects.ElectronicsPhotographyPageObjects;
import DemoSitePageObjects.GiftCardPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.MenBlazersPageObjects;
import DemoSitePageObjects.MenFootwearPageObjects;
import DemoSitePageObjects.MenNewArrivalsPageObjects;
import DemoSitePageObjects.MenPageObjects;
import DemoSitePageObjects.MenPantsDenimPageObjects;
import DemoSitePageObjects.MenShirtsPageObjects;
import DemoSitePageObjects.MenTeesKnitsandPolosPageObjects;
import DemoSitePageObjects.MiniCartObjects;
import DemoSitePageObjects.MyAccountPageObjects;
import DemoSitePageObjects.MyOrdersPageObjects;
import DemoSitePageObjects.NewsletterPageObjects;
import DemoSitePageObjects.NotLoggedInCheckoutPageObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
import DemoSitePageObjects.SiteMapCategoryPageObjects;
import DemoSitePageObjects.SportingGoodsBasketballPageObjects;
import DemoSitePageObjects.SportingGoodsPageObjects;
import DemoSitePageObjects.VIPPageObjects;
import DemoSitePageObjects.WishlistPageObjects;
import DemoSitePageObjects.WomenDressesSkirtsPageObjects;
import DemoSitePageObjects.WomenElisaIlanaPageObjects;
import DemoSitePageObjects.WomenNewArrivalsPageObjects;
import DemoSitePageObjects.WomenPageObjects;
import DemoSitePageObjects.WomenPantsDenimPageObjects;
import DemoSitePageObjects.WomenTopsBlousesPageObjects;
import Driver.Driver;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.GlobalProductPageObjects;
import DemoSitePageObjects.HomeDecorBedBathPageObjects;
import DemoSitePageObjects.HomeDecorBooksMusicPageObjects;
import DemoSitePageObjects.HomeDecorDecorativeAccentsPageObjects;
import DemoSitePageObjects.HomeDecorPageObjects;
import DemoSitePageObjects.LoginPageObjects;

public class OrdersStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	public static String text;
	public String winHandleBefore;

	@Given("^I am on my account page$")
	public void i_am_on_my_account_page() throws Throwable {
		GlobalPageObjects.AccountLink(driver).click();
		AccountLinkPageObjects.MyAccountLink(driver).click();
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/");
		assertEquals(driver.getTitle(), "My Account");
		assertEquals(MyAccountPageObjects.MyAccountHeader(driver).getText().toUpperCase(), "MY DASHBOARD");
	}

	@When("^I click on the orders link$")
	public void i_click_on_the_orders_link() throws Throwable {
		MyAccountPageObjects.MyOrdersLink(driver).click();
	}

	@Then("^I am taken to my orders page$")
	public void i_am_taken_to_my_orders_page() throws Throwable {
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/sales/order/history/");
		assertEquals(driver.getTitle(), "My Orders");
		assertEquals(MyOrdersPageObjects.Header(driver).getText().toUpperCase(), "MY ORDERS");
	}

	@Given("^I am on my orders page$")
	public void i_am_on_my_orders_page() throws Throwable {
		GlobalPageObjects.AccountLink(driver).click();
		AccountLinkPageObjects.MyAccountLink(driver).click();
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/");
		assertEquals(driver.getTitle(), "My Account");
		assertEquals(MyAccountPageObjects.MyAccountHeader(driver).getText().toUpperCase(), "MY DASHBOARD");
		MyAccountPageObjects.MyOrdersLink(driver).click();
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/sales/order/history/");
		assertEquals(driver.getTitle(), "My Orders");
		assertEquals(MyOrdersPageObjects.Header(driver).getText().toUpperCase(), "MY ORDERS");
	}

	@Given("^I have not placed any orders$")
	public void i_have_not_placed_any_orders() throws Throwable {
		// I have not because I can't place orders on the demo site
	}

	@Then("^a message displays saying I have not placed any orders$")
	public void a_message_displays_saying_I_have_not_placed_any_orders() throws Throwable {
		assertTrue(MyOrdersPageObjects.NoOrdersMessage(driver).isDisplayed());
		assertEquals(MyOrdersPageObjects.NoOrdersMessage(driver).getText(), "You have placed no orders.");
	}

	@Given("^I have placed an order$")
	public void i_have_placed_an_order() throws Throwable {
		// CANT PLACE ORDERS ON DEMO SITE!
	}

	@When("^I click on the View Order Link$")
	public void i_click_on_the_View_Order_Link() throws Throwable {
		// Like I said before no orders
	}

	@Then("^I am taken to order detail page$")
	public void i_am_taken_to_order_detail_page() throws Throwable {
		// If only I could place an order
	}

}

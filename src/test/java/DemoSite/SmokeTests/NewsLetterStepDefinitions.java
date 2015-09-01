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

public class NewsLetterStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	public static String text;
	public String winHandleBefore;

	@Given("^I want to subscribe to their newsletter$")
	public void i_want_to_subscribe_to_their_newsletter() throws Throwable {
		// I have no choice but to subscribe to their newsletter
	}

	@When("^I type in my email address$")
	public void i_type_in_my_email_address() throws Throwable {
		NewsletterPageObjects.NewsletterEmailField(driver).clear();
		NewsletterPageObjects.NewsletterEmailField(driver).sendKeys("test@test.com");
	}

	@When("^click the subscribe button$")
	public void click_the_subscribe_button() throws Throwable {
		NewsletterPageObjects.NewsletterSubscribeButton(driver).click();
	}

	@Then("^I am successfully subscribed to their newsletter$")
	public void i_am_successfully_subscribed_to_their_newsletter() throws Throwable {
		assertTrue(NewsletterPageObjects.SuccessMessage(driver).isDisplayed());
		assertEquals(NewsletterPageObjects.SuccessMessage(driver).getText(), "Thank you for your subscription.");
	}

}

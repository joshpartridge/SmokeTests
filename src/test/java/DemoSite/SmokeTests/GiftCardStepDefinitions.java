package DemoSite.SmokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import Driver.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import DemoSitePageObjects.GiftCardPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.SimpleProductPageObjects;

public class GiftCardStepDefinitions {
	private WebDriver driver = Driver.driver;
	private String baseUrl = Driver.getBaseUrl();
	// private String baseUrl = getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	private String productTitle;
	private String linktext;

	@Given("^I am on a gift card page$")
	public void i_am_on_a_gift_card_page() throws Throwable {
		MainNavObjects.MainNavGiftCardLink(driver).click();
	}

	@When("^I select the Gift Card I want$")
	public void i_select_the_gift_card_i_want() throws Throwable {
		new Select(GiftCardPageObjects.SortByDropdown(driver)).selectByVisibleText("Price");
		System.out.println(GiftCardPageObjects.SortByDropdown(driver).getAttribute("value"));
		assertEquals(GiftCardPageObjects.SortByDropdown(driver).getAttribute("value"),
				"http://demo114.thegrandriver.net/gift-card.html?dir=asc&order=price");
		
		// Here I go way above and beyond /s by making sure the grid and list functions are working properly
		assertTrue(GiftCardPageObjects.GridActiveLink(driver).isEnabled());
		assertTrue(GiftCardPageObjects.ListInactiveLink(driver).isEnabled());
		assertTrue(GiftCardPageObjects.GridProductList(driver).isDisplayed());
		GiftCardPageObjects.ListInactiveLink(driver).click();
		assertTrue(GiftCardPageObjects.GridInactiveLink(driver).isEnabled());
		assertTrue(GiftCardPageObjects.ListActiveLink(driver).isEnabled());
		assertTrue(GiftCardPageObjects.ListProductList(driver).isDisplayed());
		GiftCardPageObjects.GridInactiveLink(driver).click();
		linktext = GiftCardPageObjects.FourthCardLinkGrid(driver).getText();
		GiftCardPageObjects.FourthCardImageGrid(driver).click();
	}

	@When("^I fill out all the required fields$")
	public void i_fill_out_all_the_required_fields() throws Throwable {
		assertEquals(linktext, SimpleProductPageObjects.ProductTitle2(driver));
		assertEquals(linktext, SimpleProductPageObjects.ProductTitle1(driver));
		new Select(GiftCardPageObjects.AmountDropdown(driver)).selectByVisibleText("$50.00");
		GiftCardPageObjects.SenderField(driver).clear();
		GiftCardPageObjects.SenderField(driver).sendKeys("Testy");
		GiftCardPageObjects.RecipientField(driver).clear();
		GiftCardPageObjects.RecipientField(driver).sendKeys("Miss Testy");
		GiftCardPageObjects.MessageField(driver).clear();
		GiftCardPageObjects.MessageField(driver).sendKeys("Hey ;)");
		SimpleProductPageObjects.QuantityField(driver).clear();
		SimpleProductPageObjects.QuantityField(driver).sendKeys("2");
	}

	@When("^click the Add to Cart button$")
	public void click_the_Add_to_Cart_button() throws Throwable {
		SimpleProductPageObjects.AddToCartButton(driver).click();
	}

}

package DemoSite.SmokeTests;

import static org.junit.Assert.assertEquals;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import Driver.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
import DemoSitePageObjects.CategoryPageObjects;
import DemoSitePageObjects.MiniCartObjects;

public class SimpleProductPageStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private String linktext;
	private String price;

	@Given("^I am on a simple product page$")
	public void i_am_on_a_simple_product_page() throws Throwable {
		Actions a1 = new Actions(driver);
		a1.moveToElement(MainNavObjects.MainNavAccessoriesLink(driver)).build().perform();
		MainNavObjects.MainNavAccessoriesJewelry(driver).click();
		linktext = CategoryPageObjects.SecondProductLinkText(driver);
		price = CategoryPageObjects.SecondProductPrice(driver);
		CategoryPageObjects.SecondProductLink(driver).click();
		assertEquals(linktext, SimpleProductPageObjects.ProductTitle1(driver));
		assertEquals(linktext, SimpleProductPageObjects.ProductTitle2(driver));
		assertEquals(price, SimpleProductPageObjects.Price(driver));
		//System.out.println("I am on a simple product page ran");
	}

	@Then("^product name, price, and availability should be displayed$")
	public void product_name_price_and_availability_should_be_displayed() throws Throwable {
		assertTrue(SimpleProductPageObjects.ProductTitle(driver).isDisplayed());
		assertTrue(SimpleProductPageObjects.Availibility(driver).isDisplayed());
		assertTrue(SimpleProductPageObjects.ProductPrice(driver).isDisplayed());
		//System.out.println("product name, price, and availability should be displayed ran");
	}

	@Given("^that product is in stock$")
	public void that_product_is_in_stock() throws Throwable {
		assertEquals(SimpleProductPageObjects.Availibility(driver).getText().toUpperCase(), "IN STOCK");
		//System.out.println("that product is in stock ran");
	}

	@Then("^Add to Cart button should be displayed$")
	public void add_to_Cart_button_should_be_displayed() throws Throwable {
		assertTrue(SimpleProductPageObjects.AddToCartButton(driver).isDisplayed());
		//System.out.println("Add to Cart button should be displayed ran");
	}

	@Then("^editable quantity field should be displayed$")
	public void editable_quantity_field_should_be_displayed() throws Throwable {
		assertTrue(SimpleProductPageObjects.QuantityField(driver).isDisplayed());
		//System.out.println("editable quantity field should be displayed ran");
	}

	@When("^I click the Add to Cart button$")
	public void i_click_the_Add_to_Cart_button() throws Throwable {
		SimpleProductPageObjects.AddToCartButton(driver).click();
		//System.out.println("I click the Add to Cart button ran");
	}

	@Then("^product should be added to my cart$")
	public void product_should_be_added_to_my_cart() throws Throwable {
		linktext = SimpleProductPageObjects.ProductTitle1(driver).toUpperCase();
		GlobalPageObjects.CartLink(driver).click();
		assertEquals(linktext, MiniCartObjects.FirstProductTitle(driver));
		//System.out.println("product should be added to my cart ran");
	}

	@Then("^a page notification should be displayed saying product successfully added to cart$")
	public void a_page_notification_should_be_displayed_saying_product_successfully_added_to_cart() throws Throwable {
		assertTrue(SimpleProductPageObjects.AddtoCartSuccessMessage(driver).isDisplayed());
		//System.out.println("a page notification should be displayed saying product successfully added to cart ran");
	}

}

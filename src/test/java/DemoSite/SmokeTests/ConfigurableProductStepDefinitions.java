package DemoSite.SmokeTests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import DemoSitePageObjects.ConfigurableProductPageObjects;
import DemoSitePageObjects.CategoryPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
import Driver.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ConfigurableProductStepDefinitions {
	private WebDriver driver = Driver.driver;
	private String baseUrl = Driver.getBaseUrl();
	// private String baseUrl = getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	private String linkText;

	@Given("^I am on a configurable product page$")
	public void i_am_on_a_configurable_product_page() throws Throwable {
		Actions a1 = new Actions(driver);
		a1.moveToElement(MainNavObjects.MainNavWomenLink(driver)).build().perform();
		MainNavObjects.MainNavWomenNewArrivals(driver).click();
		linkText = CategoryPageObjects.SecondProductLinkText(driver);
		CategoryPageObjects.SecondProductImage(driver).click();
		assertEquals(linkText.toUpperCase(), SimpleProductPageObjects.ProductTitle1(driver).toUpperCase());
		assertEquals(linkText.toUpperCase(), SimpleProductPageObjects.ProductTitle2(driver).toUpperCase());
	}

	@When("^I configure the product to my liking$")
	public void i_configure_the_product_to_my_liking() throws Throwable {
		ConfigurableProductPageObjects.SecondSizeSwatch(driver).click();
		ConfigurableProductPageObjects.SecondColorSwatch(driver).click();
	}

	@Then("^image, availability, and price should update accordingly$")
	public void image_availability_and_price_should_update_accordingly() throws Throwable {
		assertTrue(SimpleProductPageObjects.Availibility(driver).isDisplayed());
		assertTrue(SimpleProductPageObjects.ProductPrice(driver).isDisplayed());
		assertEquals(ConfigurableProductPageObjects.ProductColor(driver).getText(), "Pink");
		assertEquals(ConfigurableProductPageObjects.ProductSize(driver).getText(), "M");
		assertTrue(ConfigurableProductPageObjects.ProductImagePink(driver).isDisplayed());
	}

	@Given("^the product is in stock$")
	public void the_product_is_in_stock() throws Throwable {
		assertEquals(SimpleProductPageObjects.Availibility(driver).getText(), "IN STOCK");
	}

	@Given("^configuration of configurable product is in stock$")
	public void configuration_of_configurable_product_is_in_stock() throws Throwable {
		ConfigurableProductPageObjects.SecondSizeSwatch(driver).click();
		ConfigurableProductPageObjects.SecondColorSwatch(driver).click();
		assertEquals(SimpleProductPageObjects.Availibility(driver).getText(), "IN STOCK");
	}

}

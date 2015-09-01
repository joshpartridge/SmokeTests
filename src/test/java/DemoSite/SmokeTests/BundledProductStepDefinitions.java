package DemoSite.SmokeTests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import DemoSitePageObjects.BundledProductPageObjects;
import DemoSitePageObjects.ConfigurableProductPageObjects;
import DemoSitePageObjects.CategoryPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
import Driver.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.support.ui.Select;

public class BundledProductStepDefinitions {

	private WebDriver driver = Driver.driver;
	private String baseUrl = Driver.getBaseUrl();
	// private String baseUrl = getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	private String linkText;
	private static BigDecimal total;

	@Given("^I am on a bundled product page$")
	public void i_am_on_a_bundled_product_page() throws Throwable {
		Actions a1 = new Actions(driver);
		a1.moveToElement(MainNavObjects.MainNavElectronicsLink(driver)).build().perform();
		MainNavObjects.MainNavElectronicsAudio(driver).click();
		linkText = CategoryPageObjects.ThirdProductLinkText(driver).toUpperCase();
		CategoryPageObjects.ThirdProductLink(driver).click();
		assertEquals(linkText, SimpleProductPageObjects.ProductTitle1(driver).toUpperCase());
		assertEquals(linkText, SimpleProductPageObjects.ProductTitle2(driver).toUpperCase());
	}

	@Then("^product name, price range, and availability should be displayed$")
	public void product_name_price_range_and_availability_should_be_displayed() throws Throwable {
		assertTrue(SimpleProductPageObjects.ProductTitle(driver).isDisplayed());
		assertTrue(SimpleProductPageObjects.ProductPrice(driver).isDisplayed());
		assertTrue(SimpleProductPageObjects.Availibility(driver).isDisplayed());
	}

	@Then("^Price as configured, editable quantity field, and Add to Cart button should be displayed$")
	public void price_as_configured_editable_quantity_field_and_Add_to_Cart_button_should_be_displayed()
			throws Throwable {
		assertTrue(BundledProductPageObjects.PriceasConfigured(driver).isDisplayed());
		assertTrue(BundledProductPageObjects.From(driver).isDisplayed());
		assertTrue(BundledProductPageObjects.To(driver).isDisplayed());
		assertTrue(BundledProductPageObjects.FirstProductQuantityField(driver).isDisplayed());
		assertTrue(BundledProductPageObjects.SecondProductQuantityField(driver).isDisplayed());
		assertTrue(SimpleProductPageObjects.AddToCartButton(driver).isDisplayed());
	}

	@Given("^the child product of the bundled product is configurable$")
	public void the_child_product_of_the_bundled_product_is_configurable() throws Throwable {
		assertTrue(BundledProductPageObjects.FirstProductDropdown(driver).isDisplayed());
		assertTrue(BundledProductPageObjects.SecondProductDropdown(driver).isDisplayed());
	}

	@When("^I configure the child product to my liking$")
	public void i_configure_the_child_product_to_my_liking() throws Throwable {
		new Select(BundledProductPageObjects.FirstProductDropdown(driver)).selectByIndex(1);
		new Select(BundledProductPageObjects.SecondProductDropdown(driver)).selectByIndex(2);
		BundledProductPageObjects.FirstProductQuantityField(driver).clear();
		BundledProductPageObjects.FirstProductQuantityField(driver).sendKeys("2");
		BundledProductPageObjects.SecondProductQuantityField(driver).clear();
		BundledProductPageObjects.SecondProductQuantityField(driver).sendKeys("3");

		// I used these lines to verify the values of these elements
		// System.out.println(BundledProductPageObjects.FirstProductQuantityField(driver).getAttribute("value"));
		// System.out.println(BundledProductPageObjects.SecondProductQuantityField(driver).getAttribute("value"));
		// System.out.println(BundledProductPageObjects.ConfiguredPrice(driver));
	}

	@Then("^price as configured and availability should update accordingly$")
	public void price_as_configured_and_availability_should_update_accordingly() throws Throwable {
		/*
		 * This was tons of fun, trying to make the prices BigDecimals by parsing the string in the
		 * page objects class. Eventually I got it working and now it makes sure the total price
		 * is the same as all the child product prices added up.
		 */
		BigDecimal firstproductTotal = BundledProductPageObjects.FirstProductDropdownOptionBD(driver)
				.multiply(BundledProductPageObjects.FirstProductQuantityBD(driver));
		BigDecimal secondproductTotal = BundledProductPageObjects.SecondProductDropdownOptionBD(driver)
				.multiply(BundledProductPageObjects.SecondProductQuantityBD(driver));
		BigDecimal totalPrice = firstproductTotal.add(secondproductTotal);
		
		// System.out.println(totalPrice);
		assertEquals(totalPrice, BundledProductPageObjects.ConfiguredPrice(driver));
	}

	@Given("^my configuration of the bundled product is in stock$")
	public void my_configuration_of_the_bundled_product_is_in_stock() throws Throwable {
		new Select(BundledProductPageObjects.FirstProductDropdown(driver)).selectByIndex(2);
		new Select(BundledProductPageObjects.SecondProductDropdown(driver)).selectByIndex(1);
		BundledProductPageObjects.FirstProductQuantityField(driver).clear();
		BundledProductPageObjects.FirstProductQuantityField(driver).sendKeys("3");
		BundledProductPageObjects.SecondProductQuantityField(driver).clear();
		BundledProductPageObjects.SecondProductQuantityField(driver).sendKeys("2");
		assertEquals(SimpleProductPageObjects.Availibility(driver).getText().toUpperCase(), "IN STOCK");
	}

}

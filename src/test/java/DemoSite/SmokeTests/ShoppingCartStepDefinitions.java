package DemoSite.SmokeTests;

import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import DemoSitePageObjects.MiniCartObjects;
import DemoSitePageObjects.NotLoggedInCheckoutPageObjects;
import DemoSitePageObjects.AccountLinkPageObjects;
import DemoSitePageObjects.CrumbTrayPageObjects;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.SearchResultsPageObjects;
import DemoSitePageObjects.ShoppingCartPageObjects;
import Driver.Driver;
import static org.junit.Assert.*;

public class ShoppingCartStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private static String text;
	private static BigDecimal price1;
	private static BigDecimal price2;
	private static BigDecimal price3;

	@Given("^I am on any page in client website$")
	public void i_am_on_any_page_in_client_website() throws Throwable {
		CrumbTrayPageObjects.SearchTermsLink(driver).click();
		driver.findElement(By.xpath("//li[36]/a")).click();
	}

	@When("^click on the view shopping cart link$")
	public void click_on_the_view_shopping_cart_link() throws Throwable {
		MiniCartObjects.ViewShoppingCartLink(driver).click();
	}

	@Then("^I am taken to shopping cart page$")
	public void i_am_taken_to_shopping_cart_page() throws Throwable {
		assertEquals(driver.getTitle().toUpperCase(),
				ShoppingCartPageObjects.ShoppingCartTitle(driver).getText().toUpperCase());
		assertEquals(ShoppingCartPageObjects.ShoppingCartTitle(driver).getText().toUpperCase(), "SHOPPING CART");
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/checkout/cart/");
	}

	@Given("^I am on shopping cart page$")
	public void i_am_on_shopping_cart_page() throws Throwable {
		GlobalPageObjects.AccountLink(driver).click();
		AccountLinkPageObjects.MyCartLink(driver).click();
		assertEquals(driver.getTitle().toUpperCase(),
				ShoppingCartPageObjects.ShoppingCartTitle(driver).getText().toUpperCase());
		assertEquals(ShoppingCartPageObjects.ShoppingCartTitle(driver).getText().toUpperCase(), "SHOPPING CART");
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/checkout/cart/");
	}

	@When("^I click on the remove item icon$")
	public void i_click_on_the_remove_item_icon() throws Throwable {
		ShoppingCartPageObjects.ThirdProductRemove(driver).click();
		ShoppingCartPageObjects.FirstProductRemove(driver).click();
		ShoppingCartPageObjects.FirstProductRemove(driver).click();
	}

	@When("^I click on the Empty Cart link$")
	public void i_click_on_the_Empty_Cart_link() throws Throwable {
		ShoppingCartPageObjects.EmptyCartButton(driver).click();
	}

	@Then("^all product should be removed from my cart$")
	public void all_product_should_be_removed_from_my_cart() throws Throwable {
		assertEquals(ShoppingCartPageObjects.EmptyCartTitle(driver).getText().toUpperCase(), "SHOPPING CART IS EMPTY");
		assertEquals(ShoppingCartPageObjects.EmptyCartMessage(driver).getText(),
				"You have no items in your shopping cart.");
		assertTrue(ShoppingCartPageObjects.EmptyContinueShoppingLink(driver).isDisplayed());
		assertFalse(isElementPresent(By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td/a/img")));
	}

	@When("^I edit the quantity of a product$")
	public void i_edit_the_quantity_of_a_product() throws Throwable {
		ShoppingCartPageObjects.SecondProductQuantityField(driver).clear();
		ShoppingCartPageObjects.SecondProductQuantityField(driver).sendKeys("2");
		ShoppingCartPageObjects.SecondProductQuantityField(driver).click();
		ShoppingCartPageObjects.SecondProductUpdateButton(driver).click();
		ShoppingCartPageObjects.ThirdProductQuantityField(driver).clear();
		ShoppingCartPageObjects.ThirdProductQuantityField(driver).sendKeys("3");
	}

	@When("^click on the update button$")
	public void click_on_the_update_button() throws Throwable {
		ShoppingCartPageObjects.UpdateShoppingCartButtonButton(driver).click();
	}

	@When("^The the product is updated accordingly$")
	public void the_the_product_is_updated_accordingly() throws Throwable {
		assertEquals("1", ShoppingCartPageObjects.FirstProductQuantityField(driver).getAttribute("value"));
		assertEquals("2", ShoppingCartPageObjects.SecondProductQuantityField(driver).getAttribute("value"));
		assertEquals("3", ShoppingCartPageObjects.ThirdProductQuantityField(driver).getAttribute("value"));

		// System.out.println(ShoppingCartPageObjects.FirstProductPriceBD(driver));
		/*
		 * This is where I make sure the prices of everything are adding up correctly
		 * using the BigDecimal class
		 */
		assertEquals(
				ShoppingCartPageObjects.FirstProductPriceBD(driver)
						.multiply(new BigDecimal(
								ShoppingCartPageObjects.FirstProductQuantityField(driver).getAttribute("value"))),
				ShoppingCartPageObjects.FirstProductSubtotalBD(driver));

		assertEquals(
				ShoppingCartPageObjects.SecondProductPriceBD(driver)
						.multiply(new BigDecimal(
								ShoppingCartPageObjects.SecondProductQuantityField(driver).getAttribute("value"))),
				ShoppingCartPageObjects.SecondProductSubtotalBD(driver));

		assertEquals(
				ShoppingCartPageObjects.ThirdProductPriceBD(driver)
						.multiply(new BigDecimal(
								ShoppingCartPageObjects.ThirdProductQuantityField(driver).getAttribute("value"))),
				ShoppingCartPageObjects.ThirdProductSubtotalBD(driver));

		assertEquals(
				ShoppingCartPageObjects.FirstProductSubtotalBD(driver)
						.add(ShoppingCartPageObjects.SecondProductSubtotalBD(driver)
								.add(ShoppingCartPageObjects.ThirdProductSubtotalBD(driver))),
				ShoppingCartPageObjects.SubtotalBD(driver));

		assertEquals(ShoppingCartPageObjects.SubtotalBD(driver).add(ShoppingCartPageObjects.TaxBD(driver)),
				ShoppingCartPageObjects.GrandTotalBD(driver));

	}

	@Given("^I want to continue shopping$")
	public void i_want_to_continue_shopping() throws Throwable {
		// Why yes I do want to continue shopping
	}

	@When("^I click on the Continue Shopping link$")
	public void i_click_on_the_Continue_Shopping_link() throws Throwable {
		ShoppingCartPageObjects.ContinueShoppingButton(driver).click();
	}

	@Then("^I am directed to site homepage$")
	public void i_am_directed_to_site_homepage() throws Throwable {
		assertEquals(driver.getTitle(), "Home page");
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/");
	}

	@Then("^product is removed from shopping cart page$")
	public void product_is_removed_from_shopping_cart_page() throws Throwable {
		assertEquals(ShoppingCartPageObjects.EmptyCartTitle(driver).getText().toUpperCase(), "SHOPPING CART IS EMPTY");
		assertEquals(ShoppingCartPageObjects.EmptyCartMessage(driver).getText(),
				"You have no items in your shopping cart.");
		assertTrue(ShoppingCartPageObjects.EmptyContinueShoppingLink(driver).isDisplayed());
		assertFalse(isElementPresent(By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td/a/img")));
	}

	@Then("^All subtotal and total prices are correct$")
	public void all_subtotal_and_total_prices_are_correct() throws Throwable {
		/*
		 * I love adding BigDecimals together
		 */
		assertEquals(
				ShoppingCartPageObjects.FirstProductPriceBD(driver)
						.multiply(new BigDecimal(
								ShoppingCartPageObjects.FirstProductQuantityField(driver).getAttribute("value"))),
				ShoppingCartPageObjects.FirstProductSubtotalBD(driver));

		assertEquals(
				ShoppingCartPageObjects.SecondProductPriceBD(driver)
						.multiply(new BigDecimal(
								ShoppingCartPageObjects.SecondProductQuantityField(driver).getAttribute("value"))),
				ShoppingCartPageObjects.SecondProductSubtotalBD(driver));

		assertEquals(
				ShoppingCartPageObjects.ThirdProductPriceBD(driver)
						.multiply(new BigDecimal(
								ShoppingCartPageObjects.ThirdProductQuantityField(driver).getAttribute("value"))),
				ShoppingCartPageObjects.ThirdProductSubtotalBD(driver));

		assertEquals(
				ShoppingCartPageObjects.FirstProductSubtotalBD(driver)
						.add(ShoppingCartPageObjects.SecondProductSubtotalBD(driver)
								.add(ShoppingCartPageObjects.ThirdProductSubtotalBD(driver))),
				ShoppingCartPageObjects.SubtotalBD(driver));

		assertEquals(ShoppingCartPageObjects.SubtotalBD(driver).add(ShoppingCartPageObjects.TaxBD(driver)),
				ShoppingCartPageObjects.GrandTotalBD(driver));

	}

	@When("^I click on the edit link for a product on the shopping cart page$")
	public void i_click_on_the_edit_link_for_a_product_on_the_shopping_cart_page() throws Throwable {
		ShoppingCartPageObjects.ThirdProductEditLink(driver).click();
	}

	@When("^I click on the Proceed to Checkout button$")
	public void i_click_on_the_Proceed_to_Checkout_button() throws Throwable {
		ShoppingCartPageObjects.ProceedToCheckoutButton1(driver).click();
	}

	@Then("^I am taken to the Checkout page$")
	public void i_am_taken_to_the_Checkout_page() throws Throwable {
		assertEquals(NotLoggedInCheckoutPageObjects.CheckoutOnepageTitle(driver),
				NotLoggedInCheckoutPageObjects.SupposedCheckoutOnepageTitle());
		assertEquals(NotLoggedInCheckoutPageObjects.CheckoutTitle(driver).getText().toUpperCase(), "CHECKOUT");

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

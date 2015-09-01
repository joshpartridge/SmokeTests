package DemoSite.SmokeTests;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import DemoSitePageObjects.MiniCartObjects;
import DemoSitePageObjects.CrumbTrayPageObjects;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.SearchResultsPageObjects;
import DemoSitePageObjects.SiteMapCategoryPageObjects;
import DemoSitePageObjects.SubcategoryPageObjects;
import Driver.Driver;
import static org.junit.Assert.*;

public class MiniCartStepDefinitions {
	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private String text;

	@Given("^mini cart function is enabled$")
	public void mini_cart_function_is_enabled() throws Throwable {
		GlobalPageObjects.CartLink(driver).click();
		assertTrue(MiniCartObjects.CloseLink(driver).isDisplayed());
		MiniCartObjects.CloseLink(driver).click();
	}

	@Given("^I am on any page of client website$")
	public void i_am_on_any_page_of_client_website() throws Throwable {
		driver.get(baseUrl);
	}

	@When("^I click on the shopping cart icon$")
	public void i_click_on_the_shopping_cart_icon() throws Throwable {
		GlobalPageObjects.CartLink(driver).click();
	}

	@Then("^the mini cart should be displayed$")
	public void the_mini_cart_should_be_displayed() throws Throwable {
		// Can't really remember why I put a sleep thread here
		try {
			Thread.sleep(3000); // 1000 milliseconds is one second.
		} catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		assertTrue(MiniCartObjects.CloseLink(driver).isDisplayed());
	}

	@Given("^I have product in my cart$")
	public void i_have_product_in_my_cart() throws Throwable {
		GlobalPageObjects.SearchBox(driver).clear();
		GlobalPageObjects.SearchBox(driver).sendKeys("basketball");
		GlobalPageObjects.MagnifyingGlass(driver).click();
		assertEquals("SEARCH RESULTS FOR 'BASKETBALL'", driver.findElement(By.cssSelector("h1")).getText());
		SearchResultsPageObjects.AddToCartButton(driver).click();
		assertTrue(SearchResultsPageObjects.ShoppingCartSuccessAlert(driver).isDisplayed());

		MainNavObjects.MainNavElectronicsLink(driver).click();
		SubcategoryPageObjects.SecondAddtoCartButton(driver).click();
		assertTrue(SearchResultsPageObjects.ShoppingCartSuccessAlert(driver).isDisplayed());

		CrumbTrayPageObjects.SiteMapLink(driver).click();
		assertEquals(driver.getTitle(), "Site Map");
		SiteMapCategoryPageObjects.AccessoriesEyewearLink(driver).click();
		SubcategoryPageObjects.ThirdAddtoCartButton(driver).click();

		GlobalPageObjects.CartLink(driver).click();
		assertTrue(MiniCartObjects.FirstProductImage(driver).isDisplayed());
		assertTrue(MiniCartObjects.SecondProductImage(driver).isDisplayed());
		assertTrue(MiniCartObjects.ThirdProductImage(driver).isDisplayed());
		GlobalPageObjects.CartLink(driver).click();
	}

	@Then("^up to the last three items added to the cart should be displayed$")
	public void up_to_the_last_three_items_added_to_the_cart_should_be_displayed() throws Throwable {
		assertTrue(MiniCartObjects.FirstProductImage(driver).isDisplayed());
		MiniCartObjects.CloseLink(driver).click();
	}

	@Given("^I don’t have product in my cart$")
	public void i_don_t_have_product_in_my_cart() throws Throwable {
		// GlobalPageObjects.CartLink(driver).click();
		// When driver opens at beginning there shouldn't be any product
	}

	@Then("^a message stating you have no items in your cart should be displayed$")
	public void a_message_stating_you_have_no_items_in_your_cart_should_be_displayed() throws Throwable {
		assertTrue(MiniCartObjects.EmptyMessage(driver).isDisplayed());
		assertEquals("You have no items in your shopping cart.", MiniCartObjects.EmptyMessage(driver).getText());
	}

	@Given("^I am in mini cart$")
	public void i_am_in_mini_cart() throws Throwable {
		GlobalPageObjects.CartLink(driver).click();
	}

	@Given("^I have added product to the cart$")
	public void i_have_added_product_to_the_cart() throws Throwable {
		GlobalPageObjects.SearchBox(driver).clear();
		GlobalPageObjects.SearchBox(driver).sendKeys("basketball");
		GlobalPageObjects.MagnifyingGlass(driver).click();
		assertEquals("SEARCH RESULTS FOR 'BASKETBALL'", driver.findElement(By.cssSelector("h1")).getText());
		SearchResultsPageObjects.AddToCartButton(driver).click();
		assertTrue(SearchResultsPageObjects.ShoppingCartSuccessAlert(driver).isDisplayed());
	}

	@When("^I click on the edit link for one of the products$")
	public void i_click_on_the_edit_link_for_one_of_the_products() throws Throwable {
		MiniCartObjects.FirstProductsEditLink(driver).click();
	}

	@Then("^I am taken to product detail page$")
	public void i_am_taken_to_product_detail_page() throws Throwable {
		GlobalPageObjects.CartLink(driver).click();
		assertEquals(GlobalPageObjects.PageTitle(driver).toUpperCase(),
				MiniCartObjects.FirstProductTitle(driver).toUpperCase());
		MiniCartObjects.CloseLink(driver).click();

	}

	@Then("^an update cart button is displayed$")
	public void an_update_cart_button_is_displayed() throws Throwable {
		assertTrue(MiniCartObjects.UpdateCartProductPageButton(driver).isDisplayed());
		assertEquals(MiniCartObjects.UpdateCartProductPageButton(driver).getText(), "UPDATE CART");
	}

	@When("^I click on the remove item link$")
	public void i_click_on_the_remove_item_link() throws Throwable {
		text = MiniCartObjects.FirstProductTitle(driver);
		MiniCartObjects.FirstProductsRemoveLink(driver).click();
	}

	@When("^click on the OK button in the following alert$")
	public void click_on_the_OK_button_in_the_following_alert() throws Throwable {
		assertTrue(closeAlertAndGetItsText()
				.matches("^Are you sure you would like to remove this item from the shopping cart[\\s\\S]$"));
	}

	@Then("^product is removed from my cart$")
	public void product_is_removed_from_my_cart() throws Throwable {
		assertFalse(isElementPresent(By.xpath("//a[contains(text(),'" + text + "')]")));
	}

	@Then("^a message stating product was successfully removed is displayed$")
	public void a_message_stating_product_was_successfully_removed_is_displayed() throws Throwable {
		try {
			assertEquals("Item was removed successfully.",
					driver.findElement(By.id("minicart-success-message")).getText());
		} catch (Error e) {
			verificationErrors.append(e.toString());
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
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

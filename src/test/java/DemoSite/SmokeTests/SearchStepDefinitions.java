package DemoSite.SmokeTests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import DemoSitePageObjects.CategoryPageObjects;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.MiniCartObjects;
import DemoSitePageObjects.SearchResultsPageObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
import Driver.Driver;

public class SearchStepDefinitions extends AbstractPageStepDefinitions {

	GlobalPageObjects globalpageobjects;
	SearchResultsPageObjects searchresultspageobjects;
	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private String productTitle;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Given("^you are on any page in the website$")
	public void you_are_on_any_page_in_the_website() throws Throwable {
		System.out.println(baseUrl);
		driver.get(baseUrl);
	}

	@When("^I search for \"(.*?)\"$")
	public void i_search_for(String arg1) throws Throwable {
		driver.get(baseUrl);
		GlobalPageObjects.SearchBox(driver).clear();
		GlobalPageObjects.SearchBox(driver).sendKeys(arg1);
		GlobalPageObjects.MagnifyingGlass(driver).click();
		assertEquals("SEARCH RESULTS FOR '" + (arg1) + "'",
				SearchResultsPageObjects.SearchResultsTitle(driver).getText());
	}

	@Then("^search results page should be displayed with related product$")
	public void search_results_page_should_be_displayed_with_related_product() throws Throwable {
		// assertions point is in previous step due to string
	}

	@Given("^that I am on a search results page$")
	public void that_I_am_on_a_search_results_page() throws Throwable {
		driver.get(baseUrl);
		GlobalPageObjects.SearchBox(driver).clear();
		GlobalPageObjects.SearchBox(driver).sendKeys("basketball");
		GlobalPageObjects.MagnifyingGlass(driver).click();
		assertEquals("SEARCH RESULTS FOR 'BASKETBALL'", driver.findElement(By.cssSelector("h1")).getText());
	}

	@When("^I select a product Image/Name$")
	public void i_select_a_product_Image_Name() throws Throwable {
		productTitle = SearchResultsPageObjects.FirstProductLinkText(driver);
		SearchResultsPageObjects.FirstProductImage(driver).click();
		assertEquals(productTitle.toUpperCase(), SimpleProductPageObjects.ProductTitle1(driver).toUpperCase());
		assertEquals(productTitle.toUpperCase(), SimpleProductPageObjects.ProductTitle2(driver).toUpperCase());
		// assertEquals(productTitle.toUpperCase() + " - " +
		// SimpleProductPageObjects.CategoryLink(driver).getText(),
		// driver.getTitle().toUpperCase());
	}

	@Then("^I should be directed to that product’s detail page$")
	public void i_should_be_directed_to_that_product_s_detail_page() throws Throwable {
		// assertion occurs in previous step
	}

	@And("^there is simple product on the page$")
	public void there_is_simple_product_on_the_page() throws Throwable {
		GlobalPageObjects.SearchBox(driver).clear();
		GlobalPageObjects.SearchBox(driver).sendKeys("basketball");
		GlobalPageObjects.MagnifyingGlass(driver).click();
		assertEquals("SEARCH RESULTS FOR 'BASKETBALL'", driver.findElement(By.cssSelector("h1")).getText());
	}

	@When("^I click the add to cart button$")
	public void i_click_the_add_to_cart_button() throws Throwable {
		SearchResultsPageObjects.AddToCartButton(driver).click();
	}

	@And("^Product is added to cart$")
	public void product_is_added_to_cart() throws Throwable {
		GlobalPageObjects.CartLink(driver).click();
		MiniCartObjects.FirstProductImage(driver).isDisplayed();
	}

	@Then("^page notification displays saying product was added to cart$")
	public void page_notification_displays_saying_product_was_added_to_cart() throws Throwable {
		assertTrue(SearchResultsPageObjects.ShoppingCartSuccessAlert(driver).isDisplayed());
	}

}

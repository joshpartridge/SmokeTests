package DemoSite.SmokeTests;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import java.math.BigDecimal;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import DemoSitePageObjects.AdvancedSearchPageObjects;
import DemoSitePageObjects.AdvancedSearchResultsPageObjects;
import DemoSitePageObjects.BundledProductPageObjects;
import DemoSitePageObjects.ConfigurableProductPageObjects;
import DemoSitePageObjects.CrumbTrayPageObjects;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.CategoryPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
import DemoSitePageObjects.SiteMapCategoryPageObjects;
import Driver.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.support.ui.Select;

public class AdvancedSearchStepDefinitions {

	private WebDriver driver = Driver.driver;
	private String baseUrl = Driver.getBaseUrl();
	// private String baseUrl = getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	private String linkText;
	private static BigDecimal total;

	@When("^I click on Advanced Search link$")
	public void i_click_on_Advanced_Search_link() throws Throwable {
		CrumbTrayPageObjects.AdvancedSearchLink(driver).click();
	}

	@Then("^I am taken to the Advanced Search page$")
	public void i_am_taken_to_the_Advanced_Search_page() throws Throwable {
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/catalogsearch/advanced/");
		assertEquals(driver.getTitle(), "Advanced Search");
		assertEquals(SiteMapCategoryPageObjects.SiteMapHeader(driver).getText().toUpperCase(),
				"CATALOG ADVANCED SEARCH");
	}

	@Given("^I am on Advanced Search page$")
	public void i_am_on_Advanced_Search_page() throws Throwable {
		CrumbTrayPageObjects.AdvancedSearchLink(driver).click();
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/catalogsearch/advanced/");
		assertEquals(driver.getTitle(), "Advanced Search");
		assertEquals(SiteMapCategoryPageObjects.SiteMapHeader(driver).getText().toUpperCase(),
				"CATALOG ADVANCED SEARCH");
	}

	@When("^I search for a product$")
	public void i_search_for_a_product() throws Throwable {
		AdvancedSearchPageObjects.NameField(driver).clear();
		AdvancedSearchPageObjects.NameField(driver).sendKeys("tee");
		AdvancedSearchPageObjects.PriceLowField(driver).clear();
		AdvancedSearchPageObjects.PriceLowField(driver).sendKeys("0");
		AdvancedSearchPageObjects.PriceHighField(driver).clear();
		AdvancedSearchPageObjects.PriceHighField(driver).sendKeys("300");
		new Select(AdvancedSearchPageObjects.ColorField(driver)).selectByVisibleText("Black");
		new Select(AdvancedSearchPageObjects.GenderField(driver)).selectByVisibleText("Male");
	}

	@When("^my search terms are good$")
	public void my_search_terms_are_good() throws Throwable {
		// yes my search terms are good
		AdvancedSearchPageObjects.SearchButton(driver).click();
	}

	@Then("^search results should be displayed$")
	public void search_results_should_be_displayed() throws Throwable {
		assertEquals(GlobalPageObjects.Header(driver).getText().toUpperCase(), "CATALOG ADVANCED SEARCH");
		assertEquals(GlobalPageObjects.LastCategoryTitle(driver).getText().toUpperCase(), "RESULTS");
		assertTrue(AdvancedSearchResultsPageObjects.FirstProductImage(driver).isDisplayed());
		assertTrue(AdvancedSearchResultsPageObjects.FirstProductLink(driver).isDisplayed());
	}

	@When("^my search terms are bad$")
	public void my_search_terms_are_bad() throws Throwable {
		// This makes the search terms have no results, but I'm sure you could have figured that out
		new Select(AdvancedSearchPageObjects.SizeField(driver)).selectByVisibleText("0");
		AdvancedSearchPageObjects.SearchButton(driver).click();
	}

	@Then("^no results should be displayed$")
	public void no_results_should_be_displayed() throws Throwable {
		assertEquals(GlobalPageObjects.Header(driver).getText().toUpperCase(), "CATALOG ADVANCED SEARCH");
		assertEquals(GlobalPageObjects.LastCategoryTitle(driver).getText().toUpperCase(), "RESULTS");
		assertEquals(AdvancedSearchResultsPageObjects.NoResultsErrorMessage(driver).getText(),
				"No items were found using the following search criteria. Modify your search");
		assertTrue(AdvancedSearchResultsPageObjects.NoResultsModifyYourSearchLink(driver).isDisplayed());
	}

}

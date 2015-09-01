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
import DemoSitePageObjects.BundledProductPageObjects;
import DemoSitePageObjects.ConfigurableProductPageObjects;
import DemoSitePageObjects.CrumbTrayPageObjects;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.CategoryPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.SearchTermsPageObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
import DemoSitePageObjects.SiteMapCategoryPageObjects;
import Driver.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.support.ui.Select;

public class SearchTermsStepDefinitions {

	private WebDriver driver = Driver.driver;
	private String baseUrl = Driver.getBaseUrl();
	// private String baseUrl = getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	private String linkText;
	private static BigDecimal total;

	@When("^I Click on the search terms link$")
	public void i_Click_on_the_search_terms_link() throws Throwable {
		CrumbTrayPageObjects.SearchTermsLink(driver).click();
	}

	@Then("^I am taken to search terms page$")
	public void i_am_taken_to_search_terms_page() throws Throwable {
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/catalogsearch/term/popular/");
		assertEquals(driver.getTitle(), "Search Terms");
		assertEquals(SiteMapCategoryPageObjects.SiteMapHeader(driver).getText().toUpperCase(), "POPULAR SEARCH TERMS");
	}

	@Given("^I am on search terms page$")
	public void i_am_on_search_terms_page() throws Throwable {
		CrumbTrayPageObjects.SearchTermsLink(driver).click();
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/catalogsearch/term/popular/");
		assertEquals(driver.getTitle(), "Search Terms");
		assertEquals(SiteMapCategoryPageObjects.SiteMapHeader(driver).getText().toUpperCase(), "POPULAR SEARCH TERMS");
	}

	@When("^I click on a search term$")
	public void i_click_on_a_search_term() throws Throwable {
		linkText = SearchTermsPageObjects.SixthSearchTermLink(driver).getText();
		SearchTermsPageObjects.SixthSearchTermLink(driver).click();
	}

	@Then("^search results page for that search term is displayed$")
	public void search_results_page_for_that_search_term_is_displayed() throws Throwable {
		assertEquals(driver.getTitle(), "Search results for: '" + linkText + "'");
		assertEquals(GlobalPageObjects.Header(driver).getText().toUpperCase(),
				"SEARCH RESULTS FOR '" + linkText.toUpperCase() + "'");
		assertEquals(GlobalPageObjects.LastCategoryTitle(driver).getText().toUpperCase(),
				"SEARCH RESULTS FOR: '" + linkText.toUpperCase() + "'");

	}

}

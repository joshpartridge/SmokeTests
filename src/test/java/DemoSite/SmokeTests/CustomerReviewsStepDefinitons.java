package DemoSite.SmokeTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.*;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

import DemoSitePageObjects.CategoryPageObjects;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.GlobalProductPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.ProductReviewsPageObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
import Driver.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CustomerReviewsStepDefinitons {

	private WebDriver driver = Driver.driver;
	private String baseUrl = Driver.getBaseUrl();
	// private String baseUrl = getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	private int Y;
	private int X;
	private String productTitle;
	private String linktext;
	private Point point;

	@Given("^I am on a product detail page with at least one review$")
	public void i_am_on_a_product_detail_page_with_at_least_one_review() throws Throwable {
		Actions a1 = new Actions(driver);
		a1.moveToElement(MainNavObjects.MainNavMenLink(driver)).build().perform();
		MainNavObjects.MainNavMenNewArrivals(driver).click();
		linktext = CategoryPageObjects.FirstProductLink(driver).getText();
		CategoryPageObjects.FirstProductLink(driver).click();
		assertEquals(linktext, SimpleProductPageObjects.ProductTitle2(driver));
		assertTrue(GlobalProductPageObjects.ReviewsDiv(driver).isDisplayed());
	}

	@Then("^number of review\\(s\\) and Add Your Review links should be displayed$")
	public void number_of_review_s_and_Add_Your_Review_links_should_be_displayed() throws Throwable {
		assertTrue(GlobalProductPageObjects.Stars(driver).isDisplayed());
		assertTrue(GlobalProductPageObjects.ReviewsLink(driver).isDisplayed());
		assertTrue(GlobalProductPageObjects.AddYourReviewLink(driver).isDisplayed());
	}

	@Given("^I am on a product detail page with no reviews$")
	public void i_am_on_a_product_detail_page_with_no_reviews() throws Throwable {
		Actions a1 = new Actions(driver);
		a1.moveToElement(MainNavObjects.MainNavWomenLink(driver)).build().perform();
		MainNavObjects.MainNavWomenPantsDenim(driver).click();
		linktext = CategoryPageObjects.FirstProductLink(driver).getText();
		CategoryPageObjects.FirstProductLink(driver).click();
		assertEquals(linktext, SimpleProductPageObjects.ProductTitle2(driver));
		assertFalse(isElementPresent(By.cssSelector("div.ratings")));
	}

	@Then("^number of review\\(s\\) and Add Your Review links should not be displayed$")
	public void number_of_review_s_and_Add_Your_Review_links_should_not_be_displayed() throws Throwable {
		/*
		 * I'm sure there is a way to use the isElementPresent method with a page object
		 * but I couldn't come up with one easily.
		 */
		assertFalse(isElementPresent(By.cssSelector("div.ratings")));
	}

	@Then("^Be the first to review this product link should be displayed under Reviews tab$")
	public void be_the_first_to_review_this_product_link_should_be_displayed_under_Reviews_tab() throws Throwable {
		GlobalProductPageObjects.ReviewsTab(driver).click();
		assertTrue(GlobalProductPageObjects.FirsttoReviewLink(driver).isDisplayed());
	}

	@When("^I click on the number of Review\\(s\\) link$")
	public void i_click_on_the_number_of_Review_s_link() throws Throwable {
		GlobalProductPageObjects.ReviewsLink(driver).click();
	}

	@Then("^I should be directed to product review page$")
	public void i_should_be_directed_to_product_review_page() throws Throwable {
		assertTrue(ProductReviewsPageObjects.ProductReviewsFields(driver).isDisplayed());
		assertTrue(ProductReviewsPageObjects.ReviewExtraInfo(driver).isDisplayed());
		assertEquals(ProductReviewsPageObjects.ProductReviewsTitle(driver).getText().toUpperCase(), "PRODUCT REVIEWS");
	}

	@When("^I click on the Add Your Review link$")
	public void i_click_on_the_Add_Your_Review_link() throws Throwable {
		GlobalProductPageObjects.ReviewsTab(driver).click();
		GlobalProductPageObjects.AddYourReviewLink(driver).click();
	}

	@Then("^anchored to the write your review section$")
	public void anchored_to_the_write_your_review_section() throws Throwable {
		/*
		 * This was another tricky section because I wanted to get the position of an element
		 * relative to its view in the window, not relative to the page. Ended up being only 
		 * 3 lines of code so it made me feel kind of dumb
		 */

		Locatable Elm = (Locatable) ProductReviewsPageObjects.ReviewRewardsMessage(driver);
		Y = Elm.getCoordinates().inViewPort().getY();
		// System.out.println(Y);
		assertEquals(Y, 0);
		// System.out.println(Elm.getCoordinates().inViewPort());
		// System.out.println(ProductReviewsPageObjects.ReviewRewardsMessage(driver).getLocation());

		// Locatable Elm2 = (Locatable)
		// ProductReviewsPageObjects.ValueOneStar(driver);
		// System.out.println(Elm2.getCoordinates().inViewPort());
		// System.out.println(ProductReviewsPageObjects.ValueOneStar(driver).getLocation());

		// Locatable Elm3 = (Locatable) GlobalPageObjects.CartLink(driver);
		// System.out.println(Elm3.getCoordinates().inViewPort());
		// System.out.println(GlobalPageObjects.CartLink(driver).getLocation());

		// Locatable Elm4 = (Locatable) MainNavObjects.MainNavWomenLink(driver);
		// System.out.println(Elm4.getCoordinates().inViewPort());
		// System.out.println(MainNavObjects.MainNavWomenLink(driver).getLocation());

		// System.out.println(GlobalProductPageObjects.GlobalSiteNotice(driver).getLocation());
		// System.out.println(ProductReviewsPageObjects.ReviewRewardsMessage(driver).getLocation());
	}

	@When("^I click on the Be the first to review this product link under the Reviews tab$")
	public void i_click_on_the_Be_the_first_to_review_this_product_link_under_the_Reviews_tab() throws Throwable {
		GlobalProductPageObjects.ReviewsTab(driver).click();
		GlobalProductPageObjects.FirsttoReviewLink(driver).click();
	}

	@Then("^I am directed to Review page$")
	public void i_am_directed_to_Review_page() throws Throwable {
		assertTrue(ProductReviewsPageObjects.ProductReviewsFields(driver).isDisplayed());
		assertEquals(ProductReviewsPageObjects.ProductReviewsTitle(driver).getText().toUpperCase(), "PRODUCT REVIEWS");
	}

	@Given("^I am on review page$")
	public void i_am_on_review_page() throws Throwable {
		Actions a1 = new Actions(driver);
		a1.moveToElement(MainNavObjects.MainNavMenLink(driver)).build().perform();
		MainNavObjects.MainNavMenNewArrivals(driver).click();
		linktext = CategoryPageObjects.FirstProductLink(driver).getText();
		CategoryPageObjects.FirstProductLink(driver).click();
		assertEquals(linktext, SimpleProductPageObjects.ProductTitle2(driver));
		assertTrue(GlobalProductPageObjects.ReviewsDiv(driver).isDisplayed());
		GlobalProductPageObjects.AddYourReviewLink(driver).click();
		assertTrue(ProductReviewsPageObjects.ProductReviewsFields(driver).isDisplayed());
		assertTrue(ProductReviewsPageObjects.ReviewExtraInfo(driver).isDisplayed());
		assertEquals(ProductReviewsPageObjects.ProductReviewsTitle(driver).getText().toUpperCase(), "PRODUCT REVIEWS");

	}

	@Given("^I want to write a review$")
	public void i_want_to_write_a_review() throws Throwable {
		// I f@#&*ng love writing reviews
	}

	@When("^I fill out the review sections$")
	public void i_fill_out_the_review_sections() throws Throwable {
		ProductReviewsPageObjects.ValueOneStar(driver).click();
		ProductReviewsPageObjects.QualityFourStar(driver).click();
		ProductReviewsPageObjects.PriceTwoStar(driver).click();
		ProductReviewsPageObjects.ReviewField(driver).clear();
		ProductReviewsPageObjects.ReviewField(driver).sendKeys("this is a test");
		ProductReviewsPageObjects.SummaryField(driver).clear();
		ProductReviewsPageObjects.SummaryField(driver).sendKeys("test");
		ProductReviewsPageObjects.NicknameField(driver).clear();
		ProductReviewsPageObjects.NicknameField(driver).sendKeys("testy");
	}

	@When("^press Submit Review button$")
	public void press_Submit_Review_button() throws Throwable {
		ProductReviewsPageObjects.SubmitReviewButton(driver).click();
	}

	@Then("^my review is submitted and saved$")
	public void my_review_is_submitted_and_saved() throws Throwable {
		assertTrue(ProductReviewsPageObjects.ReviewSuccessMessage(driver).isDisplayed());
		assertEquals(ProductReviewsPageObjects.ReviewSuccessMessage(driver).getText(),
				"Your review has been accepted for moderation.");
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

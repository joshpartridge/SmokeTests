package DemoSite.SmokeTests;

import static org.junit.Assert.*;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.apache.commons.lang3.text.WordUtils;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import java.util.regex.Pattern;

import org.openqa.selenium.*;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import DemoSitePageObjects.AccessoriesPageObjects;
import DemoSitePageObjects.AccountInformationPageObjects;
import DemoSitePageObjects.AccountLinkPageObjects;
import DemoSitePageObjects.AddressBookPageObjects;
import DemoSitePageObjects.CategoryPageObjects;
import DemoSitePageObjects.CategoryStaticContentPageObjects;
import DemoSitePageObjects.ComparePopupPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.MiniCartObjects;
import DemoSitePageObjects.MyAccountPageObjects;
import DemoSitePageObjects.NotLoggedInCheckoutPageObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
import DemoSitePageObjects.WishlistPageObjects;
import Driver.Driver;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.GlobalProductPageObjects;
import DemoSitePageObjects.LoginPageObjects;

public class CompareStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	public static String text;
	public String winHandleBefore;

	@Given("^Compare function is enabled$")
	public void compare_function_is_enabled() throws Throwable {
		// yeah it's enabled
	}

	@Given("^I am on product detail page$")
	public void i_am_on_product_detail_page() throws Throwable {
		MainNavObjects.MainNavMenLink(driver).click();
		CategoryStaticContentPageObjects.SubCategoryImage4(driver).click();
		text = CategoryPageObjects.FourthProductLinkText(driver).toLowerCase();
		CategoryPageObjects.FourthProductImage(driver).click();
		assertEquals(text, SimpleProductPageObjects.ProductTitle1(driver).toLowerCase());
		assertEquals(text, SimpleProductPageObjects.ProductTitle2(driver).toLowerCase());
	}

	@When("^I click on the Add to Compare link$")
	public void i_click_on_the_Add_to_Compare_link() throws Throwable {
		GlobalProductPageObjects.AddtoCompareLink(driver).click();
	}

	@Then("^that product should be added to comparison list$")
	public void that_product_should_be_added_to_comparison_list() throws Throwable {

		GlobalPageObjects.AccountLink(driver).click();
		AccountLinkPageObjects.MyAccountLink(driver).click();

		/*
		 * This next section was a little tricky because I wanted to verify
		 * elements in a new window that is opened when clicking on the compare
		 * link. By getting the different window handles you can switch back and
		 * forth between windows.
		 */

		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();
		// Perform the click operation that opens new window
		MyAccountPageObjects.CompareButton(driver).click();
		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		// Perform the actions on new window
		assertEquals(driver.getTitle(), "Products Comparison List - Magento Enterprise Edition");
		assertEquals(ComparePopupPageObjects.CompareHeader(driver).getText().toUpperCase(), "COMPARE PRODUCTS");
		assertTrue(driver
				.findElement(By.cssSelector("h2.product-name > a[title=\"" + WordUtils.capitalizeFully(text) + "\"]"))
				.isDisplayed());
		// Close the new window, if that window no more required
		driver.close();
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		// Continue with original browser (first window)
	}

	@Then("^a page notification should be displayed saying product was added to comparison list$")
	public void a_page_notification_should_be_displayed_saying_product_was_added_to_comparison_list() throws Throwable {
		assertTrue(GlobalProductPageObjects.SuccessMessage(driver).isDisplayed());
		assertEquals(GlobalProductPageObjects.SuccessMessage(driver).getText(),
				"The product " + WordUtils.capitalizeFully(text) + " has been added to comparison list.");
	}

	@Given("^I have product in my comparison list$")
	public void i_have_product_in_my_comparison_list() throws Throwable {
		Actions a1 = new Actions(driver);
		a1.moveToElement(MainNavObjects.MainNavWomenLink(driver)).build().perform();
		MainNavObjects.MainNavWomenNewArrivals(driver).click();

		CategoryPageObjects.SecondProductAddToCompareLink(driver).click();
		assertTrue(CategoryPageObjects.SuccessMessage(driver).isDisplayed());
		CategoryPageObjects.ThirdProductAddToCompareLink(driver).click();
		assertTrue(CategoryPageObjects.SuccessMessage(driver).isDisplayed());
	}

	@When("^I click the compare button$")
	public void i_click_the_compare_button() throws Throwable {
		GlobalPageObjects.AccountLink(driver).click();
		AccountLinkPageObjects.MyAccountLink(driver).click();

		// Click button action is at beginning of next step due to switching windows
	}

	@Then("^Comparison page should be displayed with products in my comparison list$")
	public void comparison_page_should_be_displayed_with_products_in_my_comparison_list() throws Throwable {
		// Store the current window handle
		String winHandleBefore = driver.getWindowHandle();
		// Perform the click operation that opens new window
		MyAccountPageObjects.CompareButton(driver).click();
		// Switch to new window opened
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		// Perform the actions on new window
		assertEquals(driver.getTitle(), "Products Comparison List - Magento Enterprise Edition");
		assertEquals(ComparePopupPageObjects.CompareHeader(driver).getText().toUpperCase(), "COMPARE PRODUCTS");
		assertTrue(ComparePopupPageObjects.FirstProductImage(driver).isDisplayed());
		assertTrue(ComparePopupPageObjects.SecondProductImage(driver).isDisplayed());
		// Close the new window, if that window no more required
		driver.close();
		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);
		// Continue with original browser (first window)
	}

	@Given("^I want to remove product$")
	public void i_want_to_remove_product() throws Throwable {
		// Get these MOTHEREFFING PRODUCTS OFF MY MOTHEREFFING COMPARE PAGE
	}

	@When("^I click on the Clear All link under compare products section$")
	public void i_click_on_the_Clear_All_link_under_compare_products_section() throws Throwable {
		GlobalPageObjects.AccountLink(driver).click();
		AccountLinkPageObjects.MyAccountLink(driver).click();
		MyAccountPageObjects.ClearAllCompareLink(driver).click();
		assertTrue(closeAlertAndGetItsText()
				.matches("^Are you sure you would like to remove all products from your comparison[\\s\\S]$"));
	}

	@Then("^All products are removed from compare section$")
	public void all_products_are_removed_from_compare_section() throws Throwable {
		assertTrue(MyAccountPageObjects.SuccessMessageText(driver).isDisplayed());
		assertEquals("The comparison list was cleared.", MyAccountPageObjects.SuccessMessageText(driver).getText());
		assertTrue(MyAccountPageObjects.EmptyCompareMessage(driver).isDisplayed());
		assertEquals("You have no items to compare.", MyAccountPageObjects.EmptyCompareMessage(driver).getText());
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

}

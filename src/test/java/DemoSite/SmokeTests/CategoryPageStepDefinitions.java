package DemoSite.SmokeTests;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import static org.junit.Assert.*;

import DemoSitePageObjects.AccessoriesBagsLuggagePageObjects;
import DemoSitePageObjects.AccessoriesEyewearPageObjects;
import DemoSitePageObjects.AccessoriesJewelryPageObjects;
import DemoSitePageObjects.AccessoriesPageObjects;
import DemoSitePageObjects.AccessoriesShoesPageObjects;
import DemoSitePageObjects.CategoryPageObjects;
import DemoSitePageObjects.CategoryStaticContentPageObjects;
import DemoSitePageObjects.ElectronicsAudioPageObjects;
import DemoSitePageObjects.ElectronicsPageObjects;
import DemoSitePageObjects.ElectronicsPhotographyPageObjects;
import DemoSitePageObjects.GiftCardPageObjects;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.HomeDecorBedBathPageObjects;
import DemoSitePageObjects.HomeDecorBooksMusicPageObjects;
import DemoSitePageObjects.HomeDecorDecorativeAccentsPageObjects;
import DemoSitePageObjects.HomeDecorPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.MenBlazersPageObjects;
import DemoSitePageObjects.MenFootwearPageObjects;
import DemoSitePageObjects.MenNewArrivalsPageObjects;
import DemoSitePageObjects.MenPageObjects;
import DemoSitePageObjects.MenPantsDenimPageObjects;
import DemoSitePageObjects.MenShirtsPageObjects;
import DemoSitePageObjects.MenTeesKnitsandPolosPageObjects;
import DemoSitePageObjects.SportingGoodsBasketballPageObjects;
import DemoSitePageObjects.SportingGoodsPageObjects;
import DemoSitePageObjects.SubcategoryPageObjects;
import DemoSitePageObjects.VIPPageObjects;
import DemoSitePageObjects.WomenDressesSkirtsPageObjects;
import DemoSitePageObjects.WomenElisaIlanaPageObjects;
import DemoSitePageObjects.WomenNewArrivalsPageObjects;
import DemoSitePageObjects.WomenPageObjects;
import DemoSitePageObjects.WomenPantsDenimPageObjects;
import DemoSitePageObjects.WomenTopsBlousesPageObjects;
import Driver.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CategoryPageStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private static String text;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@When("^I select a category from the main navigation$")
	public void i_select_a_category_from_the_main_navigation() throws Throwable {
		text = MainNavObjects.MainNavMenLink(driver).getText();
		MainNavObjects.MainNavMenLink(driver).click();
	}

	@Then("^I should be directed to that category page$")
	public void i_should_be_directed_to_that_category_page() throws Throwable {
		assertEquals(GlobalPageObjects.PageTitle(driver).toUpperCase(), text.toUpperCase());
		assertEquals(text.toUpperCase(), CategoryPageObjects.CategoryPageTitle(driver).toUpperCase());
	}

	@Given("^that I am on a category page$")
	public void that_I_am_on_a_category_page() throws Throwable {
		MainNavObjects.MainNavWomenLink(driver).click();
	}

	@When("^I select a category with product from the main navigation$")
	public void i_select_a_category_with_product_from_the_main_navigation() throws Throwable {
		text = MainNavObjects.MainNavElectronicsLink(driver).getText();
		MainNavObjects.MainNavElectronicsLink(driver).click();
	}

	@Then("^the category page should have product on it$")
	public void the_category_page_should_have_product_on_it() throws Throwable {
		assertTrue(CategoryPageObjects.FirstProductImage(driver).isDisplayed());
		assertTrue(CategoryPageObjects.SecondProductImage(driver).isDisplayed());
		assertTrue(CategoryPageObjects.ThirdProductImage(driver).isDisplayed());
		assertTrue(CategoryPageObjects.FourthProductImage(driver).isDisplayed());
		assertTrue(CategoryPageObjects.FirstProductLink(driver).isDisplayed());
		assertTrue(CategoryPageObjects.SecondProductLink(driver).isDisplayed());
		assertTrue(CategoryPageObjects.ThirdProductLink(driver).isDisplayed());
		assertTrue(CategoryPageObjects.FourthProductLink(driver).isDisplayed());
	}

	@Given("^that I am on a category page with product$")
	public void that_I_am_on_a_category_page_with_product() throws Throwable {
		text = MainNavObjects.MainNavSportingGoodsLink(driver).getText();
		MainNavObjects.MainNavSportingGoodsLink(driver).click();
		assertEquals(text.toUpperCase(), CategoryPageObjects.CategoryPageTitle(driver).toUpperCase());
		assertTrue(CategoryPageObjects.FirstProductImage(driver).isDisplayed());
		assertTrue(CategoryPageObjects.SecondProductImage(driver).isDisplayed());
		assertTrue(CategoryPageObjects.ThirdProductImage(driver).isDisplayed());
		assertTrue(CategoryPageObjects.FourthProductImage(driver).isDisplayed());
		assertTrue(CategoryPageObjects.FirstProductLink(driver).isDisplayed());
		assertTrue(CategoryPageObjects.SecondProductLink(driver).isDisplayed());
		assertTrue(CategoryPageObjects.ThirdProductLink(driver).isDisplayed());
		assertTrue(CategoryPageObjects.FourthProductLink(driver).isDisplayed());
	}

	@When("^I select a category with static content from the main navigation$")
	public void i_select_a_category_with_static_content_from_the_main_navigation() throws Throwable {
		text = MainNavObjects.MainNavWomenLink(driver).getText();
		MainNavObjects.MainNavWomenLink(driver).click();
	}

	@Given("^I am on a static content category page$")
	public void i_am_on_a_static_content_category_page() throws Throwable {
		text = MainNavObjects.MainNavMenLink(driver).getText().toUpperCase();
		MainNavObjects.MainNavMenLink(driver).click();
		assertEquals(text, driver.getTitle().toUpperCase());
		assertEquals(text, CategoryStaticContentPageObjects.CategoryName(driver).getText().toUpperCase());
		assertTrue(CategoryStaticContentPageObjects.CategoryImage(driver).isDisplayed());
		assertTrue(CategoryStaticContentPageObjects.SubCategoryImage1(driver).isDisplayed());
		assertTrue(CategoryStaticContentPageObjects.SubCategoryImage2(driver).isDisplayed());
		assertTrue(CategoryStaticContentPageObjects.SubCategoryImage3(driver).isDisplayed());
		assertTrue(CategoryStaticContentPageObjects.SubCategoryImage4(driver).isDisplayed());
		assertTrue(CategoryStaticContentPageObjects.SubCategoryImageSpan1(driver).isDisplayed());
		assertTrue(CategoryStaticContentPageObjects.SubCategoryImageSpan2(driver).isDisplayed());
		assertTrue(CategoryStaticContentPageObjects.SubCategoryImageSpan3(driver).isDisplayed());
		assertTrue(CategoryStaticContentPageObjects.SubCategoryImageSpan4(driver).isDisplayed());
	}

	@When("^I select a subcategory image$")
	public void i_select_a_subcategory_image() throws Throwable {

		text = CategoryStaticContentPageObjects.SubCategoryImageSpan1(driver).getText().toUpperCase();
		CategoryStaticContentPageObjects.SubCategoryImage1(driver).click();
		assertEquals(text, SubcategoryPageObjects.SubcategoryTitle1(driver).getText());
		assertEquals(text, SubcategoryPageObjects.SubcategoryTitle2(driver).getText());
		assertEquals(text + " - " + SubcategoryPageObjects.CategoryPageTitle(driver).toUpperCase(),
				driver.getTitle().toUpperCase());
		driver.navigate().back();

		text = CategoryStaticContentPageObjects.SubCategoryImageSpan2(driver).getText().toUpperCase();
		CategoryStaticContentPageObjects.SubCategoryImage2(driver).click();
		assertEquals(text, SubcategoryPageObjects.SubcategoryTitle1(driver).getText());
		assertEquals(text, SubcategoryPageObjects.SubcategoryTitle2(driver).getText());
		assertEquals(text + " - " + SubcategoryPageObjects.CategoryPageTitle(driver).toUpperCase(),
				driver.getTitle().toUpperCase());
		driver.navigate().back();

		text = CategoryStaticContentPageObjects.SubCategoryImageSpan3(driver).getText().toUpperCase();
		CategoryStaticContentPageObjects.SubCategoryImage3(driver).click();
		assertEquals(text, SubcategoryPageObjects.SubcategoryTitle1(driver).getText());
		assertEquals(text, SubcategoryPageObjects.SubcategoryTitle2(driver).getText());
		assertEquals(text + " - " + SubcategoryPageObjects.CategoryPageTitle(driver).toUpperCase(),
				driver.getTitle().toUpperCase());
		driver.navigate().back();

		text = CategoryStaticContentPageObjects.SubCategoryImageSpan4(driver).getText().toUpperCase();
		CategoryStaticContentPageObjects.SubCategoryImage4(driver).click();
		assertEquals(text, SubcategoryPageObjects.SubcategoryTitle1(driver).getText());
		assertEquals(text, SubcategoryPageObjects.SubcategoryTitle2(driver).getText());
		assertEquals(text + " - " + SubcategoryPageObjects.CategoryPageTitle(driver).toUpperCase(),
				driver.getTitle().toUpperCase());
		driver.navigate().back();

	}

	@Then("^I should be directed to that subcategory$")
	public void i_should_be_directed_to_that_subcategory() throws Throwable {
		// all subcategory assertions are made in previous step
	}

}

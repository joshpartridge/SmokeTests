package DemoSite.SmokeTests;

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
import DemoSitePageObjects.SearchResultsPageObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
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

public class SubcategoryStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private static String text;
	private String productTitle;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Given("^I am on a category page$")
	public void i_am_on_a_category_page() throws Throwable {
		text = MainNavObjects.MainNavAccessoriesLink(driver).getText().toUpperCase();
		MainNavObjects.MainNavAccessoriesLink(driver).click();
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

	@When("^I click on a subcategory link$")
	public void i_click_on_a_subcategory_link() throws Throwable {

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

	@Then("^I should be directed to corresponding subcategory page$")
	public void i_should_be_directed_to_corresponding_subcategory_page() throws Throwable {
		// Assertions made in previous step
	}

	@Given("^that I am on a subcategory page$")
	public void that_I_am_on_a_subcategory_page() throws Throwable {
		MainNavObjects.MainNavHomeDecorLink(driver).click();
		text = CategoryStaticContentPageObjects.SubCategoryImageSpan2(driver).getText().toUpperCase();
		CategoryStaticContentPageObjects.SubCategoryImage2(driver).click();
		assertEquals(text, SubcategoryPageObjects.SubcategoryTitle1(driver).getText());
		assertEquals(text, SubcategoryPageObjects.SubcategoryTitle2(driver).getText());
		assertEquals(text + " - " + SubcategoryPageObjects.CategoryPageTitle(driver).toUpperCase(),
				driver.getTitle().toUpperCase());
	}

	@When("^I select a product Image/Name from the subcategory page$")
	public void i_select_a_product_Image_Name_from_the_subcategory_page() throws Throwable {
		productTitle = SearchResultsPageObjects.FirstProductLinkText(driver);
		SearchResultsPageObjects.FirstProductImage(driver).click();
		assertEquals(productTitle.toUpperCase(), SimpleProductPageObjects.ProductTitle1(driver).toUpperCase());
		assertEquals(productTitle.toUpperCase(), SimpleProductPageObjects.ProductTitle2(driver).toUpperCase());
		assertEquals(productTitle.toUpperCase() + " - " + SimpleProductPageObjects.SubCategoryLink(driver).getText()
				+ " - " + SimpleProductPageObjects.CategoryLink(driver).getText(), driver.getTitle().toUpperCase());
	}

	@Given("^there is simple product on the subcategory page$")
	public void there_is_simple_product_on_the_subcategory_page() throws Throwable {
		// Yes there's simple product
	}

}

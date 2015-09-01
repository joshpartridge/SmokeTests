package DemoSite.SmokeTests;

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
import DemoSitePageObjects.AccessoriesBagsLuggagePageObjects;
import DemoSitePageObjects.AccessoriesEyewearPageObjects;
import DemoSitePageObjects.AccessoriesJewelryPageObjects;
import DemoSitePageObjects.AccessoriesPageObjects;
import DemoSitePageObjects.AccessoriesShoesPageObjects;
import DemoSitePageObjects.AccountInformationPageObjects;
import DemoSitePageObjects.AccountLinkPageObjects;
import DemoSitePageObjects.AddressBookPageObjects;
import DemoSitePageObjects.CategoryPageObjects;
import DemoSitePageObjects.CategoryStaticContentPageObjects;
import DemoSitePageObjects.ComparePopupPageObjects;
import DemoSitePageObjects.ContactUsPageObjects;
import DemoSitePageObjects.CrumbTrayPageObjects;
import DemoSitePageObjects.ElectronicsAudioPageObjects;
import DemoSitePageObjects.ElectronicsPageObjects;
import DemoSitePageObjects.ElectronicsPhotographyPageObjects;
import DemoSitePageObjects.GiftCardPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.MenBlazersPageObjects;
import DemoSitePageObjects.MenFootwearPageObjects;
import DemoSitePageObjects.MenNewArrivalsPageObjects;
import DemoSitePageObjects.MenPageObjects;
import DemoSitePageObjects.MenPantsDenimPageObjects;
import DemoSitePageObjects.MenShirtsPageObjects;
import DemoSitePageObjects.MenTeesKnitsandPolosPageObjects;
import DemoSitePageObjects.MiniCartObjects;
import DemoSitePageObjects.MyAccountPageObjects;
import DemoSitePageObjects.NotLoggedInCheckoutPageObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
import DemoSitePageObjects.SiteMapCategoryPageObjects;
import DemoSitePageObjects.SportingGoodsBasketballPageObjects;
import DemoSitePageObjects.SportingGoodsPageObjects;
import DemoSitePageObjects.VIPPageObjects;
import DemoSitePageObjects.WishlistPageObjects;
import DemoSitePageObjects.WomenDressesSkirtsPageObjects;
import DemoSitePageObjects.WomenElisaIlanaPageObjects;
import DemoSitePageObjects.WomenNewArrivalsPageObjects;
import DemoSitePageObjects.WomenPageObjects;
import DemoSitePageObjects.WomenPantsDenimPageObjects;
import DemoSitePageObjects.WomenTopsBlousesPageObjects;
import Driver.Driver;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.GlobalProductPageObjects;
import DemoSitePageObjects.HomeDecorBedBathPageObjects;
import DemoSitePageObjects.HomeDecorBooksMusicPageObjects;
import DemoSitePageObjects.HomeDecorDecorativeAccentsPageObjects;
import DemoSitePageObjects.HomeDecorPageObjects;
import DemoSitePageObjects.LoginPageObjects;

public class SiteMapStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	public static String text;
	public String winHandleBefore;

	@Given("^there is a site map page$")
	public void there_is_a_site_map_page() throws Throwable {
		// all good websites have a sitemap
	}

	@Given("^I am on site homepage$")
	public void i_am_on_site_homepage() throws Throwable {
		driver.get(baseUrl);
		assertEquals("Home page", driver.getTitle());
		assertEquals("http://demo114.thegrandriver.net/", driver.getCurrentUrl());
	}

	@Given("^there is a site map link$")
	public void there_is_a_site_map_link() throws Throwable {
		assertTrue(CrumbTrayPageObjects.SiteMapLink(driver).isDisplayed());

	}

	@When("^I click on the site map link$")
	public void i_click_on_the_site_map_link() throws Throwable {
		CrumbTrayPageObjects.SiteMapLink(driver).click();
	}

	@Then("^I am taken to site map$")
	public void i_am_taken_to_site_map() throws Throwable {
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/catalog/seo_sitemap/category/");
		assertEquals(driver.getTitle(), "Site Map");
		assertEquals(SiteMapCategoryPageObjects.SiteMapHeader(driver).getText().toUpperCase(), "CATEGORIES");

	}

	@Given("^I am on site map$")
	public void i_am_on_site_map() throws Throwable {
		CrumbTrayPageObjects.SiteMapLink(driver).click();
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/catalog/seo_sitemap/category/");
		assertEquals(driver.getTitle(), "Site Map");
		assertEquals(SiteMapCategoryPageObjects.SiteMapHeader(driver).getText().toUpperCase(), "CATEGORIES");
	}

	@When("^I click a link on the site map$")
	public void i_click_a_link_on_the_site_map() throws Throwable {
		// Probably should have used a table in the feature file for this step

		text = SiteMapCategoryPageObjects.ElectronicsLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.ElectronicsLink(driver).click();
		assertEquals(driver.getTitle(), ElectronicsPageObjects.SupposedElectronicsPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.ElectronicsAudioLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.ElectronicsAudioLink(driver).click();
		assertEquals(driver.getTitle(), ElectronicsAudioPageObjects.SupposedElectronicsAudioPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.ElectronicsPhotographyLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.ElectronicsPhotographyLink(driver).click();
		assertEquals(driver.getTitle(), ElectronicsPhotographyPageObjects.SupposedElectronicsPhotographyPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.GiftCardLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.GiftCardLink(driver).click();
		assertEquals(driver.getTitle(), GiftCardPageObjects.SupposedGiftCardPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.WomenLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.WomenLink(driver).click();
		assertEquals(driver.getTitle(), WomenPageObjects.SupposedWomenPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.WomenNewArrivalsLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.WomenNewArrivalsLink(driver).click();
		assertEquals(driver.getTitle(), WomenNewArrivalsPageObjects.SupposedWomenNewArrivalsPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.WomenTopsBlousesLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.WomenTopsBlousesLink(driver).click();
		assertEquals(driver.getTitle(), WomenTopsBlousesPageObjects.SupposedWomenTopsBlousesPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.WomenPantsDenimLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.WomenPantsDenimLink(driver).click();
		assertEquals(driver.getTitle(), WomenPantsDenimPageObjects.SupposedWomenPantsDenimPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.WomenDressesSkirtsLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.WomenDressesSkirtsLink(driver).click();
		assertEquals(driver.getTitle(), WomenDressesSkirtsPageObjects.SupposedWomenDressesSkirtsPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.WomenElisaIlanaLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.WomenElisaIlanaLink(driver).click();
		assertEquals(driver.getTitle(), WomenElisaIlanaPageObjects.SupposedWomenElisaIlanaPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.MenLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.MenLink(driver).click();
		assertEquals(driver.getTitle(), MenPageObjects.SupposedMenPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.MenNewArrivalsLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.MenNewArrivalsLink(driver).click();
		assertEquals(driver.getTitle(), MenNewArrivalsPageObjects.SupposedMenNewArrivalsPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.MenShirtsLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.MenShirtsLink(driver).click();
		assertEquals(driver.getTitle(), MenShirtsPageObjects.SupposedMenShirtsPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.MenTeesKnitsandPolosLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.MenTeesKnitsandPolosLink(driver).click();
		assertEquals(driver.getTitle(), MenTeesKnitsandPolosPageObjects.SupposedMenTeesKnitsandPolosPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.MenPantsDenimLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.MenPantsDenimLink(driver).click();
		assertEquals(driver.getTitle(), MenPantsDenimPageObjects.SupposedMenPantsDenimPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.MenBlazersLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.MenBlazersLink(driver).click();
		assertEquals(driver.getTitle(), MenBlazersPageObjects.SupposedMenBlazersPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.MenFootwearLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.MenFootwearLink(driver).click();
		assertEquals(driver.getTitle(), MenFootwearPageObjects.SupposedMenFootwearPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.SportingGoodsLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.SportingGoodsLink(driver).click();
		assertEquals(driver.getTitle(), SportingGoodsPageObjects.SupposedSportingGoodsPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.BasketballLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.BasketballLink(driver).click();
		assertEquals(driver.getTitle(), SportingGoodsBasketballPageObjects.SupposedSportingGoodsBasketballPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.BasketballBasketballsLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.BasketballBasketballsLink(driver).click();
		assertEquals(driver.getTitle(), "Basketballs - Basketball - Sporting Goods");
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.BasketballShoesLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.BasketballShoesLink(driver).click();
		assertEquals(driver.getTitle(), "Shoes - Basketball - Sporting Goods");
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.FisherLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.FisherLink(driver).click();
		assertEquals(driver.getTitle(), "Fisher");
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.AccessoriesLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.AccessoriesLink(driver).click();
		assertEquals(driver.getTitle(), AccessoriesPageObjects.SupposedAccessoriesPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.AccessoriesEyewearLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.AccessoriesEyewearLink(driver).click();
		assertEquals(driver.getTitle(), AccessoriesEyewearPageObjects.SupposedAccessoriesEyewearPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.AccessoriesJewelryLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.AccessoriesJewelryLink(driver).click();
		assertEquals(driver.getTitle(), AccessoriesJewelryPageObjects.SupposedAccessoriesJewelryPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.AccessoriesShoesLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.AccessoriesShoesLink(driver).click();
		assertEquals(driver.getTitle(), AccessoriesShoesPageObjects.SupposedAccessoriesShoesPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.AccessoriesBagsLuggageLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.AccessoriesBagsLuggageLink(driver).click();
		assertEquals(driver.getTitle(), AccessoriesBagsLuggagePageObjects.SupposedAccessoriesBagsLuggagePageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.HomeDecorLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.HomeDecorLink(driver).click();
		assertEquals(driver.getTitle(), HomeDecorPageObjects.SupposedHomeDecorPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.BooksMusicLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.BooksMusicLink(driver).click();
		assertEquals(driver.getTitle(), HomeDecorBooksMusicPageObjects.SupposedHomeDecorBooksMusicPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.BedBathLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.BedBathLink(driver).click();
		assertEquals(driver.getTitle(), HomeDecorBedBathPageObjects.SupposedHomeDecorBedBathPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.DecorativeAccentsLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.DecorativeAccentsLink(driver).click();
		assertEquals(driver.getTitle(),
				HomeDecorDecorativeAccentsPageObjects.SupposedHomeDecorDecorativeAccentsPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.VIPLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.VIPLink(driver).click();
		assertEquals(driver.getTitle(), VIPPageObjects.SupposedVIPPageTitle());
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.SaleLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.SaleLink(driver).click();
		assertEquals(driver.getTitle(), "Sale");
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.SaleWomenLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.SaleWomenLink(driver).click();
		assertEquals(driver.getTitle(), "Women - Sale");
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.SaleMenLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.SaleMenLink(driver).click();
		assertEquals(driver.getTitle(), "Men - Sale");
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.SaleAccessoriesLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.SaleAccessoriesLink(driver).click();
		assertEquals(driver.getTitle(), "Accessories - Sale");
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

		text = SiteMapCategoryPageObjects.SaleHomeDecorLink(driver).getText().toUpperCase();
		SiteMapCategoryPageObjects.SaleHomeDecorLink(driver).click();
		assertEquals(driver.getTitle(), "Home & Decor - Sale");
		assertEquals(GlobalPageObjects.Header(driver).getText(), text);
		driver.navigate().back();

	}

	@Then("^I am taken to the correct page$")
	public void i_am_taken_to_the_correct_page() throws Throwable {
		// all assertions are made in previous step
	}

}

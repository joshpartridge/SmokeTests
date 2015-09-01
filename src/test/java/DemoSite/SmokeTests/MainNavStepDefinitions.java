package DemoSite.SmokeTests;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import DemoSitePageObjects.AccessoriesBagsLuggagePageObjects;
import DemoSitePageObjects.AccessoriesEyewearPageObjects;
import DemoSitePageObjects.AccessoriesJewelryPageObjects;
import DemoSitePageObjects.AccessoriesPageObjects;
import DemoSitePageObjects.AccessoriesShoesPageObjects;
import DemoSitePageObjects.ElectronicsAudioPageObjects;
import DemoSitePageObjects.ElectronicsPageObjects;
import DemoSitePageObjects.ElectronicsPhotographyPageObjects;
import DemoSitePageObjects.GiftCardPageObjects;
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
import DemoSitePageObjects.VIPPageObjects;
import DemoSitePageObjects.WomenDressesSkirtsPageObjects;
import DemoSitePageObjects.WomenElisaIlanaPageObjects;
import DemoSitePageObjects.WomenNewArrivalsPageObjects;
import DemoSitePageObjects.WomenPageObjects;
import DemoSitePageObjects.WomenPantsDenimPageObjects;
import DemoSitePageObjects.WomenTopsBlousesPageObjects;
import Driver.Driver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MainNavStepDefinitions {

	MainNavObjects mainnavobjects;
	private WebDriver driver = Driver.driver;
	private String baseUrl = Driver.getBaseUrl();
	// private String baseUrl = getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;

	@Given("^I am on a page where Main Navigation is visible$")
	public void i_am_on_a_page_where_Main_Navigation_is_visible() throws Throwable {
		System.out.println(baseUrl);
		// I used this when I was playing around with before and after hooks
		if (driver == null) {
			System.out.println("driver is null goddammit");
		}
		driver.get(baseUrl);
	}

	@When("^I hover over main navigation links$")
	public void i_hover_over_main_navigation_links() throws Throwable {
		Actions a1 = new Actions(driver);
		a1.moveToElement(MainNavObjects.MainNavWomenLink(driver)).build().perform();
		assertTrue(MainNavObjects.MainNavWomenViewAll(driver).isDisplayed());
		a1.moveToElement(MainNavObjects.MainNavMenLink(driver)).build().perform();
		assertTrue(MainNavObjects.MainNavMenViewAll(driver).isDisplayed());
		a1.moveToElement(MainNavObjects.MainNavAccessoriesLink(driver)).build().perform();
		assertTrue(MainNavObjects.MainNavAccessoriesViewAll(driver).isDisplayed());
		a1.moveToElement(MainNavObjects.MainNavHomeDecorLink(driver)).build().perform();
		assertTrue(MainNavObjects.MainNavHomeDecorViewAll(driver).isDisplayed());
		a1.moveToElement(MainNavObjects.MainNavElectronicsLink(driver)).build().perform();
		assertTrue(MainNavObjects.MainNavElectronicsViewAll(driver).isDisplayed());
		a1.moveToElement(MainNavObjects.MainNavSportingGoodsLink(driver)).build().perform();
		assertTrue(MainNavObjects.MainNavSportingGoodsViewAll(driver).isDisplayed());
	}

	@Then("^corresponding menu dropdown displays$")
	public void corresponding_menu_dropdown_displays() throws Throwable {
		// I put all the assertion steps in the previous When step as that
		// was easier to do
		// System.out.println("Then step is executed");
	}

	@When("^I click on product category link$")
	public void i_click_on_product_category_link() throws Throwable {
		// System.out.println("When step is executed");
		MainNavObjects.MainNavWomenLink(driver).click();
		// System.out.println(WomenPageObjects.WomenPageTitle(driver));
		assertTrue(WomenPageObjects.WomenPageTitle(driver).equals(WomenPageObjects.SupposedWomenPageTitle()));
		
		MainNavObjects.MainNavMenLink(driver).click();
		assertTrue(MenPageObjects.MenPageTitle(driver).equals(MenPageObjects.SupposedMenPageTitle()));
		
		MainNavObjects.MainNavAccessoriesLink(driver).click();
		assertTrue(AccessoriesPageObjects.AccessoriesPageTitle(driver)
				.equals(AccessoriesPageObjects.SupposedAccessoriesPageTitle()));
		
		MainNavObjects.MainNavHomeDecorLink(driver).click();
		// System.out.println(HomeDecorPageObjects.HomeDecorPageTitle(driver));
		assertTrue(HomeDecorPageObjects.HomeDecorPageTitle(driver)
				.equals(HomeDecorPageObjects.SupposedHomeDecorPageTitle()));
		
		MainNavObjects.MainNavElectronicsLink(driver).click();
		assertTrue(ElectronicsPageObjects.ElectronicsPageTitle(driver)
				.equals(ElectronicsPageObjects.SupposedElectronicsPageTitle()));
		
		MainNavObjects.MainNavSportingGoodsLink(driver).click();
		assertTrue(SportingGoodsPageObjects.SportingGoodsPageTitle(driver)
				.equals(SportingGoodsPageObjects.SupposedSportingGoodsPageTitle()));
		
		MainNavObjects.MainNavVIPLink(driver).click();
		assertTrue(VIPPageObjects.VIPPageTitle(driver).equals(VIPPageObjects.SupposedVIPPageTitle()));
		
		MainNavObjects.MainNavGiftCardLink(driver).click();
		assertTrue(
				GiftCardPageObjects.GiftCardPageTitle(driver).equals(GiftCardPageObjects.SupposedGiftCardPageTitle()));
		
		MainNavObjects.MainNavWomenLink(driver).click();
		assertTrue(WomenPageObjects.WomenPageTitle(driver).equals("Women"));
	}

	@Then("^I am taken to product category page$")
	public void i_am_taken_to_product_category_page() throws Throwable {
		// All the assertions were made in the previous step again because it
		// was easier
		// System.out.println("Then step is executed");
	}

	@When("^I click on product subcategory link$")
	public void i_click_on_product_subcategory_link() throws Throwable {
		// System.out.println("When step is executed");
		Actions a1 = new Actions(driver);
		a1.moveToElement(MainNavObjects.MainNavWomenLink(driver)).build().perform();
		MainNavObjects.MainNavWomenViewAll(driver).click();
		assertTrue(WomenPageObjects.WomenPageTitle(driver).equals(WomenPageObjects.SupposedWomenPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavWomenLink(driver)).build().perform();
		MainNavObjects.MainNavWomenNewArrivals(driver).click();
		assertTrue(WomenNewArrivalsPageObjects.WomenNewArrivalsPageTitle(driver)
				.equals(WomenNewArrivalsPageObjects.SupposedWomenNewArrivalsPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavWomenLink(driver)).build().perform();
		MainNavObjects.MainNavWomenTopsBlouses(driver).click();
		assertTrue(WomenTopsBlousesPageObjects.WomenTopsBlousesPageTitle(driver)
				.equals(WomenTopsBlousesPageObjects.SupposedWomenTopsBlousesPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavWomenLink(driver)).build().perform();
		MainNavObjects.MainNavWomenPantsDenim(driver).click();
		assertTrue(WomenPantsDenimPageObjects.WomenPantsDenimPageTitle(driver)
				.equals(WomenPantsDenimPageObjects.SupposedWomenPantsDenimPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavWomenLink(driver)).build().perform();
		MainNavObjects.MainNavWomenDressesSkirts(driver).click();
		assertTrue(WomenDressesSkirtsPageObjects.WomenDressesSkirtsPageTitle(driver)
				.equals(WomenDressesSkirtsPageObjects.SupposedWomenDressesSkirtsPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavWomenLink(driver)).build().perform();
		MainNavObjects.MainNavWomenElisaIlana(driver).click();
		assertTrue(WomenElisaIlanaPageObjects.WomenElisaIlanaPageTitle(driver)
				.equals(WomenElisaIlanaPageObjects.SupposedWomenElisaIlanaPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavMenLink(driver)).build().perform();
		MainNavObjects.MainNavMenViewAll(driver).click();
		assertTrue(MenPageObjects.MenPageTitle(driver).equals(MenPageObjects.SupposedMenPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavMenLink(driver)).build().perform();
		MainNavObjects.MainNavMenNewArrivals(driver).click();
		assertTrue(MenNewArrivalsPageObjects.MenNewArrivalsPageTitle(driver)
				.equals(MenNewArrivalsPageObjects.SupposedMenNewArrivalsPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavMenLink(driver)).build().perform();
		MainNavObjects.MainNavMenShirts(driver).click();
		assertTrue(MenShirtsPageObjects.MenShirtsPageTitle(driver)
				.equals(MenShirtsPageObjects.SupposedMenShirtsPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavMenLink(driver)).build().perform();
		MainNavObjects.MainNavMenTeesKnitsandPolos(driver).click();
		assertTrue(MenTeesKnitsandPolosPageObjects.MenTeesKnitsandPolosPageTitle(driver)
				.equals(MenTeesKnitsandPolosPageObjects.SupposedMenTeesKnitsandPolosPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavMenLink(driver)).build().perform();
		MainNavObjects.MainNavMenPantsDenim(driver).click();
		assertTrue(MenPantsDenimPageObjects.MenPantsDenimPageTitle(driver)
				.equals(MenPantsDenimPageObjects.SupposedMenPantsDenimPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavMenLink(driver)).build().perform();
		MainNavObjects.MainNavMenBlazers(driver).click();
		assertTrue(MenBlazersPageObjects.MenBlazersPageTitle(driver)
				.equals(MenBlazersPageObjects.SupposedMenBlazersPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavMenLink(driver)).build().perform();
		MainNavObjects.MainNavMenFootwear(driver).click();
		assertTrue(MenFootwearPageObjects.MenFootwearPageTitle(driver)
				.equals(MenFootwearPageObjects.SupposedMenFootwearPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavAccessoriesLink(driver)).build().perform();
		MainNavObjects.MainNavAccessoriesViewAll(driver).click();
		assertTrue(AccessoriesPageObjects.AccessoriesPageTitle(driver)
				.equals(AccessoriesPageObjects.SupposedAccessoriesPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavAccessoriesLink(driver)).build().perform();
		MainNavObjects.MainNavAccessoriesEyewear(driver).click();
		assertTrue(AccessoriesEyewearPageObjects.AccessoriesEyewearPageTitle(driver)
				.equals(AccessoriesEyewearPageObjects.SupposedAccessoriesEyewearPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavAccessoriesLink(driver)).build().perform();
		MainNavObjects.MainNavAccessoriesJewelry(driver).click();
		assertTrue(AccessoriesJewelryPageObjects.AccessoriesJewelryPageTitle(driver)
				.equals(AccessoriesJewelryPageObjects.SupposedAccessoriesJewelryPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavAccessoriesLink(driver)).build().perform();
		MainNavObjects.MainNavAccessoriesShoes(driver).click();
		assertTrue(AccessoriesShoesPageObjects.AccessoriesShoesPageTitle(driver)
				.equals(AccessoriesShoesPageObjects.SupposedAccessoriesShoesPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavAccessoriesLink(driver)).build().perform();
		MainNavObjects.MainNavAccessoriesBagsLuggage(driver).click();
		assertTrue(AccessoriesBagsLuggagePageObjects.AccessoriesBagsLuggagePageTitle(driver)
				.equals(AccessoriesBagsLuggagePageObjects.SupposedAccessoriesBagsLuggagePageTitle()));

		a1.moveToElement(MainNavObjects.MainNavHomeDecorLink(driver)).build().perform();
		MainNavObjects.MainNavHomeDecorViewAll(driver).click();
		assertTrue(HomeDecorPageObjects.HomeDecorPageTitle(driver)
				.equals(HomeDecorPageObjects.SupposedHomeDecorPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavHomeDecorLink(driver)).build().perform();
		MainNavObjects.MainNavHomeDecorBooksMusic(driver).click();
		assertTrue(HomeDecorBooksMusicPageObjects.HomeDecorBooksMusicPageTitle(driver)
				.equals(HomeDecorBooksMusicPageObjects.SupposedHomeDecorBooksMusicPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavHomeDecorLink(driver)).build().perform();
		MainNavObjects.MainNavHomeDecorBedBath(driver).click();
		assertTrue(HomeDecorBedBathPageObjects.HomeDecorBedBathPageTitle(driver)
				.equals(HomeDecorBedBathPageObjects.SupposedHomeDecorBedBathPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavHomeDecorLink(driver)).build().perform();
		MainNavObjects.MainNavHomeDecorDecorativeAccents(driver).click();
		assertTrue(HomeDecorDecorativeAccentsPageObjects.HomeDecorDecorativeAccentsPageTitle(driver)
				.equals(HomeDecorDecorativeAccentsPageObjects.SupposedHomeDecorDecorativeAccentsPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavElectronicsLink(driver)).build().perform();
		MainNavObjects.MainNavElectronicsViewAll(driver).click();
		assertTrue(ElectronicsPageObjects.ElectronicsPageTitle(driver)
				.equals(ElectronicsPageObjects.SupposedElectronicsPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavElectronicsLink(driver)).build().perform();
		MainNavObjects.MainNavElectronicsAudio(driver).click();
		assertTrue(ElectronicsAudioPageObjects.ElectronicsAudioPageTitle(driver)
				.equals(ElectronicsAudioPageObjects.SupposedElectronicsAudioPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavElectronicsLink(driver)).build().perform();
		MainNavObjects.MainNavElectronicsPhotography(driver).click();
		assertTrue(ElectronicsPhotographyPageObjects.ElectronicsPhotographyPageTitle(driver)
				.equals(ElectronicsPhotographyPageObjects.SupposedElectronicsPhotographyPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavSportingGoodsLink(driver)).build().perform();
		MainNavObjects.MainNavSportingGoodsViewAll(driver).click();
		assertTrue(SportingGoodsPageObjects.SportingGoodsPageTitle(driver)
				.equals(SportingGoodsPageObjects.SupposedSportingGoodsPageTitle()));

		a1.moveToElement(MainNavObjects.MainNavSportingGoodsLink(driver)).build().perform();
		MainNavObjects.MainNavSportingGoodsBasketball(driver).click();
		assertTrue(SportingGoodsBasketballPageObjects.SportingGoodsBasketballPageTitle(driver)
				.equals(SportingGoodsBasketballPageObjects.SupposedSportingGoodsBasketballPageTitle()));
	}

	@Then("^I am taken to product subcategory page$")
	public void i_am_taken_to_product_subcategory_page() throws Throwable {
		// System.out.println("Then step is executed");
		// All verification steps were placed in previous when step
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
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

}

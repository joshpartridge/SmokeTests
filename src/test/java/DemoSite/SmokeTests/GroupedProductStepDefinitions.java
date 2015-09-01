package DemoSite.SmokeTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.GroupedProductPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.MiniCartObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
import DemoSitePageObjects.SportingGoodsBasketballPageObjects;
import Driver.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GroupedProductStepDefinitions {
	private WebDriver driver = Driver.driver;
	private String baseUrl = Driver.getBaseUrl();
	// private String baseUrl = getBaseUrl();

	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	private String productTitle;
	private String linktext;

	@Given("^that I am on a grouped product page$")
	public void that_I_am_on_a_grouped_product_page() throws Throwable {
		Actions a1 = new Actions(driver);
		a1.moveToElement(MainNavObjects.MainNavSportingGoodsLink(driver)).build().perform();
		MainNavObjects.MainNavSportingGoodsBasketball(driver).click();
		productTitle = SportingGoodsBasketballPageObjects.KobeXGroupProductLinkText(driver).toUpperCase();
		SportingGoodsBasketballPageObjects.KobeXGroupProduct(driver).click();
		// assertEquals(productTitle,driver.getTitle().toUpperCase());
	}

	@Then("^child product individual name, price, and availability should be displayed$")
	public void child_product_individual_name_price_and_availability_should_be_displayed() throws Throwable {
		assertTrue(GroupedProductPageObjects.FirstChildProductTitle(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.FirstChildProductPrice(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.SecondChildProductTitle(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.SecondChildProductPrice(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.ThirdChildProductTitle(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.ThirdChildProductPrice(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.FourthChildProductTitle(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.FourthChildProductPrice(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.FifthChildProductTitle(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.FifthChildProductPrice(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.SixthChildProductTitle(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.SixthChildProductPrice(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.SeventhChildProductTitle(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.SeventhChildProductPrice(driver).isDisplayed());
	}

	@Given("^all child product is in stock$")
	public void all_child_product_is_in_stock() throws Throwable {
		assertTrue(GroupedProductPageObjects.FirstChildProductQuantity(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.SecondChildProductQuantity(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.ThirdChildProductQuantity(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.FourthChildProductQuantity(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.FifthChildProductQuantity(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.SixthChildProductQuantity(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.SeventhChildProductQuantity(driver).isDisplayed());
	}

	@When("^I edit the quantity fields$")
	public void i_edit_the_quantity_fields() throws Throwable {
		GroupedProductPageObjects.FirstChildProductQuantity(driver).clear();
		GroupedProductPageObjects.FirstChildProductQuantity(driver).sendKeys("1");
		GroupedProductPageObjects.SecondChildProductQuantity(driver).clear();
		GroupedProductPageObjects.SecondChildProductQuantity(driver).sendKeys("3");
		GroupedProductPageObjects.ThirdChildProductQuantity(driver).clear();
		GroupedProductPageObjects.ThirdChildProductQuantity(driver).sendKeys("2");
		GroupedProductPageObjects.FourthChildProductQuantity(driver).clear();
		GroupedProductPageObjects.FourthChildProductQuantity(driver).sendKeys("1");
		GroupedProductPageObjects.FifthChildProductQuantity(driver).clear();
		GroupedProductPageObjects.FifthChildProductQuantity(driver).sendKeys("4");
		GroupedProductPageObjects.SixthChildProductQuantity(driver).clear();
		GroupedProductPageObjects.SixthChildProductQuantity(driver).sendKeys("1");
		GroupedProductPageObjects.SeventhChildProductQuantity(driver).clear();
		GroupedProductPageObjects.SeventhChildProductQuantity(driver).sendKeys("2");
	}

	@Then("^editable quantity fields should be displayed$")
	public void editable_quantity_fields_should_be_displayed() throws Throwable {
		assertTrue(GroupedProductPageObjects.FirstChildProductQuantity(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.SecondChildProductQuantity(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.ThirdChildProductQuantity(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.FourthChildProductQuantity(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.FifthChildProductQuantity(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.SixthChildProductQuantity(driver).isDisplayed());
		assertTrue(GroupedProductPageObjects.SeventhChildProductQuantity(driver).isDisplayed());
	}

	@Then("^grouped product name, price, and availability should be displayed$")
	public void product_name_price_and_availability_should_be_displayed() throws Throwable {
		assertEquals(productTitle, SimpleProductPageObjects.ProductTitle1(driver));
		assertEquals(productTitle, SimpleProductPageObjects.ProductTitle2(driver));
		assertTrue(SimpleProductPageObjects.Availibility(driver).isDisplayed());
	}

	@Then("^grouped product should be added to my cart$")
	public void product_should_be_added_to_my_cart() throws Throwable {
		assertEquals(GlobalPageObjects.CartCount(driver).getText(), "14");
	}
}

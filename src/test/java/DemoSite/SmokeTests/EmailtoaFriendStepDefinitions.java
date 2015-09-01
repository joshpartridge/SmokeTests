package DemoSite.SmokeTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import DemoSitePageObjects.CategoryStaticContentPageObjects;
import DemoSitePageObjects.EmailToAFriendPageObjects;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.GlobalProductPageObjects;
import DemoSitePageObjects.MainNavObjects;
import DemoSitePageObjects.SearchResultsPageObjects;
import DemoSitePageObjects.SimpleProductPageObjects;
import DemoSitePageObjects.SubcategoryPageObjects;
import Driver.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EmailtoaFriendStepDefinitions {

	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private static String text;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();

	@Given("^I am on a product detail page$")
	public void i_am_on_a_product_detail_page() throws Throwable {
		GlobalPageObjects.SearchBox(driver).clear();
		GlobalPageObjects.SearchBox(driver).sendKeys("book");
		GlobalPageObjects.MagnifyingGlass(driver).click();
		assertEquals("SEARCH RESULTS FOR 'BOOK'", SearchResultsPageObjects.SearchResultsTitle(driver).getText());

		text = SearchResultsPageObjects.SecondProductLink(driver).getText();
		SearchResultsPageObjects.SecondProductLink(driver).click();
		assertEquals(text, SimpleProductPageObjects.ProductTitle1(driver));
		assertEquals(text, SimpleProductPageObjects.ProductTitle2(driver));
	}

	@When("^I click on the Email to a Friend icon$")
	public void i_click_on_the_Email_to_a_Friend_icon() throws Throwable {
		GlobalProductPageObjects.EmailtoaFriendLink(driver).click();
	}

	@Then("^I should be directed to Email to a Friend page$")
	public void i_should_be_directed_to_Email_to_a_Friend_page() throws Throwable {
		assertEquals(EmailToAFriendPageObjects.EmailtoaFriendTitle(driver).getText(), "EMAIL TO A FRIEND");
	}

	@Given("^I am on Email to a Friend page$")
	public void i_am_on_Email_to_a_Friend_page() throws Throwable {
		MainNavObjects.MainNavHomeDecorLink(driver).click();
		text = CategoryStaticContentPageObjects.SubCategoryImageSpan4(driver).getText().toUpperCase();
		CategoryStaticContentPageObjects.SubCategoryImage4(driver).click();
		assertEquals(text, SubcategoryPageObjects.SubcategoryTitle1(driver).getText());
		assertEquals(text, SubcategoryPageObjects.SubcategoryTitle2(driver).getText());
		assertEquals(text + " - " + SubcategoryPageObjects.CategoryPageTitle(driver).toUpperCase(),
				driver.getTitle().toUpperCase());

		text = SearchResultsPageObjects.FirstProductLinkText(driver);
		SearchResultsPageObjects.FirstProductImage(driver).click();
		assertEquals(text.toUpperCase(), SimpleProductPageObjects.ProductTitle1(driver).toUpperCase());
		assertEquals(text.toUpperCase(), SimpleProductPageObjects.ProductTitle2(driver).toUpperCase());
		assertEquals(text.toUpperCase() + " - " + SimpleProductPageObjects.SubCategoryLink(driver).getText() + " - "
				+ SimpleProductPageObjects.CategoryLink(driver).getText(), driver.getTitle().toUpperCase());

		GlobalProductPageObjects.EmailtoaFriendLink(driver).click();
		assertEquals(EmailToAFriendPageObjects.EmailtoaFriendTitle(driver).getText(), "EMAIL TO A FRIEND");
	}

	@When("^I fill out required fields$")
	public void i_fill_out_required_fields() throws Throwable {
		EmailToAFriendPageObjects.SenderNameField(driver).clear();
		EmailToAFriendPageObjects.SenderNameField(driver).sendKeys("Testy McTesterpants");
		EmailToAFriendPageObjects.SenderEmailField(driver).clear();
		EmailToAFriendPageObjects.SenderEmailField(driver).sendKeys("test@test.com");
		EmailToAFriendPageObjects.SenderMessageField(driver).clear();
		EmailToAFriendPageObjects.SenderMessageField(driver)
				.sendKeys("I'm a bot *bleep boop beep* I have no purpose in life other than to test");
		EmailToAFriendPageObjects.RecipientNameField(driver).clear();
		EmailToAFriendPageObjects.RecipientNameField(driver).sendKeys("Testy McTestershorts");
		EmailToAFriendPageObjects.RecipientEmailField(driver).clear();
		EmailToAFriendPageObjects.RecipientEmailField(driver).sendKeys("test2@test2.com");
	}

	@When("^I click Send Email button$")
	public void i_click_Send_Email_button() throws Throwable {
		EmailToAFriendPageObjects.SendEmailButton(driver).click();
	}

	@Then("^Email should be sent successfully$")
	public void email_should_be_sent_successfully() throws Throwable {
		assertTrue(EmailToAFriendPageObjects.EmailSendSuccess(driver).isDisplayed());
		assertEquals(EmailToAFriendPageObjects.EmailSentSuccessMessage(driver).getText(),
				"The link to a friend was sent.");
	}

	@Then("^I should be back on previous product detail page$")
	public void i_should_be_back_on_previous_product_detail_page() throws Throwable {
		assertEquals(text.toUpperCase(), SimpleProductPageObjects.ProductTitle1(driver).toUpperCase());
		assertEquals(text.toUpperCase(), SimpleProductPageObjects.ProductTitle2(driver).toUpperCase());
		assertEquals(text.toUpperCase() + " - " + SimpleProductPageObjects.SubCategoryLink(driver).getText() + " - "
				+ SimpleProductPageObjects.CategoryLink(driver).getText(), driver.getTitle().toUpperCase());
	}

	@When("^I click the Add Recipient button$")
	public void i_click_the_Add_Recipient_button() throws Throwable {
		EmailToAFriendPageObjects.AddRecipientButton(driver).click();
		assertTrue(EmailToAFriendPageObjects.RecipientEmailField2(driver).isDisplayed());
		assertTrue(EmailToAFriendPageObjects.RecipientNameField2(driver).isDisplayed());

		EmailToAFriendPageObjects.AddRecipientButton(driver).click();
		assertTrue(EmailToAFriendPageObjects.RecipientEmailField3(driver).isDisplayed());
		assertTrue(EmailToAFriendPageObjects.RecipientNameField3(driver).isDisplayed());

		EmailToAFriendPageObjects.AddRecipientButton(driver).click();
		assertTrue(EmailToAFriendPageObjects.RecipientEmailField4(driver).isDisplayed());
		assertTrue(EmailToAFriendPageObjects.RecipientNameField4(driver).isDisplayed());

		EmailToAFriendPageObjects.AddRecipientButton(driver).click();
		assertTrue(EmailToAFriendPageObjects.RecipientEmailField5(driver).isDisplayed());
		assertTrue(EmailToAFriendPageObjects.RecipientNameField5(driver).isDisplayed());

		assertTrue(EmailToAFriendPageObjects.EmailAddressLimitMessage(driver).isDisplayed());
		assertEquals(EmailToAFriendPageObjects.EmailAddressLimitMessage(driver).getText(),
				"Maximum 5 email addresses allowed.");
	}

	@Then("^Another recipient field is added$")
	public void another_recipient_field_is_added() throws Throwable {
		// All assertions occur in previous step
	}

	@When("^I click on the remove recipient link$")
	public void i_click_on_the_remove_recipient_link() throws Throwable {
		EmailToAFriendPageObjects.RemoveRecipient4Link(driver).click();
		EmailToAFriendPageObjects.RemoveRecipient3Link(driver).click();
		EmailToAFriendPageObjects.RemoveRecipient1Link(driver).click();
		EmailToAFriendPageObjects.RemoveRecipient1Link(driver).click();
	}

	@Then("^recipient is removed$")
	public void recipient_is_removed() throws Throwable {
		assertFalse(isElementPresent(By.id("recipients_name0")));
	}

	@When("^I click the back link$")
	public void i_click_the_back_link() throws Throwable {
		EmailToAFriendPageObjects.BackLink(driver).click();
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

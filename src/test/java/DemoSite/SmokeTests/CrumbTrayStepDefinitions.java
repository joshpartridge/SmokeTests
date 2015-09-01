package DemoSite.SmokeTests;

import org.openqa.selenium.WebDriver;

import DemoSitePageObjects.ContactUsPageObjects;
import DemoSitePageObjects.CrumbTrayPageObjects;
import DemoSitePageObjects.GlobalPageObjects;
import DemoSitePageObjects.SiteMapCategoryPageObjects;
import Driver.Driver;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static org.junit.Assert.*;

public class CrumbTrayStepDefinitions {
	
	private WebDriver driver = Driver.driver;
	private static String baseUrl = Driver.getBaseUrl();
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private int WaitTime;
	public static String text;
	public String winHandleBefore;
	
	@When("^I click a link in the crumb tray$")
	public void i_click_a_link_in_the_crumb_tray() throws Throwable {
		//This might have been easier with a table in the feature file but I decided against it mainly because I'm lazy
	    
		CrumbTrayPageObjects.AboutUsLink(driver).click();
		assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/about-magento-demo-store/");
	    assertEquals(driver.getTitle(), "About Us");
	    assertEquals(GlobalPageObjects.LastCategoryTitle(driver).getText().toUpperCase(), "ABOUT US");
	    
	    CrumbTrayPageObjects.ContactUsLink(driver).click();
	    assertEquals("Contact Us", driver.getTitle());
	    assertEquals("http://demo114.thegrandriver.net/contacts/", driver.getCurrentUrl());
	    assertEquals("CONTACT US", ContactUsPageObjects.ContactUsHeader(driver).getText().toUpperCase());
	    
	    CrumbTrayPageObjects.CustomerServiceLink(driver).click();
	    assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer-service/");
	    assertEquals(driver.getTitle(), "Customer Service");
	    assertEquals(GlobalPageObjects.Header(driver).getText().toUpperCase(), "CUSTOMER SERVICE");
	    
	    CrumbTrayPageObjects.PrivacyPolicyLink(driver).click();
	    assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/privacy-policy-cookie-restriction-mode/");
	    assertEquals(driver.getTitle(), "Privacy Policy");
	    assertEquals(GlobalPageObjects.LastCategoryTitle(driver).getText().toUpperCase(), "PRIVACY POLICY");
	    assertEquals(GlobalPageObjects.Header(driver).getText().toUpperCase(), "PRIVACY POLICY");
	    
	    CrumbTrayPageObjects.SiteMapLink(driver).click();
	    assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/catalog/seo_sitemap/category/");
	    assertEquals(driver.getTitle(), "Site Map");
	    assertEquals(SiteMapCategoryPageObjects.SiteMapHeader(driver).getText().toUpperCase(), "CATEGORIES");
	    
	    CrumbTrayPageObjects.SearchTermsLink(driver).click();
	    assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/catalogsearch/term/popular/");
	    assertEquals(driver.getTitle(), "Search Terms");
	    assertEquals(SiteMapCategoryPageObjects.SiteMapHeader(driver).getText().toUpperCase(), "POPULAR SEARCH TERMS");
		
	    CrumbTrayPageObjects.AdvancedSearchLink(driver).click();
	    assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/catalogsearch/advanced/");
	    assertEquals(driver.getTitle(), "Advanced Search");
	    assertEquals(SiteMapCategoryPageObjects.SiteMapHeader(driver).getText().toUpperCase(), "CATALOG ADVANCED SEARCH");
	    
	    CrumbTrayPageObjects.MyAccountLink(driver).click();
	    assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/customer/account/login/");
	    assertEquals(driver.getTitle(), "Customer Login");
	    assertEquals(SiteMapCategoryPageObjects.SiteMapHeader(driver).getText().toUpperCase(), "LOGIN OR CREATE AN ACCOUNT");
	    
	    CrumbTrayPageObjects.OrdersAndReturnsLink(driver).click();
	    assertEquals(driver.getCurrentUrl(), "http://demo114.thegrandriver.net/sales/guest/form/");
	    assertEquals(driver.getTitle(), "Magento Enterprise Edition");
	    assertEquals(SiteMapCategoryPageObjects.SiteMapHeader(driver).getText().toUpperCase(), "ORDERS AND RETURNS");
	}

}

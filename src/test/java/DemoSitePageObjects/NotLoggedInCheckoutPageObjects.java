package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NotLoggedInCheckoutPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement CheckoutasGuestOption(WebDriver driver) {

		element = driver.findElement(By.id("login:guest"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement RegisterandCheckoutOption(WebDriver driver) {

		element = driver.findElement(By.id("login:register"));

		return element;
	}
	
	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement ContinueButton(WebDriver driver) {

		element = driver.findElement(By.id("onepage-guest-register-button"));

		return element;
	}
	
	/**
	 * #4
	 * driver
	 *
	 */
	public static WebElement EmailAddressField(WebDriver driver) {

		element = driver.findElement(By.id("login-email"));

		return element;
	}
	
	/**
	 * #5
	 * driver
	 *
	 */
	public static WebElement PasswordField(WebDriver driver) {

		element = driver.findElement(By.id("login-password"));

		return element;
	}
	
	/**
	 * #6
	 * driver
	 *
	 */
	public static WebElement ForgotyourpasswordLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]"));

		return element;
	}
	
	/**
	 * #7
	 * driver
	 *
	 */
	public static WebElement LoginButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//div[@id='checkout-step-login']/div/div[2]/div/button"));

		return element;
	}
	
	/**
	 * #8
	 * driver
	 *
	 */
	public static String CheckoutOnepageTitle(WebDriver driver) {

		title = driver.getTitle();

		return title;
	}
	
	//What title should be
	/**
	 * #9
	 * driver
	 */
	public static String SupposedCheckoutOnepageTitle() {
		
		title = "Checkout";
		
		return title;
	}
	
	/**
	 * #10
	 * driver
	 *
	 */
	public static WebElement PrefixFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:prefix"));

		return element;
	}
	
	/**
	 * #11
	 * driver
	 *
	 */
	public static WebElement FirstNameFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:firstname"));

		return element;
	}
	
	/**
	 * #12
	 * driver
	 *
	 */
	public static WebElement MiddleNameFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:middlename"));

		return element;
	}
	
	/**
	 * #13
	 * driver
	 *
	 */
	public static WebElement LastNameFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:lastname"));

		return element;
	}
	
	/**
	 * #14
	 * driver
	 *
	 */
	public static WebElement SuffixFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:suffix"));

		return element;
	}
	
	/**
	 * #15
	 * driver
	 *
	 */
	public static WebElement CompanyFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:company"));

		return element;
	}
	
	/**
	 * #16
	 * driver
	 *
	 */
	public static WebElement EmailAddressFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:email"));

		return element;
	}
	
	/**
	 * #17
	 * driver
	 *
	 */
	public static WebElement AddressFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:street1"));

		return element;
	}
	
	/**
	 * #18
	 * driver
	 *
	 */
	public static WebElement Address2FieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:street2"));

		return element;
	}
	
	/**
	 * #19
	 * driver
	 *
	 */
	public static WebElement CityFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:city"));

		return element;
	}
	
	/**
	 * #20
	 * driver
	 *
	 */
	public static WebElement CountryDropdownBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:country_id"));

		return element;
	}
	
	/**
	 * #21
	 * driver
	 *
	 */
	public static WebElement TelephoneFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:telephone"));

		return element;
	}
	
	/**
	 * #22
	 * driver
	 *
	 */
	public static WebElement FaxFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:fax"));

		return element;
	}
	
	/**
	 * #23
	 * driver
	 *
	 */
	public static WebElement GenderDropdownBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:gender"));

		return element;
	}
	
	/**
	 * #24
	 * driver
	 *
	 */
	public static WebElement TaxFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:taxvat"));

		return element;
	}
	
	/**
	 * #25
	 * driver
	 *
	 */
	public static WebElement CaptchaFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("captcha_guest_checkout"));

		return element;
	}
	
	/**
	 * #26
	 * driver
	 *
	 */
	public static WebElement ShiptothisaddressOptionsBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:use_for_shipping_yes"));

		return element;
	}
	
	/**
	 * #27
	 * driver
	 *
	 */
	public static WebElement ShiptodifferentaddressOptionBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:use_for_shipping_no"));

		return element;
	}
	
	/**
	 * #28
	 * driver
	 *
	 */
	public static WebElement ContinueButtonBilling(WebDriver driver) {

		element = driver.findElement(By.cssSelector("#billing-buttons-container > button.button"));

		return element;
	
	}
	
	/**
	 * #29
	 * driver
	 *
	 */
	public static WebElement StateFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:region"));

		return element;
	
	}
	
	/**
	 * #30
	 * driver
	 *
	 */
	public static WebElement ZipFieldBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:postcode"));

		return element;
	
	}
	
	/**
	 * #31
	 * driver
	 *
	 */
	public static WebElement PrefixFieldShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:prefix"));

		return element;
	
	}
	
	/**
	 * #32
	 * driver
	 *
	 */
	public static WebElement FirstNameFieldShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:firstname"));

		return element;
	
	}
	
	/**
	 * #33
	 * driver
	 *
	 */
	public static WebElement MiddleNameFieldShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:middlename"));

		return element;
	
	}
	
	/**
	 * #34
	 * driver
	 *
	 */
	public static WebElement LastNameFieldShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:lastname"));

		return element;
	
	}
	
	/**
	 * #35
	 * driver
	 *
	 */
	public static WebElement SuffixFieldShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:suffix"));

		return element;
	
	}
	
	/**
	 * #36
	 * driver
	 *
	 */
	public static WebElement CompanyFieldShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:company"));

		return element;
	
	}
	
	/**
	 * #37
	 * driver
	 *
	 */
	public static WebElement AddressFieldShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:street1"));

		return element;
	
	}
	
	/**
	 * #38
	 * driver
	 *
	 */
	public static WebElement Address2FieldShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:street2"));

		return element;
	
	}
	
	/**
	 * #39
	 * driver
	 *
	 */
	public static WebElement CityFieldShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:city"));

		return element;
	
	}
	
	/**
	 * #40
	 * driver
	 *
	 */
	public static WebElement StateFieldShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:region"));

		return element;
	
	}
	
	/**
	 * #41
	 * driver
	 *
	 */
	public static WebElement ZipFieldShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:postecode"));

		return element;
	
	}
	
	/**
	 * #42
	 * driver
	 *
	 */
	public static WebElement CountryDropdownShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:country_id"));

		return element;
	
	}
	
	/**
	 * #43
	 * driver
	 *
	 */
	public static WebElement TelephoneFieldShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:telephone"));

		return element;
	
	}
	
	/**
	 * #44
	 * driver
	 *
	 */
	public static WebElement FaxFieldShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:prefix"));

		return element;
	
	}
	
	/**
	 * #45
	 * driver
	 *
	 */
	public static WebElement UseBillingAddressCheckboxShipping(WebDriver driver) {

		element = driver.findElement(By.id("shipping:same_as_billing"));

		return element;
	
	}
	
	/**
	 * #46
	 * driver
	 *
	 */
	public static WebElement ContinueButtonShipping(WebDriver driver) {

		element = driver.findElement(By.cssSelector("#shipping-buttons-container > button.button"));

		return element;
	
	}
	
	/**
	 * #47
	 * driver
	 *
	 */
	public static WebElement BackLinkBillingShipping(WebDriver driver) {

		element = driver.findElement(By.cssSelector("p.back-link > a"));

		return element;
	
	}
	
	/**
	 * #48
	 * driver
	 *
	 */
	public static WebElement AllowGiftOptionsCheckbox(WebDriver driver) {

		element = driver.findElement(By.id("allow_gift_options"));

		return element;
	
	}

	/**
	 * #49
	 * driver
	 *
	 */
	public static WebElement ContinueButtonShippingMethod(WebDriver driver) {

		element = driver.findElement(By.cssSelector("#shipping-method-buttons-container > button.button"));

		return element;
	
	}
	
	/**
	 * #50
	 * driver
	 *
	 */
	public static WebElement BackLinkShippingMethod(WebDriver driver) {

		element = driver.findElement(By.cssSelector("#shipping-method-buttons-container > p.back-link > a"));

		return element;
	
	}
	
	/**
	 * #51
	 * driver
	 *
	 */
	public static WebElement CreditCardTypeDropdownPayment(WebDriver driver) {

		element = driver.findElement(By.id("authorizenet_cc_type"));

		return element;
	
	}
	
	/**
	 * #52
	 * driver
	 *
	 */
	public static WebElement CreditCardNumberFieldPayment(WebDriver driver) {

		element = driver.findElement(By.id("authorizenet_cc_number"));

		return element;
	
	}
	
	/**
	 * #53
	 * driver
	 *
	 */
	public static WebElement ExpirationDateMonthDropdownPayment(WebDriver driver) {

		element = driver.findElement(By.id("authorizenet_expiration"));

		return element;
	
	}
	
	/**
	 * #54
	 * driver
	 *
	 */
	public static WebElement ExpirationDateYearDropdownPayment(WebDriver driver) {

		element = driver.findElement(By.id("authorizenet_expiration_yr"));

		return element;
	
	}
	
	/**
	 * #55
	 * driver
	 *
	 */
	public static WebElement ContinueButtonPayment(WebDriver driver) {

		element = driver.findElement(By.cssSelector("#payment-buttons-container > button.button"));

		return element;
	
	}
	
	/**
	 * #56
	 * driver
	 *
	 */
	public static WebElement PlaceOrderButtonReview(WebDriver driver) {

		element = driver.findElement(By.cssSelector("button.button.btn-checkout"));

		return element;
	
	}
	
	/**
	 * #57
	 * driver
	 *
	 */
	public static WebElement CreditCardOption(WebDriver driver) {

		element = driver.findElement(By.id("p_method_authorizenet"));

		return element;
	
	}
	
	/**
	 * #58
	 * driver
	 *
	 */
	public static WebElement StateDropdownBilling(WebDriver driver) {

		element = driver.findElement(By.id("billing:region_id"));

		return element;
	
	}
	
	/**
	 * #59
	 * driver
	 *
	 */
	public static WebElement CheckoutTitle(WebDriver driver) {

		element = driver.findElement(By.cssSelector("h1"));

		return element;
	
	}
	


	
	
}

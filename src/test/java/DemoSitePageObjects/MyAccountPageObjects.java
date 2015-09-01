package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyAccountPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement MyAccountHeader(WebDriver driver) {

		element = driver.findElement(By.cssSelector("h1"));

		return element;
	}

	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement AccountInformationLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Account Information')]"));

		return element;
	}

	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement AddressBookLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Address Book')]"));

		return element;
	}

	/**
	 * #4
	 * driver
	 *
	 */
	public static WebElement MyOrdersLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'My Orders')]"));

		return element;
	}

	/**
	 * #5
	 * driver
	 *
	 */
	public static WebElement BillingAgreementsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Billing Agreements')]"));

		return element;
	}

	/**
	 * #6
	 * driver
	 *
	 */
	public static WebElement RecurringProfilesLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Recurring Profiles')]"));

		return element;
	}

	/**
	 * #7
	 * driver
	 *
	 */
	public static WebElement MyProductReviewsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'My Product Reviews')]"));

		return element;
	}

	/**
	 * #8
	 * driver
	 *
	 */
	public static WebElement MywishlistsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'My Wishlists')])[2]"));

		return element;
	}

	/**
	 * #9
	 * driver
	 *
	 */
	public static WebElement MyApplicationsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'My Applications')]"));

		return element;
	}

	/**
	 * #10
	 * driver
	 *
	 */
	public static WebElement NewsletterSubscriptionsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Newsletter Subscriptions')]"));

		return element;
	}

	/**
	 * #11
	 * driver
	 *
	 */
	public static WebElement MyDownloadableProductsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'My Downloadable Products')]"));

		return element;
	}

	/**
	 * #12
	 * driver
	 *
	 */
	public static WebElement StoreCreditLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Store Credit')]"));

		return element;
	}

	/**
	 * #13
	 * driver
	 *
	 */
	public static WebElement GiftCardLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Gift Card')])[2]"));

		return element;
	}

	/**
	 * #14
	 * driver
	 *
	 */
	public static WebElement GiftRegistryLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Gift Registry')]"));

		return element;
	}

	/**
	 * #15
	 * driver
	 *
	 */
	public static WebElement RewardPointsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Reward Points')]"));

		return element;
	}

	/**
	 * #16
	 * driver
	 *
	 */
	public static WebElement MyReturnsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'My Returns')]"));

		return element;
	}

	/**
	 * #17
	 * driver
	 *
	 */
	public static WebElement MyInvitationsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'My Invitations')]"));

		return element;
	}

	/**
	 * #18
	 * driver
	 *
	 */
	public static WebElement OrderBySKULink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Order by SKU')]"));

		return element;
	}

	/**
	 * #19
	 * driver
	 *
	 */
	public static WebElement EditContactInformationLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[4]"));

		return element;
	}

	/**
	 * #20
	 * driver
	 *
	 */
	public static WebElement EditNewslettersLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Edit')])[5]"));

		return element;
	}

	/**
	 * #21
	 * driver
	 *
	 */
	public static WebElement EditBillingAddressLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Edit Address')]"));

		return element;
	}

	/**
	 * #22
	 * driver
	 *
	 */
	public static WebElement EditShippingAddressLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'Edit Address')])[2]"));

		return element;
	}

	/**
	 * #23
	 * driver
	 *
	 */
	public static WebElement HelloMessage(WebDriver driver) {

		element = driver.findElement(By.cssSelector("p.hello > strong"));

		return element;
	}

	/**
	 * #24
	 * driver
	 *
	 */
	public static WebElement SuccessMessage(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li.success-msg > ul > li"));

		return element;
	}

	/**
	 * #25
	 * driver
	 *
	 */
	public static WebElement SuccessMessageText(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li > span"));

		return element;
	}

	/**
	 * #26
	 * driver
	 *
	 */
	public static WebElement AccountDashboardLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Account Dashboard')]"));

		return element;
	}

	/**
	 * #27
	 * driver
	 *
	 */
	public static WebElement CompareButton(WebDriver driver) {

		element = driver.findElement(By.cssSelector("div.actions > button.button"));

		return element;
	}

	/**
	 * #28
	 * driver
	 *
	 */
	public static WebElement ClearAllCompareLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Clear All')]"));

		return element;
	}

	/**
	 * #29
	 * driver
	 *
	 */
	public static WebElement EmptyCompareMessage(WebDriver driver) {

		element = driver.findElement(By.cssSelector("p.empty"));

		return element;
	}
	
	
	
	

}

package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class GiftCardPageObjects {

	private static WebElement element = null;
	private static String title = null;
	

	/**
	 * #1
	 * driver
	 */
	public static String GiftCardPageTitle(WebDriver driver) {
		
		title = driver.getTitle();
		
		return title;
		
	}
	
	//What title should be
	/**
	 * #2
	 * driver
	 */
	public static String SupposedGiftCardPageTitle() {
		
		title = "Gift Card";
		
		return title;
	}
	
	
	/**
	 * #3
	 * driver
	 */
	public static WebElement FirstCardImageGrid(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li/a/img"));
		
		return element;
	}
	
	/**
	 * #4
	 * driver
	 */
	public static WebElement SecondCardImageGrid(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li[2]/a/img"));
		
		return element;
	}
	
	/**
	 * #5
	 * driver
	 */
	public static WebElement ThirdCardImageGrid(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li[3]/a/img"));
		
		return element;
	}
	
	/**
	 * #6
	 * driver
	 */
	public static WebElement FourthCardImageGrid(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li[4]/a/img"));
		
		return element;
	}
	
	/**
	 * #7
	 * driver
	 */
	public static WebElement FirstCardViewDetailsButtonGrid(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//a[contains(text(),'View Details')]"));
		
		return element;
	}
	
	/**
	 * #8
	 * driver
	 */
	public static WebElement SecondCardViewDetailsButtonGrid(WebDriver driver) {
		
		element = driver.findElement(By.xpath("xpath=(//a[contains(text(),'View Details')])[2]"));
		
		return element;
	}
	
	/**
	 * #9
	 * driver
	 */
	public static WebElement ThirdCardViewDetailsButtonGrid(WebDriver driver) {
		
		element = driver.findElement(By.xpath("xpath=(//a[contains(text(),'View Details')])[3]"));
		
		return element;
	}
	
	/**
	 * #10
	 * driver
	 */
	public static WebElement FourthCardViewDetailsButtonGrid(WebDriver driver) {
		
		element = driver.findElement(By.xpath("xpath=(//a[contains(text(),'View Details')])[4]"));
		
		return element;
	}
	
	/**
	 * #11
	 * driver
	 */
	public static String GiftCardProductListClass(WebDriver driver) {
		
		title = driver.findElement(By.xpath("//html[@id='top']/body/div[3]/div[2]/div[3]/div/div[2]/div[4]/ul")).getAttribute("class");
		
		
		return title;
	}
	
	/**
	 * #12
	 * driver
	 */
	public static WebElement FirstCardLinkGrid(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//h2/a"));
		
		return element;
	}
	
	/**
	 * #13
	 * driver
	 */
	public static WebElement SecondCardLinkGrid(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li[2]/div/h2/a"));
		
		return element;
	}
	
	/**
	 * #14
	 * driver
	 */
	public static WebElement ThirdCardLinkGrid(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li[3]/div/h2/a"));
		
		return element;
	}
	
	/**
	 * #15
	 * driver
	 */
	public static WebElement FourthCardLinkGrid(WebDriver driver) {
		
		element = driver.findElement(By.xpath("//li[4]/div/h2/a"));
		
		return element;
	}
	
	/**
	 * #16
	 * driver
	 */
	public static WebElement GridProductList(WebDriver driver) {
		
		element = driver.findElement(By.className("products-grid"));
		
		return element;
	}
	
	/**
	 * #17
	 * driver
	 */
	public static WebElement ListProductList(WebDriver driver) {
		
		element = driver.findElement(By.id("products-list"));
		
		return element;
	}
	
	/**
	 * #18
	 * driver
	 */
	public static WebElement SortByDropdown(WebDriver driver) {
		
		element = driver.findElement(By.cssSelector("select[title=\"Sort By\"]"));
		
		return element;
	}
	
	/**
	 * #19
	 * driver
	 */
	public static WebElement GridActiveLink(WebDriver driver) {
		
		element = driver.findElement(By.cssSelector("strong.grid"));
		
		return element;
	}
	
	/**
	 * #20
	 * driver
	 */
	public static WebElement ListInactiveLink(WebDriver driver) {
		
		element = driver.findElement(By.cssSelector("a.list"));
		
		return element;
	}
	
	/**
	 * #21
	 * driver
	 */
	public static WebElement GridInactiveLink(WebDriver driver) {
		
		element = driver.findElement(By.cssSelector("a.grid"));
		
		return element;
	}
	
	/**
	 * #22
	 * driver
	 */
	public static WebElement ListActiveLink(WebDriver driver) {
		
		element = driver.findElement(By.cssSelector("strong.list"));
		
		return element;
	}

	/**
	 * #23
	 * driver
	 */
	public static WebElement AmountDropdown(WebDriver driver) {
		
		element = driver.findElement(By.id("giftcard_amount"));
		
		return element;
	}
	
	/**
	 * #24
	 * driver
	 */
	public static WebElement SenderField(WebDriver driver) {
		
		element = driver.findElement(By.id("giftcard_sender_name"));
		
		return element;
	}
	
	/**
	 * #25
	 * driver
	 */
	public static WebElement RecipientField(WebDriver driver) {
		
		element = driver.findElement(By.id("giftcard_recipient_name"));
		
		return element;
	}
	
	/**
	 * #26
	 * driver
	 */
	public static WebElement MessageField(WebDriver driver) {
		
		element = driver.findElement(By.id("giftcard_message"));
		
		return element;
	}
	
	
	
	
}


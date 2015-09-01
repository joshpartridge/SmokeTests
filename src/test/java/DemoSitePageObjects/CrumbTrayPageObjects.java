package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CrumbTrayPageObjects {
	
private static WebElement element = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement NewsletterEmailField(WebDriver driver) {

		element = driver.findElement(By.id("newsletter"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement NewsletterSubscribeButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//form[@id='newsletter-validate-detail']/div/div[3]/button"));

		return element;
	}
	
	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement AboutUsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'About Us')]"));

		return element;
	}
	
	/**
	 * #4
	 * driver
	 *
	 */
	public static WebElement ContactUsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Contact Us')]"));

		return element;
	}
	
	/**
	 * #5
	 * driver
	 *
	 */
	public static WebElement CustomerServiceLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Customer Service')]"));

		return element;
	}
	
	/**
	 * #6
	 * driver
	 *
	 */
	public static WebElement PrivacyPolicyLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Privacy Policy')]"));

		return element;
	}
	
	/**
	 * #7
	 * driver
	 *
	 */
	public static WebElement SiteMapLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Site Map')]"));

		return element;
	}
	
	/**
	 * #8
	 * driver
	 *
	 */
	public static WebElement SearchTermsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Search Terms')]"));

		return element;
	}
	
	/**
	 * #9
	 * driver
	 *
	 */
	public static WebElement AdvancedSearchLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Advanced Search')]"));

		return element;
	}
	
	/**
	 * #10
	 * driver
	 *
	 */
	public static WebElement MyAccountLink(WebDriver driver) {

		element = driver.findElement(By.xpath("(//a[contains(text(),'My Account')])[2]"));

		return element;
	}
	
	/**
	 * #11
	 * driver
	 *
	 */
	public static WebElement OrdersAndReturnsLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Orders and Returns')]"));

		return element;
	}
	
	/**
	 * #12
	 * driver
	 *
	 */
	public static WebElement FacebookLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Facebook')]"));

		return element;
	}
	
	/**
	 * #13
	 * driver
	 *
	 */
	public static WebElement TwitterLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Twitter')]"));

		return element;
	}
	
	/**
	 * #14
	 * driver
	 *
	 */
	public static WebElement YoutubeLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Youtube')]"));

		return element;
	}
	
	/**
	 * #15
	 * driver
	 *
	 */
	public static WebElement RSSLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'RSS')]"));

		return element;
	}
	
	/**
	 * #16
	 * driver
	 *
	 */
	public static WebElement PinterestLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//a[contains(text(),'Pinterest')]"));

		return element;
	}
	
	
	

}

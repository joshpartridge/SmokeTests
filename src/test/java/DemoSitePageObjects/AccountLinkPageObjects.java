package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountLinkPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement MyAccountLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("a[title=\"My Account\"]"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement MyWishlistsLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("a[title=\"My Wishlists\"]"));

		return element;
	}
	
	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement MyCartLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("a.top-link-cart"));

		return element;
	}
	
	/**
	 * #4
	 * driver
	 *
	 */
	public static WebElement CheckoutLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("a.top-link-checkout"));

		return element;
	}
	
	/**
	 * #5
	 * driver
	 *
	 */
	public static WebElement RegisterLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("a[title=\"Register\"]"));

		return element;
	}
	
	/**
	 * #6
	 * driver
	 *
	 */
	public static WebElement LogInLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("a[title=\"Log In\"]"));

		return element;
	}

}

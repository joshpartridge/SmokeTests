package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	public static String text;
	
	/**
	 * #1
	 * driver
	 */
	
	public static WebElement WishlistHeader(WebDriver driver) {
		element = driver.findElement(By.cssSelector("h1"));
		return element;
	}
	
	/**
	 * #2
	 * driver
	 */
	
	public static WebElement WishlistName(WebDriver driver) {
		element = driver.findElement(By.cssSelector("h2"));
		return element;
	}
	
	/**
	 * #3
	 * driver
	 */
	
	public static WebElement SelectedWishlist(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='wishlists-select']/strong/span"));
		return element;
	}
	
	/**
	 * #4
	 * driver
	 */
	
	public static WebElement ChangeWishlist(WebDriver driver) {
		element = driver.findElement(By.cssSelector("a.change > span"));
		return element;
	}

	/**
	 * #5
	 * driver
	 */
	
	public static WebElement CreateNewWishlistButton(WebDriver driver) {
		element = driver.findElement(By.id("wishlist-create-button"));
		return element;
	}

	/**
	 * #6
	 * driver
	 */
	
	public static WebElement ProductLink(WebDriver driver) {
		element = driver.findElement(By.cssSelector("h3.product-name > a[title=\"" + text +"\"]"));
		return element;
	}

	/**
	 * #7
	 * driver
	 */
	
	public static WebElement SuccessMessage(WebDriver driver) {
		element = driver.findElement(By.cssSelector("li.success-msg > ul > li > span"));
		return element;
	}
	
	
	
	
	

}

package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.lang.Object;
import java.lang.Number;
import java.math.BigDecimal;
import java.text.DecimalFormatSymbols;
import java.text.Format;
import java.text.NumberFormat;
import java.text.DecimalFormat;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GlobalProductPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	private static String price = null;
	private static int numberInt;
	private static BigDecimal numberDecimal;
	private static DecimalFormat format = new DecimalFormat();
	private static DecimalFormatSymbols symbols = new DecimalFormatSymbols();
	
	
	/**
	 * #1
	 * driver
	 */
	
	public static WebElement DescriptionTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[2]/ul/li/span"));
		return element;
	}
	
	/**
	 * #2
	 * driver
	 */
	
	public static WebElement AdditionalInformationTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[2]/ul/li[2]/span"));
		return element;
	}
	
	/**
	 * #3
	 * driver
	 */
	
	public static WebElement ReviewsTab(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[2]/ul/li[3]/span"));
		return element;
	}
	
	/**
	 * #4
	 * driver
	 */
	
	public static WebElement ReviewsDiv(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.ratings"));
		return element;
	}
	
	/**
	 * #5
	 * driver
	 */
	
	public static WebElement Stars(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.rating"));
		return element;
	}
	
	/**
	 * #6
	 * driver
	 */
	
	public static WebElement ReviewsLink(WebDriver driver) {
		element = driver.findElement(By.cssSelector("p.rating-links > a"));
		return element;
	}
	
	/**
	 * #7
	 * driver
	 */
	
	public static WebElement AddYourReviewLink(WebDriver driver) {
		element = driver.findElement(By.linkText("Add Your Review"));
		return element;
	}
	
	/**
	 * #8
	 * driver
	 */
	
	public static WebElement FirsttoReviewLink(WebDriver driver) {
		element = driver.findElement(By.cssSelector("p.no-rating > a"));
		return element;
	}
	
	/**
	 * #9
	 * driver
	 */
	
	public static WebElement GlobalSiteNotice(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.global-site-notice.demo-notice"));
		return element;
	}
	
	/**
	 * #10
	 * driver
	 */
	
	public static WebElement AddtoWishlistLink(WebDriver driver) {
		element = driver.findElement(By.linkText("Add to Wishlist"));
		return element;
	}
	
	/**
	 * #11
	 * driver
	 */
	
	public static WebElement AddtoCompareLink(WebDriver driver) {
		element = driver.findElement(By.linkText("Add to Compare"));
		return element;
	}
	
	/**
	 * #12
	 * driver
	 */
	
	public static WebElement EmailtoaFriendLink(WebDriver driver) {
		element = driver.findElement(By.linkText("Email to a Friend"));
		return element;
	}
	
	/**
	 * #13
	 * driver
	 */
	
	public static WebElement FacebookLink(WebDriver driver) {
		element = driver.findElement(By.linkText("Share on Facebook"));
		return element;
	}
	
	/**
	 * #14
	 * driver
	 */
	
	public static WebElement TwitterLink(WebDriver driver) {
		element = driver.findElement(By.linkText("Share on Twitter"));
		return element;
	}
	
	/**
	 * #15
	 * driver
	 */
	
	public static WebElement FirstWishlistLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//form[@id='product_addtocart_form']/div[4]/div[3]/ul/li/div/div/ul/li/span"));
		return element;
	}
	
	/**
	 * #16
	 * driver
	 */
	
	public static WebElement SecondWishlisLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//form[@id='product_addtocart_form']/div[4]/div[3]/ul/li/div/div/ul/li[2]/span"));
		return element;
	}
	
	/**
	 * #17
	 * driver
	 */
	
	public static WebElement CreateaNewWishlistLink(WebDriver driver) {
		element = driver.findElement(By.cssSelector("span[title=\"Create New Wishlist\"]"));
		return element;
	}
	
	/**
	 * #18
	 * driver
	 */
	
	public static WebElement SuccessMessage(WebDriver driver) {
		element = driver.findElement(By.cssSelector("li.success-msg > ul > li > span"));
		return element;
	}
	

}

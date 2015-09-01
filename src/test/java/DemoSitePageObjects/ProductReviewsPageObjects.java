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

public class ProductReviewsPageObjects {
	
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
	
	public static WebElement ProductReviewsTitle(WebDriver driver) {
		element = driver.findElement(By.cssSelector("strong"));
		return element;
	}

	/**
	 * #2
	 * driver
	 */
	
	public static WebElement ReviewExtraInfo(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.extra-info"));
		return element;
	}
	
	/**
	 * #3
	 * driver
	 */
	
	public static WebElement ProductReviewsFields(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.fieldset"));
		return element;
	}
	
	/**
	 * #4
	 * driver
	 */
	
	public static WebElement ValueOneStar(WebDriver driver) {
		element = driver.findElement(By.id("Value_1"));
		return element;
	}
	
	/**
	 * #5
	 * driver
	 */
	
	public static WebElement ValueTwoStar(WebDriver driver) {
		element = driver.findElement(By.id("Value_2"));
		return element;
	}
	
	/**
	 * #6
	 * driver
	 */
	
	public static WebElement ValueThreeStar(WebDriver driver) {
		element = driver.findElement(By.id("Value_3"));
		return element;
	}
	
	/**
	 * #7
	 * driver
	 */
	
	public static WebElement ValueFourStar(WebDriver driver) {
		element = driver.findElement(By.id("Value_4"));
		return element;
	}
	
	/**
	 * #8
	 * driver
	 */
	
	public static WebElement ValueFiveStar(WebDriver driver) {
		element = driver.findElement(By.id("Value_5"));
		return element;
	}

	/**
	 * #9
	 * driver
	 */
	
	public static WebElement QualityOneStar(WebDriver driver) {
		element = driver.findElement(By.id("Quality_1"));
		return element;
	}
	
	/**
	 * #10
	 * driver
	 */
	
	public static WebElement QualityTwoStar(WebDriver driver) {
		element = driver.findElement(By.id("Quality_2"));
		return element;
	}
	
	/**
	 * #11
	 * driver
	 */
	
	public static WebElement QualityThreeStar(WebDriver driver) {
		element = driver.findElement(By.id("Quality_3"));
		return element;
	}
	
	/**
	 * #12
	 * driver
	 */
	
	public static WebElement QualityFourStar(WebDriver driver) {
		element = driver.findElement(By.id("Quality_4"));
		return element;
	}
	
	/**
	 * #13
	 * driver
	 */
	
	public static WebElement QualityFiveStar(WebDriver driver) {
		element = driver.findElement(By.id("Quality_5"));
		return element;
	}
	
	/**
	 * #14
	 * driver
	 */
	
	public static WebElement PriceOneStar(WebDriver driver) {
		element = driver.findElement(By.id("Price_1"));
		return element;
	}
	
	/**
	 * #15
	 * driver
	 */
	
	public static WebElement PriceTwoStar(WebDriver driver) {
		element = driver.findElement(By.id("Price_2"));
		return element;
	}
	
	/**
	 * #16
	 * driver
	 */
	
	public static WebElement PriceThreeStar(WebDriver driver) {
		element = driver.findElement(By.id("Price_3"));
		return element;
	}
	
	/**
	 * #17
	 * driver
	 */
	
	public static WebElement PriceFourStar(WebDriver driver) {
		element = driver.findElement(By.id("Price_4"));
		return element;
	}
	
	/**
	 * #18
	 * driver
	 */
	
	public static WebElement PriceFiveStar(WebDriver driver) {
		element = driver.findElement(By.id("Price_5"));
		return element;
	}
	
	/**
	 * #19
	 * driver
	 */
	
	public static WebElement ReviewField(WebDriver driver) {
		element = driver.findElement(By.id("review_field"));
		return element;
	}
	
	/**
	 * #20
	 * driver
	 */
	
	public static WebElement SummaryField(WebDriver driver) {
		element = driver.findElement(By.id("summary_field"));
		return element;
	}
	
	/**
	 * #21
	 * driver
	 */
	
	public static WebElement NicknameField(WebDriver driver) {
		element = driver.findElement(By.id("nickname_field"));
		return element;
	}
	
	/**
	 * #22
	 * driver
	 */
	
	public static WebElement SubmitReviewButton(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.buttons-set > button.button"));
		return element;
	}
	
	/**
	 * #23
	 * driver
	 */
	
	public static WebElement ReviewRewardsMessage(WebDriver driver) {
		element = driver.findElement(By.cssSelector("div.reward-message.reward-review"));
		return element;
	}
	
	/**
	 * #24
	 * driver
	 */
	
	public static WebElement ReviewSuccessMessage(WebDriver driver) {
		element = driver.findElement(By.cssSelector("li.success-msg > ul > li"));
		return element;
	}
	
	
	
	
}

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




public class BundledProductPageObjects {
	private static WebElement element = null;
	protected static String title = null;
	protected static String price = null;
	private static int numberInt;
	protected static BigDecimal numberDecimal;
	private static DecimalFormat format = new DecimalFormat();
	private static DecimalFormatSymbols symbols = new DecimalFormatSymbols();

	
	
	/**
	 * #1
	 * driver
	 */
	
	public static WebElement From(WebDriver driver) {
		element = driver.findElement(By.cssSelector("p.price-from"));
		return element;
	}
	
	/**
	 * #2
	 * driver
	 */
	
	public static WebElement To(WebDriver driver) {
		element = driver.findElement(By.cssSelector("p.price-to"));
		return element;
	}
	
	/**
	 * #3
	 * driver
	 */
	
	public static WebElement PriceasConfigured(WebDriver driver) {
		element = driver.findElement(By.cssSelector("p.price-as-configured"));
		return element;
	}
	
	/**
	 * #4
	 * driver
	 */
	
	public static BigDecimal FromPrice(WebDriver driver) {
		title = driver.findElement(By.xpath("//p/span[2]")).getText().replaceAll("\\$", "");
		numberDecimal = new BigDecimal(title);
		return numberDecimal;
	}
	
	/**
	 * #5
	 * driver
	 */
	
	public static BigDecimal ToPrice(WebDriver driver) {
		title = driver.findElement(By.xpath("//p[2]/span[2]")).getText().replaceAll("\\$", "");
		numberDecimal = new BigDecimal(title);
		return numberDecimal;
	}
	
	/**
	 * #6
	 * driver
	 */
	
	public static BigDecimal ConfiguredPrice(WebDriver driver) {
		title = driver.findElement(By.xpath("//span[2]/span")).getText().replaceAll("\\$", "");
		numberDecimal = new BigDecimal(title);
		return numberDecimal;
	}
	
	/**
	 * #7
	 * driver
	 */
	
	public static WebElement FirstProductDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='product-options-wrapper']/dl/dd/div/select"));
		return element;
	}
	
	/**
	 * #8
	 * driver
	 */
	
	public static WebElement SecondProductDropdown(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='product-options-wrapper']/dl/dd[2]/div/select"));
		return element;
	}
	
	/**
	 * #9
	 * driver
	 */
	
	public static BigDecimal FirstProductDropdownOptionBD(WebDriver driver) {
		
		title = new Select(driver.findElement(By.xpath("//div[@id='product-options-wrapper']/dl/dd/div/select"))).getFirstSelectedOption().getText();
		
		String[] parts = title.split("\\$");
		price = parts[1];
		numberDecimal = new BigDecimal(price);
		
		return numberDecimal;
	}
	
	/**
	 * #10
	 * driver
	 */
	
	public static BigDecimal SecondProductDropdownOptionBD(WebDriver driver) {
		
		
		title = new Select(driver.findElement(By.xpath("//div[@id='product-options-wrapper']/dl/dd[2]/div/select"))).getFirstSelectedOption().getText();
		String[] parts = title.split("\\$");
		price = parts[1];
		numberDecimal = new BigDecimal(price);
		
		return numberDecimal;
	}
	
	/**
	 * #11
	 * driver
	 */
	
	public static WebElement FirstProductQuantityField(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='product-options-wrapper']/dl/dd/span[2]/input"));
		return element;
	}
	
	/**
	 * #12
	 * driver
	 */
	
	public static WebElement SecondProductQuantityField(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[@id='product-options-wrapper']/dl/dd[2]/span[2]/input"));
		return element;
	}
	
	/**
	 * #13
	 * driver
	 */
	
	public static BigDecimal FirstProductQuantityBD(WebDriver driver) {
		
		
		title = driver.findElement(By.xpath("//div[@id='product-options-wrapper']/dl/dd/span[2]/input")).getAttribute("value");
		
		numberDecimal = new BigDecimal(title);
		
		return numberDecimal;
	}
	
	/**
	 * #14
	 * driver
	 */
	
	public static BigDecimal SecondProductQuantityBD(WebDriver driver) {
		
		
		title = driver.findElement(By.xpath("//div[@id='product-options-wrapper']/dl/dd[2]/span[2]/input")).getAttribute("value");
		
		numberDecimal = new BigDecimal(title);
		
		return numberDecimal;
	}
	
	

}

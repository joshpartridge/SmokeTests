package DemoSitePageObjects;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPageObjects {
	
	private static WebElement element = null;
	protected static String title = null;
	protected static BigDecimal numberDecimal = null;
	private static DecimalFormat format = new DecimalFormat();
	private static DecimalFormatSymbols symbols = new DecimalFormatSymbols();
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement ShoppingCartTitle(WebDriver driver) {

		element = driver.findElement(By.cssSelector("h1"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement ProceedToCheckoutButton1(WebDriver driver) {

		element = driver.findElement(By.xpath("//li/button"));

		return element;
	}
	
	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement FirstProductImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td/a/img"));

		return element;
	}
	
	/**
	 * #4
	 * driver
	 *
	 */
	public static WebElement SecondProductImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[2]/td/a/img"));

		return element;
	}
	
	/**
	 * #5
	 * driver
	 *
	 */
	public static WebElement ThirdProductImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[3]/td/a/img"));

		return element;
	}
	
	/**
	 * #6
	 * driver
	 *
	 */
	public static WebElement FirstProductLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td[2]/h2/a"));

		return element;
	}
	
	/**
	 * #7
	 * driver
	 *
	 */
	public static WebElement SecondProductLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[2]/td[2]/h2/a"));

		return element;
	}
	
	/**
	 * #8
	 * driver
	 *
	 */
	public static WebElement ThirdProductLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[3]/td[2]/h2/a"));

		return element;
	}
	
	/**
	 * #9
	 * driver
	 *
	 */
	public static WebElement FirstProductPrice(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td[3]/span/span"));

		return element;
	}
	
	/**
	 * #10
	 * driver
	 *
	 */
	public static WebElement SecondProductPrice(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[2]/td[3]/span/span"));

		return element;
	}
	
	/**
	 * #11
	 * driver
	 *
	 */
	public static WebElement ThirdProductPrice(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[3]/td[3]/span/span"));

		return element;
	}
	
	/**
	 * #12
	 * driver
	 *
	 */
	public static WebElement FirstProductQuantityField(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td[4]/input"));

		return element;
	}
	
	/**
	 * #13
	 * driver
	 *
	 */
	public static WebElement SecondProductQuantityField(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[2]/td[4]/input"));

		return element;
	}
	
	/**
	 * #14
	 * driver
	 *
	 */
	public static WebElement ThirdProductQuantityField(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[3]/td[4]/input"));

		return element;
	}
	
	/**
	 * #15
	 * driver
	 *
	 */
	public static WebElement FirstProductUpdateButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td[4]/button"));

		return element;
	}
	
	/**
	 * #16
	 * driver
	 *
	 */
	public static WebElement SecondProductUpdateButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[2]/td[4]/button"));

		return element;
	}
	
	/**
	 * #17
	 * driver
	 *
	 */
	public static WebElement ThirdProductUpdateButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[3]/td[4]/button"));

		return element;
	}
	
	/**
	 * #18
	 * driver
	 *
	 */
	public static WebElement FirstProductEditLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td[4]/ul/li/a"));

		return element;
	}
	
	/**
	 * #19
	 * driver
	 *
	 */
	public static WebElement SecondProductEditLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[2]/td[4]/ul/li/a"));

		return element;
	}
	
	/**
	 * #20
	 * driver
	 *
	 */
	public static WebElement ThirdProductEditLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[3]/td[4]/ul/li/a"));

		return element;
	}
	
	/**
	 * #21
	 * driver
	 *
	 */
	public static WebElement FirstProductSubtotal(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td[5]/span/span"));

		return element;
	}
	
	/**
	 * #22
	 * driver
	 *
	 */
	public static WebElement SecondProductSubtotal(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[2]/td[5]/span/span"));

		return element;
	}
	
	/**
	 * #23
	 * driver
	 *
	 */
	public static WebElement ThirdProductSubtotal(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[3]/td[5]/span/span"));

		return element;
	}
	
	/**
	 * #24
	 * driver
	 *
	 */
	public static WebElement FirstProductRemove(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr/td[6]/a"));

		return element;
	}
	
	/**
	 * #25
	 * driver
	 *
	 */
	public static WebElement SecondProductRemove(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[2]/td[6]/a"));

		return element;
	}
	
	/**
	 * #26
	 * driver
	 *
	 */
	public static WebElement ThirdProductRemove(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tbody/tr[3]/td[6]/a"));

		return element;
	}
	
	/**
	 * #27
	 * driver
	 *
	 */
	public static WebElement Subtotal(WebDriver driver) {

		element = driver.findElement(By.cssSelector("td.a-right > span.price"));

		return element;
	}
	
	/**
	 * #28
	 * driver
	 *
	 */
	public static WebElement Tax(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-totals-table']/tbody/tr[2]/td[2]/span"));

		return element;
	}
	
	/**
	 * #29
	 * driver
	 *
	 */
	public static WebElement GrandTotal(WebDriver driver) {

		element = driver.findElement(By.cssSelector("strong > span.price"));

		return element;
	}
	
	/**
	 * #30
	 * driver
	 *
	 */
	public static WebElement ProceedToCheckoutButton2(WebDriver driver) {

		element = driver.findElement(By.xpath("xpath=(//button[@type='button'])[7]"));

		return element;
	}
	
	/**
	 * #31
	 * driver
	 *
	 */
	public static WebElement CheckoutWithMultipleAddressesLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("a[title=\"Checkout with Multiple Addresses\"]"));

		return element;
	}
	
	/**
	 * #32
	 * driver
	 *
	 */
	public static WebElement EmptyCartButton(WebDriver driver) {

		element = driver.findElement(By.id("empty_cart_button"));

		return element;
	}
	
	/**
	 * #33
	 * driver
	 *
	 */
	public static WebElement UpdateShoppingCartButtonButton(WebDriver driver) {

		element = driver.findElement(By.xpath("//table[@id='shopping-cart-table']/tfoot/tr/td/button[3]"));

		return element;
	}
	
	/**
	 * #34
	 * driver
	 *
	 */
	public static WebElement ContinueShoppingButton(WebDriver driver) {

		element = driver.findElement(By.cssSelector("button.button2.btn-continue"));

		return element;
	}
	
	/**
	 * #35
	 * driver
	 *
	 */
	public static WebElement EmptyCartTitle(WebDriver driver) {

		element = driver.findElement(By.cssSelector("h1"));

		return element;
	}
	
	/**
	 * #36
	 * driver
	 *
	 */
	public static WebElement EmptyCartMessage(WebDriver driver) {

		element = driver.findElement(By.cssSelector("div.cart-empty > p"));

		return element;
	}
	
	/**
	 * #37
	 * driver
	 *
	 */
	public static WebElement EmptyContinueShoppingLink(WebDriver driver) {

		element = driver.findElement(By.linkText("here"));

		return element;
	}
	
	/**
	 * #38
	 * driver
	 */
	
	public static BigDecimal FirstProductPriceBD(WebDriver driver) {
		title = FirstProductPrice(driver).getText().replaceAll("\\$", "").replaceAll("\\,", "");
		numberDecimal = new BigDecimal(title);
		return numberDecimal;
	}
	
	/**
	 * #39
	 * driver
	 */
	
	public static BigDecimal SecondProductPriceBD(WebDriver driver) {
		title = SecondProductPrice(driver).getText().replaceAll("\\$", "").replaceAll("\\,", "");
		numberDecimal = new BigDecimal(title);
		return numberDecimal;
	}
	
	/**
	 * #40
	 * driver
	 */
	
	public static BigDecimal ThirdProductPriceBD(WebDriver driver) {
		title = ThirdProductPrice(driver).getText().replaceAll("\\$", "").replaceAll("\\,", "");
		numberDecimal = new BigDecimal(title);
		return numberDecimal;
	}
	
	/**
	 * #41
	 * driver
	 */
	
	public static BigDecimal FirstProductSubtotalBD(WebDriver driver) {
		title = FirstProductSubtotal(driver).getText().replaceAll("\\$", "").replaceAll("\\,", "");
		numberDecimal = new BigDecimal(title);
		return numberDecimal;
	}
	
	/**
	 * #42
	 * driver
	 */
	
	public static BigDecimal SecondProductSubtotalBD(WebDriver driver) {
		title = SecondProductSubtotal(driver).getText().replaceAll("\\$", "").replaceAll("\\,", "");
		numberDecimal = new BigDecimal(title);
		return numberDecimal;
	}
	
	/**
	 * #41
	 * driver
	 */
	
	public static BigDecimal ThirdProductSubtotalBD(WebDriver driver) {
		title = ThirdProductSubtotal(driver).getText().replaceAll("\\$", "").replaceAll("\\,", "");
		numberDecimal = new BigDecimal(title);
		return numberDecimal;
	}
	
	/**
	 * #42
	 * driver
	 */
	
	public static BigDecimal TaxBD(WebDriver driver) {
		title = Tax(driver).getText().replaceAll("\\$", "").replaceAll("\\,", "");
		numberDecimal = new BigDecimal(title);
		return numberDecimal;
	}
	
	/**
	 * #43
	 * driver
	 */
	
	public static BigDecimal SubtotalBD(WebDriver driver) {
		title = Subtotal(driver).getText().replaceAll("\\$", "").replaceAll("\\,", "");
		numberDecimal = new BigDecimal(title);
		return numberDecimal;
	}
	
	/**
	 * #44
	 * driver
	 */
	
	public static BigDecimal GrandTotalBD(WebDriver driver) {
		title = GrandTotal(driver).getText().replaceAll("\\$", "").replaceAll("\\,", "");
		numberDecimal = new BigDecimal(title);
		return numberDecimal;
	}
	

}

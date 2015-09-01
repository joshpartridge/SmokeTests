package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MiniCartObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement FirstProductImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//ul[@id='cart-sidebar']/li/a/img"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement SecondProductImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//ul[@id='cart-sidebar']/li[2]/a/img"));

		return element;
	}
	
	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement ThirdProductImage(WebDriver driver) {

		element = driver.findElement(By.xpath("//ul[@id='cart-sidebar']/li[3]/a/img"));

		return element;
	}
	
	/**
	 * #4
	 * driver
	 *
	 */
	public static WebElement FirstProductLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//ul[@id='cart-sidebar']/li/div/p/a"));

		return element;
	}
	
	/**
	 * #5
	 * driver
	 *
	 */
	public static WebElement SecondProductLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//ul[@id='cart-sidebar']/li[2]/div/p/a"));

		return element;
	}
	
	/**
	 * #6
	 * driver
	 *
	 */
	public static WebElement ThirdProductLink(WebDriver driver) {

		element = driver.findElement(By.xpath("//ul[@id='cart-sidebar']/li[3]/div/p/a"));

		return element;
	}
	
	/**
	 * #7
	 * driver
	 *
	 */
	public static WebElement CheckoutButton(WebDriver driver) {

		element = driver.findElement(By.cssSelector("a.button.checkout-button"));

		return element;
	}
	
	/**
	 * #8
	 * driver
	 *
	 */
	public static WebElement ViewShoppingCartLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("a.cart-link"));

		return element;
	}
	
	/**
	 * #9
	 * driver
	 *
	 */
	public static WebElement CloseLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("a.close.skip-link-close"));

		return element;
	}
	
	/**
	 * #10
	 * driver
	 *
	 */
	public static WebElement EmptyMessage(WebDriver driver) {

		element = driver.findElement(By.cssSelector("p.empty"));

		return element;
	}
	
	/**
	 * #11
	 * driver
	 *
	 */
	public static WebElement FirstProductsEditLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li.item.odd > div.product-details > a.btn-edit"));

		return element;
	}
	
	/**
	 * #12
	 * driver
	 *
	 */
	public static WebElement FirstProductsRemoveLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li.item.odd > div.product-details > a.remove"));

		return element;
	}
	
	/**
	 * #13
	 * driver
	 *
	 */
	public static WebElement SecondProductsEditLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li.item.even > div.product-details > a.btn-edit"));

		return element;
	}
	
	/**
	 * #14
	 * driver
	 *
	 */
	public static WebElement SecondProductsRemoveLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li.item.even > div.product-details > a.remove"));

		return element;
	}
	
	/**
	 * #15
	 * driver
	 *
	 */
	public static WebElement ThirdProductsEditLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li.item.last.odd > div.product-details > a.btn-edit"));

		return element;
	}
	
	/**
	 * #16
	 * driver
	 *
	 */
	public static WebElement ThirdProductsRemoveLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("li.item.last.odd > div.product-details > a.remove"));

		return element;
	}
	
	/**
	 * #17
	 * driver
	 *
	 */
	public static String FirstProductTitle(WebDriver driver) {

		title = driver.findElement(By.cssSelector("li.item.odd > div.product-details > p.product-name")).getText();

		return title;
	}
	
	/**
	 * #18
	 * driver
	 *
	 */
	public static String SecondProductTitle(WebDriver driver) {

		title = driver.findElement(By.cssSelector("li.item.even > div.product-details > p.product-name")).getText();

		return title;
	}
	
	/**
	 * #19
	 * driver
	 *
	 */
	public static String ThirdProductTitle(WebDriver driver) {

		title = driver.findElement(By.cssSelector("li.item.last.odd > div.product-details > p.product-name")).getText();

		return title;
	}
	
	
	/**
	 * #20
	 * driver
	 *
	 */
	public static WebElement UpdateCartProductPageButton(WebDriver driver) {

		element = driver.findElement(By.cssSelector("div.add-to-cart-buttons > button.button.btn-cart"));

		return element;
	}

}

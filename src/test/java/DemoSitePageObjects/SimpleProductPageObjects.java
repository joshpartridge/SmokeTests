package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimpleProductPageObjects {
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement QuantityField(WebDriver driver) {

		element = driver.findElement(By.id("qty"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement UpdateCartButton(WebDriver driver) {

		element = driver.findElement(By.cssSelector("div.add-to-cart-buttons > button.button.btn-cart"));

		return element;
	}
	


/**
 * #3
 * driver
 *
 */
public static WebElement HomeLink(WebDriver driver) {

	element = driver.findElement(By.linkText("Home"));

	return element;
}

/**
 * #4
 * driver
 *
 */
public static WebElement CategoryLink(WebDriver driver) {

	element = driver.findElement(By.xpath("//div[3]/div/div/ul/li[2]/a"));

	return element;
}

/**
 * #5
 * driver
 *
 */
public static WebElement SubCategoryLink(WebDriver driver) {

	element = driver.findElement(By.xpath("//div[3]/div/div/ul/li[3]/a"));

	return element;
}

/**
 * #6
 * driver
 *
 */
public static String ProductTitle1(WebDriver driver) {

	title = driver.findElement(By.cssSelector("strong")).getText();

	return title;
}

/**
 * #7
 * driver
 *
 */
public static String ProductTitle2(WebDriver driver) {

	title = driver.findElement(By.cssSelector("span.h1")).getText();

	return title;
}



/**
* #8
* driver
*
*/
public static String Price(WebDriver driver) {

title = driver.findElement(By.cssSelector("span.price")).getText();

return title;
}

/**
* #9
* driver
*
*/
public static WebElement AddToCartButton(WebDriver driver) {

element = driver.findElement(By.cssSelector("div.add-to-cart-buttons > button.button.btn-cart"));

return element;
}

/**
* #10
* driver
*
*/
public static WebElement Availibility(WebDriver driver) {

element = driver.findElement(By.cssSelector("span.value"));

return element;
}

/**
* #11
* driver
*
*/
public static WebElement AddtoCartSuccessMessage(WebDriver driver) {

element = driver.findElement(By.cssSelector("li.success-msg > ul > li > span"));

return element;
}

/**
* #12
* driver
*
*/
public static WebElement ProductTitle(WebDriver driver) {

element = driver.findElement(By.cssSelector("strong"));

return element;
}

/**
* #13
* driver
*
*/
public static WebElement ProductPrice(WebDriver driver) {

element = driver.findElement(By.cssSelector("span.price"));

return element;
}



}

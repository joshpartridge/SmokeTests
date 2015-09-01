package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MyOrdersPageObjects {
	
	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 *
	 */
	public static WebElement Header(WebDriver driver) {

		element = driver.findElement(By.cssSelector("h1"));

		return element;
	}
	
	/**
	 * #2
	 * driver
	 *
	 */
	public static WebElement NoOrdersMessage(WebDriver driver) {

		element = driver.findElement(By.cssSelector("div.my-account > p"));

		return element;
	}
	
	/**
	 * #3
	 * driver
	 *
	 */
	public static WebElement BackLink(WebDriver driver) {

		element = driver.findElement(By.cssSelector("p.back-link > a"));

		return element;
	}

}

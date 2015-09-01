package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdvancedSearchResultsPageObjects {
	
	private static WebElement element = null;

	/**
	 * #1
	 * driver
	 */
	
	public static WebElement Header(WebDriver driver) {
		element = driver.findElement(By.cssSelector("h1"));
		return element;
	}

	/**
	 * #2
	 * driver
	 */
	
	public static WebElement NoResultsErrorMessage(WebDriver driver) {
		element = driver.findElement(By.cssSelector("p.error-msg"));
		return element;
	}
	
	/**
	 * #3
	 * driver
	 */
	
	public static WebElement NoResultsModifyYourSearchLink(WebDriver driver) {
		element = driver.findElement(By.cssSelector("p.error-msg > a"));
		return element;
	}
	
	/**
	 * #4
	 * driver
	 */
	
	public static WebElement FirstProductImage(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[5]/ul/li/a/img"));
		return element;
	}
	
	/**
	 * #5
	 * driver
	 */
	
	public static WebElement FirstProductLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//h2/a"));
		return element;
	}
	
	/**
	 * #6
	 * driver
	 */
	
	public static WebElement FirstProductAddtoCartButton(WebDriver driver) {
		element = driver.findElement(By.xpath("//div[2]/button"));
		return element;
	}
	
	


}

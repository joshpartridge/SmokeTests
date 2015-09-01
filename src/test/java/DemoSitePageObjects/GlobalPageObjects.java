package DemoSitePageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GlobalPageObjects {

	private static WebElement element = null;
	private static String title = null;
	
	/**
	 * #1
	 * driver
	 */
	
	public static WebElement HomeLogo(WebDriver driver) {
		element = driver.findElement(By.xpath("//header[@id='header']/div/a/img"));
		return element;
		
	}
	
	/**
	 * #2
	 * driver
	 */
	
	public static WebElement SearchBox(WebDriver driver) {
		element = driver.findElement(By.id("search"));
		return element;
		
	}
	
	/**
	 * #3
	 * driver
	 */
	
	public static WebElement MagnifyingGlass(WebDriver driver) {
		element = driver.findElement(By.xpath("//form[@id='search_mini_form']/div/button"));
		return element;
		
	}
	
	/**
	 * #4
	 * driver
	 */
	
	public static WebElement AccountLink(WebDriver driver) {
		element = driver.findElement(By.cssSelector("a.skip-link.skip-account"));
		return element;
		
	}
	
	/**
	 * #5
	 * driver
	 */
	
	public static WebElement CartLink(WebDriver driver) {
		element = driver.findElement(By.xpath("//header[@id='header']/div/div[2]/div/div/a"));
		return element;
		
	}
	
	/**
	 * #6
	 * driver
	 */
	
	public static String PageTitle(WebDriver driver) {
		title = driver.getTitle();
		return title;
		
	}
	
	/**
	 * #7
	 * driver
	 */
	
	public static WebElement CartCount(WebDriver driver) {
		element = driver.findElement(By.cssSelector("span.count"));
		return element;
		
	}
	
	/**
	 * #8
	 * driver
	 */
	
	public static WebElement WelcomeMessage(WebDriver driver) {
		element = driver.findElement(By.cssSelector("p.welcome-msg"));
		return element;
		
	}
	
	/**
	 * #9
	 * driver
	 */
	
	public static WebElement Header(WebDriver driver) {
		element = driver.findElement(By.cssSelector("h1"));
		return element;
		
	}
	
	/**
	 * #10
	 * driver
	 */
	
	public static WebElement LastCategoryTitle(WebDriver driver) {
		element = driver.findElement(By.cssSelector("strong"));
		return element;
		
	}

	
	
}
